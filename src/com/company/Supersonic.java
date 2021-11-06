package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Supersonic extends SpecialMove {
    private Pokemon pokemon;
    public Supersonic(){
        this.type = Type.NORMAL;
        this.accuracy = 0.55;
        this.priority = 0;
    }
    @Override
    public void applyOppEffects(Pokemon pokemon) {
        this.pokemon = pokemon;
        super.applyOppEffects(pokemon);
        System.out.println(pokemon.toString() + " вредит себе в замешательстве.");
        getConfusionMove();
    }
    @Override
    public String describe (){
        return "ошеломляет противника ультразвуком";
    }
}