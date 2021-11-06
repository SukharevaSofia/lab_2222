package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Feebas extends Pokemon {
    public Feebas(java.lang.String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(20,15,20,10,55,80);
        FakeOut fakeOut = new FakeOut();
        PoisonSting poisonSting = new PoisonSting();
        HyperBeam hyperBeam = new HyperBeam();
        setMove(hyperBeam, poisonSting, fakeOut);
    }
}
