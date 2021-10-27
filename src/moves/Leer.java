package moves;

import ru.ifmo.se.pokemon.*;

public class Leer  extends StatusMove {
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "Уменьшает защиту";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.turns(1);
        effect.stat(Stat.DEFENSE , -1);
        pokemon.addEffect(effect);
    }
}
