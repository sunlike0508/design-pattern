package creational.singleton;

public class Main {
    public static void main(String[] args) {
        King king = King.getInstance();

        king.say();

        King king2 = King.getInstance();

        if(king == king2) {
            System.out.println("같은 객체");
        } else  {
            System.out.println("다른 객체");
        }
    }
}
