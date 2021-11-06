package com.company;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public class TeeterDance extends SpecialMove {
    private Pokemon pokemon;
    public TeeterDance(){
        this.type = Type.NORMAL;
        this.accuracy = 1;
        this.priority = 0;
    }
    @Override
    public void applyOppEffects(Pokemon pokemon) {
        this.pokemon = pokemon;
        super.applyOppEffects(pokemon);
        System.out.println(pokemon.toString() + " вредит себе в замешательстве");
        getConfusionMove();
    }
    @Override
    public String describe (){
        return "ошеломляет противника своим танцем";
    }
}