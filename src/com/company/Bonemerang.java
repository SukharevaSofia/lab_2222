package com.company;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class Bonemerang extends PhysicalMove {
    public Bonemerang(){
        this.type = Type.GROUND;
        this.accuracy = 0.9;
        this.hits = 2;
        this.power = 50;
        this.priority = 0;
    }
    @Override
    public String describe (){
        return "кидает бумеранг в противника";
    }
}