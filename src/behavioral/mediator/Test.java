package behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        LondonAirport airport = new LondonAirport();

        Airplane boeing727 = new Boeing(airport, "Boeing 727");
        Airplane boeing707 = new Boeing(airport, "Boeing 707");
        Airplane boeing737Max = new Boeing(airport, "Boeing 737 Max");
        airport.addPlane(boeing707);
        airport.addPlane(boeing727);
        airport.addPlane(boeing737Max);

        boeing737Max.send("taking off");
    }
}
