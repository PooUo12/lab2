package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yveltal extends Pokemon {
    public Yveltal(String name, int level){
        super(name,level);

        setType(Type.DARK, Type.FLYING);
        setStats(126,131,95,131,98,99);
        setMove(new Tackle(), new StoneEdge(), new TakeDown(), new DoubleTeam());
    }
}
