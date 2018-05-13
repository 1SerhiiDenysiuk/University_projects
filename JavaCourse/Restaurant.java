package Restaurant;

public class Restaurant {
	 private String name = "NoName";
	 private String type;
	 private int numberOfTables;
	 private int numberOfSeats;
	 private String classOfRestaurant;
     
	 public static int totalNumberOfSeats = 0;
	 
	 public Restaurant() {
	 }
	 
	 public Restaurant (String name, String type, int numberOfSeats, int numberOfTables) {
     setName(name);
	 setType(type);
	 setNumberOfSeats(numberOfSeats);
	 setNumberOfTables(numberOfTables);
	 }
	 
	 public Restaurant (String name, String type, int numberOfSeats, int numberOfTables, String classOfRestaurant){
	     setName(name);
		 setType(type);
		 setNumberOfSeats(numberOfSeats);
		 setNumberOfTables(numberOfTables);
		 setClassOfRestaurant(classOfRestaurant);
	 }
	 
	 public String toString() {
		 return "Restaurant is called " + name + ", have " + type + " cuisine, has tables:" + numberOfTables + ", has number of seats: " + numberOfSeats + ", it has " + classOfRestaurant + " class";
	 }
	 
	 static void printStaticSum() {
	        System.out.println("Restaurants can accommodate " + totalNumberOfSeats + " visitors");
	 }
	 
	 public void printSum() {
	        System.out.println("The restaurant " + name + " can accomodate " + numberOfSeats + " visitors, total number is: " + totalNumberOfSeats);
	    }
	 
	 public void resetValues(String name, String type, int numberOfSeats, int numberOfTables, String classOfRestaurant) {
	        setName(name);
	        setType(type);
	        setNumberOfSeats(numberOfSeats);
	        setNumberOfTables(numberOfTables);
	        setClassOfRestaurant(classOfRestaurant);
	    }
	 
	 public String getName() {
	        return name;
	    }
	 
	 public void setName(String name) {
	        this.name = name;
	    }
	 
	 public String getType() {
	        return type;
	    }
	 
	 public void setType(String type) {
	        this.type = type;
	    }
	 
	 public int getNumberOfSears() {
	        return numberOfSeats;
	    }
	 
	  public void setNumberOfSeats(int numberOfSeats) {
	        totalNumberOfSeats -= this.numberOfSeats;
	        this.numberOfSeats = numberOfSeats;
	        totalNumberOfSeats += this.numberOfSeats;
	    }
	  
	  public int getNumberOfTables() {
		  return numberOfTables;
	  }
	  
	  public void setNumberOfTables(int numberOfTables) {
		  this.numberOfTables = numberOfTables;
	  }
	  
	  public String getClassOfRestaurant() {
	        return classOfRestaurant;
	    }
	  
	  public void setClassOfRestaurant(String classOfRestaurant) {
		  this.classOfRestaurant = classOfRestaurant;
	  }
}
