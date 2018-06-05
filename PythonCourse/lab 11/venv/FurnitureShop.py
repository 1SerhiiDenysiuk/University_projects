from Instrument import MeasuringInstrument
from Instrument import HandInstrument
from Instrument import Instrument


class FurnitureShop:
    def __init__(self, name="name", area=0, list_instruments=[]):
        self.name = name
        self.area = area
        self.list_instruments = list_instruments

    def add_instrument(self, instrument):
        self.list_instruments.append(instrument)

    def search_Instrument_By_Appointment(self, furniture_type):
        result = []
        for instrument in self.list_instruments:
            if instrument.furniture_type == furniture_type:
                result.append(instrument)
        return result

    def sort_by_firm(self):
        return sorted(self.list_instruments, key=lambda instrument: str(instrument.firm))
