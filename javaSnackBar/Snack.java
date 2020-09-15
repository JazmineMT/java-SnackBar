package javaSnackBar;

// Snack has fields (so knows)

// * maxId - keep track of last used snack id
// * id - automatically generated field
// * name
// * quantity
// * cost
// * vending machine id
// Snack has methods (so can)

// * get id
// * set and get name
// * set and get cost
// * set and get vending machine id
// * get quantity
// * add quantity when given how many to add
// * buy snack when given how many to buy
// * get total cost given a quantity

public class Snack{

    public static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId){
        maxId ++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    } 
    public int getQuantity(){
        return quantity;
    } 
    public double getCost(){
        return cost;
    }
    public int getVendingMachineId(){
        return vendingMachineId;
    }
    public double getTotalCost(int amount)
	{
		return amount * this.cost;
	}

   


    // setters

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity( int quantity){
        this.quantity = quantity;
    }
    public void setCost( double cost){
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId){
        this.vendingMachineId = vendingMachineId;
    }
    public void snacksBought(int amount)
	{
		this.quantity = this.quantity - amount;
    }
    public void addQuantity(int amount)
	{
		this.quantity = this.quantity + amount;
	}



}

// * add quantity when given how many to add
// * buy snack when given how many to buy
// * get total cost given a quantity