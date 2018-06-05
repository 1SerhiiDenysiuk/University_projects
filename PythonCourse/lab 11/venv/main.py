from FurnitureShop import FurnitureShop
from Instrument import MeasuringInstrument
from Instrument import HandInstrument
from Enum import Firm
from Enum import FurnitureType

if __name__ == "__main__":
    shop = FurnitureShop(name="New_shop", area=98)
    shop.add_instrument(
        MeasuringInstrument(name="qadas", firm=Firm.BOSH, furniture_type=FurnitureType.ARMCHAIR, measuring_distance=56))
    shop.add_instrument(
        MeasuringInstrument(name="fzxa", firm=Firm.BOSH, furniture_type=FurnitureType.SOFA, measuring_distance=56))
    shop.add_instrument(
        MeasuringInstrument(name="qwrfsa", firm=Firm.TMFORCE, furniture_type=FurnitureType.BED, measuring_distance=56))
    shop.add_instrument(
        MeasuringInstrument(name="vsda", firm=Firm.TMMATRIX, furniture_type=FurnitureType.ARMCHAIR,
                            measuring_distance=56))
    shop.add_instrument(
        MeasuringInstrument(name="awqf", firm=Firm.BOSH, furniture_type=FurnitureType.ARMCHAIR, measuring_distance=56))
    shop.add_instrument(
        MeasuringInstrument(name="hddft", firm=Firm.TMFORCE, furniture_type=FurnitureType.SOFA, measuring_distance=56))
    shop.add_instrument(
        HandInstrument(name="czsd", firm=Firm.TMMATRIX, furniture_type=FurnitureType.ARMCHAIR, to_make_shape="fdfgdfg"))
    shop.sort_by_firm()
    for instrument in shop.sort_by_firm():
        print(str(instrument.firm))
    for instrument in shop.search_Instrument_By_Appointment(FurnitureType.ARMCHAIR):
        print(str(instrument.furniture_type) + " " + str(instrument.name))
