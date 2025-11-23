package com.priceGenerator;

public class Pizza {

    public boolean veg;
    public int price;
    private int basePizzaprice;

    private int bagPrice=50;
    private int toppingPrice=100;
    private int cheesePrice=200;

    private boolean isExtraCheese;
    private boolean isExtraTop;
    private boolean isTakeaway;

    public void checkIfVeg(int choice){
        if(choice==1){
            this.price=800;
        }else{
            this.price=1000;
        }
        basePizzaprice=this.price;
    }

    public void addExtraCheese(){
        this.price+=cheesePrice;
        isExtraCheese=true;
    }

    public void addExtraTopping(){
        this.price+=toppingPrice;
        isExtraTop=true;
    }

    public void takeAway(){
        this.price+=bagPrice;
        isTakeaway=true;
    }

    public void getBill(){
        System.out.println("\nYour bill is :");
        System.out.println("Pizza :"+basePizzaprice);
        if(isExtraCheese){
            System.out.println("Extra Cheese: "+cheesePrice);
        }
        if(isExtraTop){
             System.out.println("Extra Topping: "+toppingPrice);
        }
        if(isTakeaway){
             System.out.println("Carrier bag: "+bagPrice);
        }
        
        System.out.println("\nYour total bill :"+this.price);
        
    }
}
