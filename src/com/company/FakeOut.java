package com.company;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FakeOut extends PhysicalMove {
    public FakeOut(){
        this.type = Type.NORMAL;
        this.accuracy = 1.0;
        this.hits = 1;
        this.power = 40;
        this.priority = 3;
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        Effect.flinch(def);
    }
    @Override
    public String describe (){
        return "ошарашивает соперника";
    }
}
