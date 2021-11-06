package com.company;
import ru.ifmo.se.pokemon.Type;
public class Swadloon extends Sewaddle{
    public Swadloon(java.lang.String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.BUG);
        setStats(55,63,90,50,80,42);
        Bonemerang bonemerang = new Bonemerang();
        addMove(bonemerang);
    }
}