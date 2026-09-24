public class BoardGames {
    public static void main(String[] args) {}
    private String type; //regular or card
    private boolean isBestseller;
    private double gameLength;
    private int playerCount;
    private String gameName;

    public BoardGames(String gameName, String type, boolean isBestseller) {
        this.gameName = gameName;
        this.type = type;
        this.isBestseller = isBestseller;

        gameLength = 23.5;
        playerCount = 4;
        gameName = "monopoly";
        type = "regular";
        isBestseller = true;
    }
    public void isPopular(boolean isBestseller) {
        if (isBestseller == true) {
            System.out.println("This is a popular game!");
        } else {
            System.out.println("This is not a popular game.");
        }
    }
    public void length(double gameLength) {
        if (gameLength <= 20) {
            System.out.println("Player Count: "+playerCount);
            System.out.println("This game is short.");
            this.playerCount = 2;
            System.out.println("Best player Count: "+playerCount);
            System.out.println();
        } 
        if (20 < gameLength && gameLength < 40) {
            System.out.println("Player Count: "+playerCount);
            System.out.println("This game is medium length.");
            this.playerCount = 3;
            System.out.println("Best player Count: "+playerCount);
            System.out.println();
        } else {
            System.out.println("Player Count: "+playerCount);
            System.out.println("This game is long!");
            this.playerCount = 4;
            System.out.println("Best player Count: "+playerCount);
            System.out.println();
        }
    }
    public void overview() {
        System.out.println(gameName+" is a "+type+" board game.");
    }
    public void partyGame() {
        if (isBestseller == true && playerCount >= 4) {
            System.out.println("This is a party game!");
        } else {
            System.out.println("This is not a good party game...");
        }
    }

    }

