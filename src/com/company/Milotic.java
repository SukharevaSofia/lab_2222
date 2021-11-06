package com.company;

import ru.ifmo.se.pokemon.Type;

public class Milotic extends Feebas{
    public Milotic(java.lang.String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(95,60,79,100,125,81);
        Kinesis kinesis = new Kinesis();
        addMove(kinesis);
    }
}
