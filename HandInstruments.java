package lab3;

public class HandInstruments extends Instrument{
	private String toMakeAShape;
	
	public HandInstruments() {
		super();
	}
	
	public HandInstruments(String name, Firm firm, FurnitureType furnitureType, String toMakeAShape) {
		super(name, firm, furnitureType);
		this.toMakeAShape=toMakeAShape;
	}

	public String getToMakeAShape() {
		return toMakeAShape;
	}

	public void setToMakeAShape(String toMakeAShape) {
		this.toMakeAShape = toMakeAShape;
	}

	@Override
	public String toString() {
		return "HandInstruments [toMakeAShape=" + toMakeAShape + "," + super.toString() + "]";
	}

}
