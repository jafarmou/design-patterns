package behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Channel sports = new Channel("Sports");
        Channel stocks = new Channel("STOCKS");

        Observer james = new Subscriber("James");
        Observer jenny = new Subscriber("Jenny");
        Observer henry = new Subscriber("Henry");

        sports.register(james);
        sports.register(jenny);
        sports.register(henry);
        stocks.register(henry);

        sports.postMessage("Arsenal - Chelsea (Kick off)");
        stocks.postMessage("AAPL new price: 0.0075");

        sports.postMessage("Arsenal 1 - 0 Chelsea");
        stocks.postMessage("IBM new price: 0.0125");

        sports.unregister(jenny);

        sports.postMessage("Arsenal 2 - 0 Chelsea");
        sports.postMessage("Arsenal 2 - 0 Chelsea (Half Time)");
    }
}
