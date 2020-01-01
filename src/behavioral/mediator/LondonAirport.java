package behavioral.mediator;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class LondonAirport implements ATCMediator {
    Set<Airplane> planes;

    public LondonAirport() {
        this.planes = new HashSet<>();
    }

    public void addPlane(Airplane plane){
        this.planes.add(plane);
    }

    @Override
    public void sendMessage(String msg, Airplane airplane) {
     //   planes.stream().filter(Predicate.not(Predicate.isEqual(airplane)))
        planes.stream().filter(Predicate.isEqual(airplane).negate())
                .forEach(plane -> plane.receive(airplane.getName() + " -- " + msg));
    }
}
