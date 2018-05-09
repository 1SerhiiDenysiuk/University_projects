class Dumbbell:

    total_weight = 0

    def __init__(self, material="metal",color="black",weight=10,price=200,type="Adjustable dumbbell"):
        self.material = material
        self.color = color
        self.weight = weight
        self.price = price
        self.type = type
        Dumbbell.total_weight += self.weight

    def to_string(self):
        print("Material: " + self.material + ", Color: " + str(self.color) + ", Weight: "
                  + str(self.weight) + ", Price: " + str(self.price) +
                  ", Type: " + str(self.type))

    def print_sum(self):
        print("Bumbbell from the material " + self.material + " weighs " + str(self.weight))

    @staticmethod
    def print_static_sum():
        print("Total weighs of all dumbbells = " + str(Dumbbell.total_weight))

if __name__ == "__main__":
        metal_dumbbell = Dumbbell()
        rubber_dumbbell = Dumbbell("Rubber", "white", 15, 400, "Fixed-weight dumbbells")
        vinyl_dumbbell = Dumbbell("Vinyl", "blue", 5, 150, "Adjustable dumbbell")
        metal_dumbbell.to_string()
        rubber_dumbbell.to_string()
        vinyl_dumbbell.to_string()
        Dumbbell.print_static_sum()
        rubber_dumbbell.print_sum()
        vinyl_dumbbell.print_sum()

