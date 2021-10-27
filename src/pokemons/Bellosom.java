package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Bellosom extends Gloom {
    public Bellosom(String name, int level) {
        super(name, level);

        setType(Type.GRASS);
        setStats(75,80,95,90,100,50);
        addMove(new Bulldoze());
    }
}
