import module java.base;
public class CandyBar {
    private String candyName;
    private int calories;
    private double price;
    private boolean containsNuts;

    public CandyBar(String candyName, int calories, double price) {
        this.calories = calories;
        this.candyName = candyName;
        this.price = price;

        candyName = "Twix";
        calories = 150;
        price = 3.50;
        containsNuts = false;
    }

    public void discount() {
        price *= 0.9;
        System.out.println("The Price: " + price);
    }
    public void checkHealthiness(int calories) {
        if (calories < 100){
            System.out.println(candyName + " is healthy as it only contains " + calories + " calories."); 
        }
        else {
            System.out.println(candyName + " is unhealthy because it contains " + calories + " calories.");
        }
    }
    public void nutFree(boolean containsNuts) {
        if (containsNuts == false) {
            System.out.println("This candy bar contains nuts!!");
        }
        else {
            System.out.println("This candy bar does not contain nuts.");
        }
    }
    public void inflatePrice() {
        price += (price*0.05);
    }

}
CandyBar twix = new CandyBar("twix",200,2.00);
CandyBar kitkat = new CandyBar("kitkat",60,1.50);
CandyBar hersheys = new CandyBar("hersheys",500,4.00);
CandyBar jumbo = new CandyBar("jumbo",1000,6.00);
Candybar mini = new CandyBar("mini",15,0.50);
CandyBar mini = new CandyBar("mini",15,0.50);
twix.CandyBar
twix
twix.candyName
public class CandyBar {
    private String candyName;
    public int calories;
    private double price;
    private boolean containsNuts;

    public CandyBar(String candyName, int calories, double price) {
        this.calories = calories;
        this.candyName = candyName;
        this.price = price;

        candyName = "Twix";
        calories = 150;
        price = 3.50;
        containsNuts = false;
    }

    public void discount() {
        price *= 0.9;
        System.out.println("The Price: " + price);
    }
    public void checkHealthiness(int calories) {
        if (calories < 100){
            System.out.println(candyName + " is healthy as it only contains " + calories + " calories."); 
        }
        else {
            System.out.println(candyName + " is unhealthy because it contains " + calories + " calories.");
        }
    }
    public void nutFree(boolean containsNuts) {
        if (containsNuts == false) {
            System.out.println("This candy bar contains nuts!!");
        }
        else {
            System.out.println("This candy bar does not contain nuts.");
        }
    }
    public void inflatePrice() {
        price += (price*0.05);
    }

}
kitkat.calories
twix.calories
CandyBar twix = new CandyBar("twix",200,2.00);
CandyBar kitkat = new CandyBar("kitkat",100,1.50);
CandyBar hersheys = new CandyBar("hersheys",400,3.00);
CandyBar jumbo = new CandyBar("jumbo",1000,6.50);
CandyBar mini = new CandyBar("mini",15,0.50);
kitkat.calories
hersheys.price
mini.containsNuts
jumbo.discount()
mini.checkHealthiness(15)
twix.nutFree(true)
kitkat.inflatePrice()