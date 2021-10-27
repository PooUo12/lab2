package moves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90 , 85);
    }

    @Override
    protected String describe() {
        return "Сбивает с ног";
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) -v/4);
    }
}

