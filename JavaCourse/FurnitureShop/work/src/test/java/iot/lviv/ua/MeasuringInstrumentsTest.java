package iot.lviv.ua;

import junit.framework.TestCase;

public class MeasuringInstrumentsTest extends TestCase {
    MeasuringInstruments instruments=new MeasuringInstruments();

    public void testConstructorWithParams(){
        MeasuringInstruments instruments1=new MeasuringInstruments("hello",Firm.Bosh, FurnitureType.bed,65);
        assertEquals(instruments1.getName(), "hello");
    }

    public void testToString() throws Exception {
        instruments.setMeasureDistance(88);
        assertEquals( "MeasuringInstruments [measureDistance="
                + "88.0" + ", toString()=" + "name " + "null" + " " + "firm "
                + "null" + " " + "Furnituretype: " + "null", instruments.toString());
    }

    public void testSetMeasureDistance() throws Exception {
        instruments.setMeasureDistance(89);
        assertEquals(89.0,instruments.getMeasureDistance());
    }

}