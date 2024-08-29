package gis.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        DiceGame diceGame = new FaireDiceGame();

        //Player player1 = new EvenBettingPlayer("짝궁댕이");
        //Player player2 = new OddBettingPlayer("홀댕이");
        Player player3 = new NBettingPlayer("남자는1", 1);
        Player player4 = new NBettingPlayer("남자는6", 6);
        Player player5 = new NBettingPlayer("무난한", 4);

        //diceGame.addPlayer(player1);
        //diceGame.addPlayer(player2);
        diceGame.addPlayer(player3);
        diceGame.addPlayer(player4);
        diceGame.addPlayer(player5);

        for(int i = 0; i < 10; i++) {
            diceGame.play();
            System.out.println();
        }
    }
}
