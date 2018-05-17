package iot.lviv.ua;

public class Instrument {

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


}
