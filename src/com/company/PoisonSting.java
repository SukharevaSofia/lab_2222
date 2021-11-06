package com.company;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonSting extends PhysicalMove {
    public PoisonSting(){
        this.type = Type.POISON;
        this.accuracy = 1.0;
        this.hits = 1;
        this.power = 15;
        this.priority = 3;
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        float x = Math.round(Math.random()*9);
        if (x == 0.0 || x == 1.0 || x == 2.0) {
            Effect.poison(def);
        }
    }
    @Override
    public String describe (){
        return "кидает в противника ядовитое жало";
    }
}
