from Enum import Firm
from Enum import FurnitureType


class Instrument:
    def __init__(self, name="no_name", firm=Firm.BOSH, furniture_type=FurnitureType.ARMCHAIR):
        self.name = name
        self.firm = firm
        self.furniture_type = furniture_type


class MeasuringInstrument(Instrument):
    def __init__(self, name="no_name", firm=Firm.BOSH, furniture_type=FurnitureType.ARMCHAIR, measuring_distance=0):
        Instrument.__init__(self, name, firm, furniture_type)
        self.measuring_distance = measuring_distance


class HandInstrument(Instrument):
    def __init__(self, name="no_name", firm=Firm.BOSH, furniture_type=FurnitureType.ARMCHAIR, to_make_shape="null"):
        Instrument.__init__(self, name, firm, furniture_type)
        self.to_make_shape = to_make_shape




