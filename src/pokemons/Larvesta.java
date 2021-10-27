package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Larvesta extends Pokemon {
    public Larvesta(String name, int level){
        super(name,level);

        setType(Type.BUG, Type.FIRE);
        setStats(55, 85, 55,50,55,60);
        setMove(new AerialAce(), new Rest(), new RockTomb());
    }

}
