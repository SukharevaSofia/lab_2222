package com.company;
import ru.ifmo.se.pokemon.*;
public class Virizion extends Pokemon {
    public Virizion(java.lang.String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.FIGHTING);
        setStats(91, 90, 72, 90, 129, 108);
        Rollout rollout = new Rollout();
        TeeterDance teeterdance = new TeeterDance();
        TriAttack triAttack = new TriAttack();
        setMove(rollout, teeterdance, triAttack, getPreparedMove());
    }
}