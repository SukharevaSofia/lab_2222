package com.company;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public class SolarBeam extends SpecialMove {
    public SolarBeam(){
        this.type = Type.GRASS;
        this.accuracy = 1;
        this.hits = 1;
        this.power = 120;
        this.priority = 0;
    }
    @Override
    public String describe (){
        System.out.println("Специальная атака заряжается");
        return "атакует противника лучём света";
    }
}