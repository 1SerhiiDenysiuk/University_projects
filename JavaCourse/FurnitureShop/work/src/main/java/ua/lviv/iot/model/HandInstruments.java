package ua.lviv.iot.model;

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


    public final String getHeaders(){
        return super.Headers()+", toMakeAShape\n";
    }

    public final String toCSV(){
        return super.toCSV()+", "+toMakeAShape+"\n";
    }

}
