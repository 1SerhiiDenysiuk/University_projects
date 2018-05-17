package iot.lviv.ua;

public class MeasuringInstruments extends Instrument {

    private double measureDistance;

    public MeasuringInstruments() {
        super();
    }

    public MeasuringInstruments(final String name, final Firm firm,
                                final FurnitureType furnitureType,
                                final double measureInstrument) {
        super(name, firm, furnitureType);
        this.measureDistance = measureDistance;

    }

    @Override
    public final String toString() {
        return "MeasuringInstruments [measureDistance="
                + measureDistance + ", toString()=" + super.toString() ;
    }

    public final double getMeasureDistance() {
        return measureDistance;
    }

    public final void setMeasureDistance(final double measureDistance) {
        this.measureDistance = measureDistance;
    }
}
