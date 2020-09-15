package javaSnackBar;
// Customer 
// Snack 
// vending machine
public class Main{
    
    private static void snackBar(){
        // public Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack s1 = new Snack("Chips", 36, 1.75, 1);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
		Snack s4 = new Snack("Soda", 24, 2.50, 2);
		Snack s5 = new Snack("Water", 20, 2.75, 2);

        // public VendingMachine(String name)
        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");


        // 	public Customer(String name, double cashOnHand)
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bod", 33.14);
	
         // PROCESSING
         //Customer 1 (Jane) buys 3 of snack 4 (Soda).
         c1.buySnacks(s4.getTotalCost(3));
         s4.snacksBought(3);
        //Print Customer 1 (Jane) Cash on hand.
        System.out.println("\n" + c1.getName()+ "cash on hand" + c1.getCashOnHand());
        //Print quantity of snack 4 (Soda).
        System.out.println("Quantity of Snack 4 is" + s4.getQuantity() + "\n");
        		 // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
		c1.buySnacks(s3.getTotalCost(1));
		s3.snacksBought(1);
		 // Print Customer 1 (Jane) Cash on hand.
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		 // Print quantity of snack 3 (Pretzel).
		System.out.println("Quantity of snack 3 is " + s3.getQuantity() + "\n");
		 // Customer 2 (Bob) buys 2 of snack 4 (Soda).
		c2.buySnacks(s4.getTotalCost(2));
		s4.snacksBought(2);
		 // Print Customer 2 (Bob) Cash on Hand.
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		 // Print quantity of snack 4 (Soda).
		System.out.println("Quantity of snack 4 is " + s4.getQuantity() + "\n");
		 // Customer 1 (Jane) finds $10.
		c1.addCash(10);
		 // Print Customer 1 (Jane) Cash on Hand.
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand() + "\n");
		 // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
		c1.buySnacks(s2.getTotalCost(1));
		s2.snacksBought(1);
		 // Print Customer 1 (Jane) Cash on Hand.
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		 // Print quantity of snack 2 (Chocolate Bar).
		System.out.println("Quantity of snack 2 is " + s2.getQuantity() + "\n");
		 // Add 12 more items to snack 3 (Pretzel).
		s3.addQuantity(12);
		 // Print quantity of snack 3 (Pretzel).
		System.out.println("Quantity of snack 3 is " + s3.getQuantity() + "\n");
		 // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
		c2.buySnacks(s3.getTotalCost(3));
		s3.snacksBought(3);
		 // Print Customer 2 (Bob) Cash on hand.
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		 // Print quantity of snack 3 (Pretzel).
		System.out.println("Quantity of snack 3 is " + s3.getQuantity() + "\n");

		// Stretch Goals
		System.out.println("Stretch Goals\n");

		// Snack: Chips
		System.out.println("Snack: " + s1.getName());
		// Vending Machine: Food
		System.out.println("Vending Machine: " + v1.getName());
		// Quantity: 36
		System.out.println("Quantity: " + s1.getQuantity());
		// Total Cost: $63.00
		System.out.println("Total Cost: $" + s1.getQuantity() * s1.getCost() + "0\n");

		// Snack: Chocolate Bar
		System.out.println("Snack: " + s2.getName());
		// Vending Machine: Food
		System.out.println("Vending Machine: " + v1.getName());
		// Quantity: 35
		System.out.println("Quantity: " + s2.getQuantity());
		// Total Cost: $35.00
		System.out.println("Total Cost: $" + s2.getQuantity() * s2.getCost() + "0\n");

		// Snack: Pretzel
		System.out.println("Snack: " + s3.getName());
		// Vending Machine: Food
		System.out.println("Vending Machine: " + v1.getName());
		// Quantity: 38
		System.out.println("Quantity: " + s3.getQuantity());
		// Total Cost: $76.00
		System.out.println("Total Cost: $" + s3.getQuantity() * s3.getCost() + "0\n");

		// Snack: Soda
		System.out.println("Snack: " + s4.getName());
		// Vending Machine: Drink
		System.out.println("Vending Machine: " + v2.getName());
		// Quantity: 19
		System.out.println("Quantity: " + s4.getQuantity());
		// Total Cost: $47.50
		System.out.println("Total Cost: $" + s4.getQuantity() * s4.getCost() + "0\n");

		// Snack: Water
		System.out.println("Snack: " + s5.getName());
		// Vending Machine: Drink
		System.out.println("Vending Machine: " + v2.getName());
		// Quantity: 20
		System.out.println("Quantity: " + s5.getQuantity());
		// Total Cost: $55.00
		System.out.println("Total Cost: $" + s5.getQuantity() * s5.getCost() + "0");

        

        
    }
    public static void main(String[] args)
	{
		snackBar();
	}
}