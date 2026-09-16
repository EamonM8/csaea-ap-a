package CrashCourse;

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
    }
    public void checkHealtiness(int calories) {
        if (calories < 100){
            System.out.println(candyName + " is healthy as it only contains " + calories + " calories."); 
        }
        else {
            System.out.println(candyName + " is Unhealthy because it contains " + calories + " calories.");
        }
    }
    public void nutFree(boolean containsNuts) {
        if (containsNuts == true) {
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
