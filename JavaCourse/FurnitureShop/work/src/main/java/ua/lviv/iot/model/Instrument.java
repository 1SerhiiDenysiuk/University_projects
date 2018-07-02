package ua.lviv.iot.model;


import javax.persistence.*;

@Entity
public class Instrument {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "instrument_id")
    private int id;
    @Column(name = "instrument_name")
    private String name;
    private Firm firm;
    private FurnitureType furnitureType;

    public Instrument() {

    }

    public Instrument(final String name, final Firm firm,
                      final FurnitureType furnitureType) {
        this.name = name;
        this.firm = firm;
        this.furnitureType = furnitureType;
    }


    public final Firm getFirm() {
        return firm;
    }

    public final void setFirm(final Firm firm) {
        this.firm = firm;
    }

    public final FurnitureType getFurnitureType() {
        return furnitureType;
    }

    public final void setFurnitureType(final FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public String toString() {
        return "name " + name + " " + "firm "
                + firm + " " + "Furnituretype: " + furnitureType;

    }

    public String Headers(){
        return "name, firm, furnitureType";
    }

    public String toCSV(){
        return name+", "+firm.toString()+", "+furnitureType.toString();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
