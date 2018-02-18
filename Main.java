package Restaurant;

public class Main {
	public static void main(String[] args) {
		Restaurant Hut = new Restaurant();
        Restaurant CafeMusafir = new Restaurant("Cafe Musafir", "crimean tatar", 100, 30);
        Restaurant LuckyBull = new Restaurant("Lucky Bull", "european", 60, 15, "higher");
        
        System.out.println(Hut.toString());
        System.out.println(CafeMusafir.toString());
        System.out.println(LuckyBull.toString());
        
        Hut.resetValues("Hut", "fish restaurant", 50, 12, "first");
        
        Hut.printSum();
        CafeMusafir.printSum();
        LuckyBull.printSum();
        
        CafeMusafir.setNumberOfSeats(130);
        
        Restaurant.printStaticSum();
	}

}
