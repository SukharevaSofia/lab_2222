package com.company;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Sewaddle extends Pokemon {
    public Sewaddle(java.lang.String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.BUG);
        setStats(45,53,70,40,60,42);
        TeeterDance teeterDance = new TeeterDance();
        Supersonic supersonic = new Supersonic();
        setMove(teeterDance, supersonic);
    }
}