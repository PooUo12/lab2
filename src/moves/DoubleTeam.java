package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0 ,0);
    }

    @Override
    protected String describe() {
        return "укланяется";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.turns(1);
        effect.stat(Stat.EVASION, +1);
        pokemon.addEffect(effect);
    }
}

