package coffee.order;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Amanda");
        coffeeOrderBoard.add("John");
        coffeeOrderBoard.add("Bob");
        coffeeOrderBoard.add("Linda");
        coffeeOrderBoard.add("Stan");
        coffeeOrderBoard.add("Megan");

        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver(4);
        coffeeOrderBoard.draw();

        coffeeOrderBoard.add("Stuart");

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver(7);

        coffeeOrderBoard.draw();

        coffeeOrderBoard.add("Margaret");

        coffeeOrderBoard.draw();
    }
}
