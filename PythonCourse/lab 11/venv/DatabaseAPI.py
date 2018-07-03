import configparser
from flask_sqlalchemy import SQLAlchemy
from flask import Flask, jsonify, request

application = Flask(__name__)

config = configparser.ConfigParser()
config.read('goods_db.config')

application.config['SQLALCHEMY_DATABASE_URI']='mysql+mysqlconnector://root:root@127.0.0.1:3306/iot-test-db'

application.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = True

mysql = SQLAlchemy()
mysql.init_app(application)


class Goods(mysql.Model):
    __tablename__ = 'seryi'
    id = mysql.Column(mysql.Integer, primary_key=True)
    name = mysql.Column(mysql.String, nullable=False)
    firm = mysql.Column(mysql.String, nullable=False)
    type = mysql.Column(mysql.String, nullable=False)

    def __repr__(self):
        return '<Goods (%s, %s) >' % (self.name, self.firm)


@application.route("/")
def hello():
    return "Hello World!"


@application.route('/good', methods=['POST'])
def create_good():
    id = request.get_json()["id"]
    name = request.get_json()["name"]
    firm = request.get_json()["firm"]
    type = request.get_json()["type"]

    curr_session = mysql.session

    good = Goods(id=id,  name=name, firm=firm, type=type)
    try:
        curr_session.add(good)
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    #good_id = good.id
    data = Goods.query.filter_by(id=good.id).first()

    #config.read('goods_db.config')
    print (data)
    result = [" Good"]

    return "good"



@application.route('/good', methods=['GET'])
def get_good():
    data = Goods.query.all()

    data_all = []

    for good in data:
        data_all.append([good.id, good.name, good.firm, good.type])

    return jsonify(goods=data_all)


@application.route('/good', methods=['PATCH'])
def update_good():
    global good
    good_id = request.get_json()["id"]
    firm = request.get_json()["firm"]
    name = request.get_json()["name"]
    type = request.get_json()["type"]
    curr_session = mysql.session

    try:
        good = Goods.query.filter_by(id=good_id).first()
        good.firm = firm
        good.name = name
        good.type=type
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    good_id = good.id
    data = Goods.query.filter_by(id=good_id).first()

    config.read('goods_db.config')

    result = [data.name, data.firm, data.type]

    return jsonify(session=result)


@application.route('/good/<int:good_id>', methods=['DELETE'])
def delete_good(good_id):
    curr_session = mysql.session

    Goods.query.filter_by(id=good_id).delete()
    curr_session.commit()
    return get_good()


if __name__ == "__main__":
    application.run(debug=True)