public class CandyBarTester {
    
        public static void main(String[] args) {

            CandyBar mars = new CandyBar("mars", 150, 3.40);
            CandyBar soap = new CandyBar("Soap", 0, 4.00);
            CandyBar kitkat = new CandyBar("kitkat", 60, 1.50);
            CandyBar hershey = new CandyBar("hershey", 500, 4.30);
            CandyBar butterfinger = new CandyBar("butterfinger", 75, 0.90);

            mars.checkHealthiness(150);
            soap.discount();
            kitkat.inflatePrice();
            hershey.nutFree(false);
            butterfinger.checkHealthiness(75);

        }
        
}
