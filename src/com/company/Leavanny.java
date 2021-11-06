package com.company;
import ru.ifmo.se.pokemon.Type;
public class Leavanny extends Swadloon{
    public Leavanny(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.BUG);
        setStats(75,103,80,70,80,92);
        SolarBeam solarBeam = new SolarBeam();
        addMove(solarBeam);
    }
}