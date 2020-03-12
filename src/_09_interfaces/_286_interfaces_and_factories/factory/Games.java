package _09_interfaces._286_interfaces_and_factories.factory;

//Получить игру
interface GameFactory { Game getGame(); }
//Играть
interface Game { boolean move(); }



//Реализует метод boolean move()
class Checkers implements Game {

    private int moves = 0;
    private static final int MOVES = 3;

    //когда MOVES будет 3, вернётся false
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

//Возвращает объект игры
class CheckersFactory implements GameFactory {
    public Game getGame() { return new Checkers(); }
}



//Реализует метод boolean move()
class Chess implements Game {

    private int moves = 0;
    private static final int MOVES = 4;

    //когда MOVES будет 4, вернётся false
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

//Возвращает объект игры
class ChessFactory implements GameFactory {
    public Game getGame() { return new Chess(); }
}





public class Games {

    //Принимает любой объект GameFactory
    public static void playGame(GameFactory factory) {
        //Получает объект игры
        Game s = factory.getGame();
        //Играет
        while(s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }

}
