// blueprint / template that CREATE objects. Category that stores functions and the like
// CLASS HEADER
public class robot {
    
        // ATTRIBUTES/DATA: private instance variables
        private String name;
        private String serial;
        private double battery;
        private boolean isOn;

        // CONSTUCTOR: 
        // special method: Starting point for new objects
        // Constructor: no return type, same name as class
        // PARAMETERS: name, serial, battery
        public robot(String name, String serial, double battery) {
            // THIS: Instance variable vs. parameter
            this.name = name;
            this.serial = serial;
            this.battery = battery;
            // DEFAULT STATE: every robot starts off.
            this.isOn = false;
        }

        // GETTER / ACCESSOR: retur type matches variable
        public String getName(){
            return name;
        }

        public double batteryLife() {
            return battery;
        }
        
        // BOOLEAN getter:
        public boolean isOn() {
            return isOn;
        }

        // SETTERS / MUTATORS: void, PARAMETER recieves an ARGUEMENT
        public void setName(String newName) {
            name = newName;
        }

        public String toString() {
            return name + " [" + serial + "]";
        }

        // indexOf: returns index, or -1 if not found.
        public boolean serialContains(String part) {
            return serial.indexOf(part) != -1;
        }



}
