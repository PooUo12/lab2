package moves;

import ru.ifmo.se.pokemon.*;

public class DrillRun extends PhysicalMove {
    private boolean flag;
    public DrillRun() {
        super(Type.GROUND , 80 , 95);
    }

    @Override
    protected String describe() {
        if (flag) return "НЫААА";
        else return "Обычный удар(";

    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (Math.random() < 0.12) {
            pokemon.setMod(Stat.HP, (int) (2*v));
            flag = true;
        }
        else pokemon.setMod(Stat.HP, (int) (v));
    }
}
