public class BoardGamesTester {
    public static void main(String[] args) {

        BoardGames monopoly = new BoardGames("monopoly", "regular", true);
        BoardGames applestoapples = new BoardGames("applestoapples", "card", false);
        BoardGames sorry = new BoardGames("sorry","regular",true);
        BoardGames gofish = new BoardGames("gofish","card",false);
        BoardGames chess = new BoardGames("chess","regular",true);

        gofish.getName();
        chess.setName("sum bs");
        chess.getName();

        String gameName = gofish.getName();
        System.out.println("From Tester Class: "+ gameName);
        System.out.println("Good boy, "+ gameName.toUpperCase());

        monopoly.isPopular(true);
        applestoapples.length(15);
        sorry.overview();
        gofish.partyGame();
        chess.length(60);
    }
}
