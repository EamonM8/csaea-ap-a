package CrashCourse;

public class ProfitableRatTamer {
    String characterName; int health; int ratAppeal; int ratAmount; boolean ratsAngry; double stamina; double hungerLevel; boolean ratsHungry; int profitAmount;
    public ProfitableRatTamer(String characterName, int health, int ratAmount) {
        this.characterName = characterName;
        this.health = health;
        this.ratAmount = ratAmount;

        ratsAngry = false;
        stamina = 100.0;
    }
    public void forage() {
        profitAmount += 10;
        ratsHungry = false;
        hungerLevel -= 20;
    }
    public void unlockDoors(){
        ratsAngry = true;
        profitAmount += 25;
    }
    public void spreadBubonicPlague() {
        ratAppeal -= 50;
        health -= 50;
        if (health <= 0) {
            System.out.println("You Died");
        }
    }
}
    
    
