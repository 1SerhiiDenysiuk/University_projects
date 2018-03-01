package lab3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FurnitureShop furnitureShop=new FurnitureShop("shop", 65.25);
		furnitureShop.addInstrument(new HandInstruments("hammer", Firm.TMMatrix, FurnitureType.armchair,"Shape"));
		furnitureShop.addInstrument(new MeasuringInstruments("ruler", Firm.Bosh, FurnitureType.bed,150));
		furnitureShop.addInstrument(new HandInstruments("screwdriver", Firm.TMMatrix, FurnitureType.armchair,"Shape"));
		furnitureShop.addInstrument(new HandInstruments("wrench", Firm.Bosh, FurnitureType.bed,"Shape"));
		furnitureShop.addInstrument(new HandInstruments("tape measure", Firm.TMForce, FurnitureType.bed,"Shape"));
		
		 boolean menu = true;
	        while (menu) {
	        	System.out.println("Menu:");
	        	System.out.println(" 1 - Print list of instruments;");
	            System.out.println(" 2 - Search by appointment;");
	            System.out.println(" 3 - Print list of instruments sorted by firm;");
	            System.out.println(" 4 - Exit;");
	            Scanner in = new Scanner(System.in);
	            int num = in.nextInt();
	            switch(num) {
	            case 1:{
	            	furnitureShop.getInstrumentList().forEach((Instrument instrument)->System.out.println(instrument.toString()));
	            	break;
	            }
	            case 2:{
	            	System.out.println("for armchair we need: ");
	            	furnitureShop.searchInstrumentByAppointment(FurnitureType.armchair).forEach((Instrument instrument)->System.out.println(instrument.getName()));
	            	System.out.println("for bed we need: ");
	            	furnitureShop.searchInstrumentByAppointment(FurnitureType.bed).forEach((Instrument instrument)->System.out.println(instrument.getName()));
	                break;
	            }
	            case 3:{
	            	furnitureShop.sortByFirm(furnitureShop.getInstrumentList());
	            	furnitureShop.getInstrumentList().forEach((Instrument instrument)->System.out.println(instrument));
	            	break;
	            } 
	            case 4:{
                    System.out.println("Exited programm");
                    menu = false;
                    break;
	            }
	        }

	}

}
}
