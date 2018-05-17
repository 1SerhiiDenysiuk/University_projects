package iot.lviv.ua;

public class HandInstruments extends Instrument {
    private String toMakeAShape;

    public HandInstruments() {
        super();
    }

    public HandInstruments(final String name, final Firm firm,
                          final FurnitureType furnitureType,
                           final String toMakeAShape) {
        super(name, firm, furnitureType);
        this.toMakeAShape = toMakeAShape;
    }

    public final String getToMakeAShape() {
        return toMakeAShape;
    }

    public final void setToMakeAShape(final String toMakeAShape) {
        this.toMakeAShape = toMakeAShape;
    }

    @Override
    public String toString() {
        return "HandInstruments toMakeAShape="
                + toMakeAShape + "," + super.toString() ;
    }

}
