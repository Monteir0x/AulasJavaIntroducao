package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {

    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> avaibleSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        avaibleSeats.add("1A");
        avaibleSeats.add("1B");

    }

    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return avaibleSeats.remove(seat);
    }

}