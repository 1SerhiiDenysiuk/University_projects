package iot.lviv.ua;

import java.util.LinkedList;
import java.util.List;

public class FurnitureShop {
    private String name;
    private double area;
    private List<Instrument> instrumentList = new LinkedList();


    public FurnitureShop() {
    }

    public FurnitureShop(final String name, final double area) {
        this.area = area;
        this.name = name;
    }

    public final void addInstrument(final Instrument addInstrument) {
        instrumentList.add(addInstrument);
    }

    public final List<Instrument> sortByFirm(final List<Instrument> list) {
        list.sort((Instrument instrument1, Instrument instrument2)
                -> instrument2.getFirm().compareTo(instrument1.getFirm()));
        return list;
    }

    public final List<Instrument> searchInstrumentByAppointment(
            final FurnitureType furnitureType) {
        List<Instrument> searchList = new LinkedList<>();
        for (Instrument instrument : instrumentList) {
            if (instrument.getFurnitureType().equals(furnitureType)) {
                searchList.add(instrument);
            }
        }
        return searchList;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final double getArea() {
        return area;
    }

    public final void setArea(final double area) {
        this.area = area;
    }

    public final List<Instrument> getInstrumentList() {
        return instrumentList;
    }

    public final void setInstrumentList(final List<Instrument>
                                                instrumentList) {
        this.instrumentList = instrumentList;
    }
}



