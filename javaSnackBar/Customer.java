package javaSnackBar;

// Customer has fields (so knows)

// * maxId - keep track of last used customer id
// * id - automatically generated field
// * name
// * cash on hand

// Customer has methods (so can)

// * get id
// * set and get name
// * add cash to cash on hand
// * get cash on hand
// * buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

public class Customer {

    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;


    // constructor 

    public Customer( String name, double cashOnHand){
        maxId ++;
        id = maxId;

        this.name = name; 
        this.cashOnHand = cashOnHand;
    }

	public void addCash(double amount)
	{
		this.cashOnHand = this.cashOnHand + amount;
	}

	public void buySnacks(double amount)
	{
        this.cashOnHand = this.cashOnHand - amount;
    }
	

    public int getId(){
        return id;
    }
    public String getName(){
        return name;

    }
    public double getCashOnHand(){
        return cashOnHand;
    }

    public void setName(String name)
    {
        this.name= name;
    }
    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }

}
