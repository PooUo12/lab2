package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING, 60 , 1000);
    }

    @Override
    protected String describe() {
        return "Применяю Воздушный туз";
    }

}
