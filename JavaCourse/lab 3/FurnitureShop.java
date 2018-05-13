package lab3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class FurnitureShop {
	 private String name;
	 private double area;
	 private List<Instrument> instrumentList=new LinkedList();
	
	

	    public FurnitureShop() {}

	    public FurnitureShop ( String name, double area){
	        this.area=area;
	        this.name=name;
	    }

	    public void addInstrument(Instrument addInstrument) {
	    	instrumentList.add(addInstrument);
	    }
	    public List<Instrument> sortByFirm(List<Instrument> list) {
	        list.sort((Instrument instrument1, Instrument instrument2)->instrument2.getFirm().compareTo(instrument1.getFirm()));
	        return list;
	    }
	    
	    public List<Instrument> searchInstrumentByAppointment(FurnitureType furnitureType) {
	        List<Instrument> searchList = new LinkedList<>();
	        for (Instrument instrument : instrumentList) {
	            if (instrument.getFurnitureType().equals(furnitureType)){
	                searchList.add(instrument);
	            }
	        }
	        return searchList;
	    }
	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getArea() {
	        return area;
	    }

	    public void setArea(double area) {
	        this.area = area;
	    }   
	    
	    public List<Instrument> getInstrumentList() {
	        return instrumentList;
	    }

	    public void setInstrumentList (List<Instrument> instrumentList) {
	        this.instrumentList = instrumentList;
	    }
}



