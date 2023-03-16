package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> avaibleSeats;

    AircraftSingletonEnum() {
        this.avaibleSeats = new HashSet<>();
        this.avaibleSeats.add("1A");
        this.avaibleSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return avaibleSeats.remove(seat);
    }
}
