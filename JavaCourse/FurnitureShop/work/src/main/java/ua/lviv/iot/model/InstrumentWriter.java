package ua.lviv.iot.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class InstrumentWriter {
    public void writeToFile(List<Instrument> list){
        try {
            FileWriter fileWriter=new FileWriter("instrument.txt");
            for (Instrument instrument:list){
                fileWriter.write(instrument.Headers());
                fileWriter.write(instrument.toCSV());
            }
            fileWriter.close();
        }catch (IOException e){

        }

    }
}
