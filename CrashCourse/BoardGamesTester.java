public class BoardGamesTester {
    public static void main(String[] args) {

        BoardGames monopoly = new BoardGames("monopoly", "regular", true);
        BoardGames applestoapples = new BoardGames("applestoapples", "card", false);
        BoardGames sorry = new BoardGames("sorry","regular",true);
        BoardGames gofish = new BoardGames("gofish","card",false);
        BoardGames chess = new BoardGames("chess","regular",true);

        monopoly.isPopular(true);
        applestoapples.length(15);
        sorry.overview();
        gofish.partyGame();
        chess.length(60);
    }
}
