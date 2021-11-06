package com.company;

import ru.ifmo.se.pokemon.*;

public class Kinesis extends StatusMove {
    public Kinesis(){
        this.type = Type.NORMAL;
        this.accuracy = 0.8;
        this.hits = 1;
        this.power = 0;
        this.priority = 0;
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        Effect e = new Effect().turns(1).stat(Stat.ACCURACY, -1);
        def.setCondition(e);
    }
    @Override
    public String describe (){return "ломает ложку на глазах у врага";}
}
