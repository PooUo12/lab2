import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {

        Battle b = new Battle();
        Bellosom p1 = new Bellosom("ЗлоЦвет", 10);
        Gloom p2 = new Gloom("Хищник", 10);
        Larvesta p3 = new Larvesta("Пикачу", 10);
        Oddish p4 = new Oddish("Одиссей", 10);
        Volcarona p5 = new Volcarona("Вулканоид", 10);
        Yveltal p6 = new Yveltal("Золотой Гэрр", 10);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p6);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p5);
        b.go();


    }
}
