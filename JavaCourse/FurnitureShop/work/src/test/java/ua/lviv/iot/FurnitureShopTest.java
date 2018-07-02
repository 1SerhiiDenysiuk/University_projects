package ua.lviv.iot;

import junit.framework.TestCase;
import ua.lviv.iot.model.*;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShopTest extends TestCase {
    FurnitureShop furnitureShop=new FurnitureShop();

    public void testConstructorWithParams(){
        FurnitureShop shop=new FurnitureShop("hello", 667);
        assertTrue(shop.getName().equals("hello"));
        assertTrue(shop.getArea()==667);
    }

    public void testAddInstrument() throws Exception {
        furnitureShop.addInstrument(new MeasuringInstruments("hello", Firm.Bosh, FurnitureType.bed, 56));
        assertTrue(furnitureShop.getInstrumentList().get(0).getName().equals("hello"));
    }

    public void testSortByFirm() throws Exception {
        furnitureShop.addInstrument(new MeasuringInstruments("hello", Firm.TMForce, FurnitureType.bed, 56));
        furnitureShop.addInstrument(new MeasuringInstruments("hello", Firm.Bosh, FurnitureType.bed, 56));
        furnitureShop.addInstrument(new MeasuringInstruments("hello", Firm.TMMatrix, FurnitureType.bed, 56));
        List<Instrument>list=furnitureShop.sortByFirm(furnitureShop.getInstrumentList());
        assertTrue(list.get(0).getFirm().equals(Firm.Bosh));
        assertTrue(list.get(1).getFirm().equals(Firm.TMMatrix));
        assertTrue(list.get(2).getFirm().equals(Firm.TMForce));


    }

    public void testSearchInstrumentByAppointment() throws Exception {
        furnitureShop.addInstrument(new MeasuringInstruments("hello",
                Firm.TMForce, FurnitureType.bed, 56));
        furnitureShop.addInstrument(new MeasuringInstruments("hello",
                Firm.Bosh, FurnitureType.sofa, 56));
        furnitureShop.addInstrument(new MeasuringInstruments("hello",
                Firm.TMMatrix, FurnitureType.armchair, 56));
        assertTrue(furnitureShop.searchInstrumentByAppointment(FurnitureType.bed)
                .size()==1);
        assertTrue(furnitureShop.searchInstrumentByAppointment(FurnitureType.bed).get(0)
                .getFurnitureType().equals(FurnitureType.bed));
    }

    public void testSetName() throws Exception {
        furnitureShop.setName("hello");
        assertTrue("hello".equals(furnitureShop.getName()));
    }

    public void testSetArea() throws Exception {
        furnitureShop.setArea(65.0);
        assertTrue(65.0==furnitureShop.getArea());
    }

    public void testSetInstrumentList() throws Exception {
        List<Instrument> list=new ArrayList<>();
        list.add(new MeasuringInstruments("hello", Firm.Bosh, FurnitureType.bed, 56));
        furnitureShop.setInstrumentList(list);
        assertTrue(furnitureShop.getInstrumentList().get(0).getName().equals("hello"));
        assertTrue(furnitureShop.getInstrumentList().get(0).getFirm().equals(Firm.Bosh));
    }

}