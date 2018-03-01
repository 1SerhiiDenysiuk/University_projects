package lab3;

public class Instrument {

    private String name;
	private Firm firm;
    private FurnitureType furnitureType;
    
    public Instrument() {
    	
    }
    
    public Instrument(String name, Firm firm, FurnitureType furnitureType) {
    	this.name=name;
    	this.firm=firm;
    	this.furnitureType=furnitureType;
    }
    
    
    public Firm getFirm() {
		return firm;
	}

	public void setFirm(Firm firm) {
		this.firm = firm;
	}

	public FurnitureType getFurnitureType() {
		return furnitureType;
	}

	public void setFurnitureType(FurnitureType furnitureType) {
		this.furnitureType = furnitureType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "name "+name+" "+"firm "+firm+" "+"Furnituretype: "+ furnitureType;
		
	}


}
