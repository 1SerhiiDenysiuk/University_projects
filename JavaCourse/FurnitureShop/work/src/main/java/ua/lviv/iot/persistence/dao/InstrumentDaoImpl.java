package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Instrument;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

    @Named
    @Dependent
    public class InstrumentDaoImpl extends AbstractDao<Instrument> implements InstrumentDao, Serializable {

        private static final long serialVersionUID = 1L;

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        protected Class<Instrument> getEntityClass() {
            return Instrument.class;
        }

        //@Resource
        //private UserTransaction userTransaction;

    }


