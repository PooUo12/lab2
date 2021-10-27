package moves;

import ru.ifmo.se.pokemon.*;

public class FeatherDance extends StatusMove {
    public FeatherDance(){
        super(Type.FLYING, 0 , 100);
    }

    @Override
    protected String describe() {
        return "Танец листьев";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.turns(2);
        effect.stat(Stat.ATTACK, +1);
        pokemon.addEffect(effect);
    }
}
