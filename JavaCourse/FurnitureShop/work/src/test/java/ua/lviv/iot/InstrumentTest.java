package ua.lviv.iot;

import junit.framework.TestCase;
import ua.lviv.iot.model.*;

import static ua.lviv.iot.model.Firm.Bosh;
import static ua.lviv.iot.model.FurnitureType.sofa;


public class InstrumentTest extends TestCase {
    Instrument instrument = new Instrument();
    public void TestConstructor(){
        Instrument instrument1 = new Instrument("hello", Bosh,FurnitureType.bed);
        assertEquals(instrument1.getName(), "hello");
    }

    public void testSetFirm() throws Exception {
        instrument.setFirm(Bosh);
        assertEquals(instrument.getFirm(), Bosh);

    }

    public void testSetFurnitureType() throws Exception {
        instrument.setFurnitureType(sofa);
        assertEquals(instrument.getFurnitureType(),sofa);
    }

    public void testSetName() throws Exception {
        instrument.setName("hello");
        assertEquals(instrument.getName(),"hello");
    }

}