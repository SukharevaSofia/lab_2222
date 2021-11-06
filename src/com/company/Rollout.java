package com.company;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class Rollout extends PhysicalMove {
    public Rollout(){
        this.type = Type.ROCK;
        this.accuracy = 0.9;
        this.hits = 5;
        this.power = 30;
        this.priority = 0;
    }
    @Override
    public String describe (){
        return "вкатывается в соперника";
    }
}