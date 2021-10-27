package pokemons;

import moves.FeatherDance;

public class Volcarona extends Larvesta{
    public Volcarona(String name, int level) {
        super(name, level);

        setStats(85,60,65,135,105,100);
        addMove(new FeatherDance());
    }
}
