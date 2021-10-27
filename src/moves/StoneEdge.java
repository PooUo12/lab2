package moves;

import ru.ifmo.se.pokemon.*;


public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100 ,80);
    }

    @Override
    protected String describe() {
        return "Кидает булыгу";
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (Math.random() < 0.12) pokemon.setMod(Stat.HP, (int) (2 * v));
        else pokemon.setMod(Stat.HP, (int) v);
    }

}
