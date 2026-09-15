package CrashCourse;

public class Dog { //class header
    String name; String ownerName; String breed; int age; int energyAmount; double weight; boolean isHungry; boolean isHome;
    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 5;
        weight = 92.1;
    }

    public void eat() {
        isHungry = false;
        weight += 0.1;
    }
    public void runAway() {
        isHome = false;
        energyAmount -= 15;
    }
    public void comeHome() {
        isHome = true;
    }
    public void sleep() {
        energyAmount += 50;
        if (energyAmount > 100){
            energyAmount = 100;
        }
    }
    public void haveABirthday() {
        age += 1;
    }
}
