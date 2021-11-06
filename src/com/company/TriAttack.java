package com.company;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class TriAttack extends SpecialMove {
    public TriAttack(){
        this.type = Type.NORMAL;
        this.accuracy = 1;
        this.hits = 1;
        this.power = 80;
        this.priority = 0;
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        float x = Math.round(Math.random()*4);
        if (x == 0.0){
            float y = Math.round(Math.random()*2);
            if (y == 0.0){
                Effect.burn(def);
            }else if(y == 1.0){
                Effect.freeze(def);
            }else {
                Effect.paralyze(def);
            }
        }
    }
    @Override
    public String describe (){
        return "атакует с помощью TriAttack";
    }
}
