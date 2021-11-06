package com.company;

import ru.ifmo.se.pokemon.*;

public class HyperBeam extends SpecialMove {
    public HyperBeam(){
        this.type = Type.NORMAL;
        this.accuracy = 0.9;
        this.hits = 1;
        this.power = 150;
        this.priority = 0;
    }
    @Override
    protected void applySelfEffects(Pokemon att){
        Effect e = new Effect().turns(1).attack(0);
        att.setCondition(e);
        System.out.println(att.toString() +" пропускает ход");
    }
    @Override
    public String describe (){
        return "выпускает в соперника гиперлуч";
    }
}
