package moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK, 60 , 95);
    }

    @Override
    protected String describe() {
        return "Кинул булыжник";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.turns(1);
        effect.stat(Stat.SPEED, -1);
        pokemon.addEffect(effect);
    }
}
