package moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.PSYCHIC, 60 ,100);
    }

    @Override
    protected String describe() {
        return "Роковой удар";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.turns(1);
        effect.stat(Stat.SPEED, -1);
        pokemon.addEffect(effect);
    }
}

