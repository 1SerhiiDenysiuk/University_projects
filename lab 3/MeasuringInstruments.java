package lab3;

public class MeasuringInstruments extends Instrument {

	private double measureDistance;

	public MeasuringInstruments() {
		super();
	}
	
	public MeasuringInstruments(String name, Firm firm , FurnitureType furnitureType, double measureInstrument) {
		super(name, firm, furnitureType);
		this.measureDistance=measureDistance;
	
	}
	
	@Override
	public String toString() {
		return "MeasuringInstruments [measureDistance=" + measureDistance + ", toString()=" + super.toString() + "]";
	}

	public double getMeasureDistance() {
		return measureDistance;
	}

	public void setMeasureDistance(double measureDistance) {
		this.measureDistance = measureDistance;
	}
}
