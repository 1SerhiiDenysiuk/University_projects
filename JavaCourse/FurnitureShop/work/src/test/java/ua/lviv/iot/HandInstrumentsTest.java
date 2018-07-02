package ua.lviv.iot;

import junit.framework.TestCase;
import ua.lviv.iot.model.*;


public class HandInstrumentsTest extends TestCase {
    HandInstruments instruments = new HandInstruments();

    public void testConstructorWithParams() throws Exception {
        HandInstruments instruments1 = new HandInstruments("HELLO", Firm.Bosh, FurnitureType.bed, "hello");
        assertTrue(instruments1.getName().equals("HELLO"));
        assertTrue(instruments1.getFirm().equals(Firm.Bosh));
    }

    public void testSetToMakeAShape() throws Exception {
        instruments.setToMakeAShape("hello");
        assertTrue(instruments.getToMakeAShape().equals("hello"));
    }

    public void testToString() throws Exception {
        instruments.setToMakeAShape("hello");

        assertEquals(instruments.toString(), "HandInstruments toMakeAShape="
                + "hello" + "," + "name " + "null" + " " + "firm " + "null"
                + " " + "Furnituretype: " + "null");
    }

}