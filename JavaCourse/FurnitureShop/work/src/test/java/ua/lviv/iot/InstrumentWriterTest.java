
package ua.lviv.iot;

import junit.framework.TestCase;
import ua.lviv.iot.model.*;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class InstrumentWriterTest extends TestCase {

    public void testWriteToFile() {
        List<Instrument> list=new ArrayList<>();
        list.add(new HandInstruments("hello", Firm.Bosh,FurnitureType.armchair,"dfgdfg"));
        list.add(new MeasuringInstruments("hello", Firm.Bosh,FurnitureType.armchair,26.5));
        InstrumentWriter writer=new InstrumentWriter();
        writer.writeToFile(list);
    }
}