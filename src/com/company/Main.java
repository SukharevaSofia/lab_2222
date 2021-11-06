package com.company;

import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Virizion("Вжик", 2);
        Pokemon p2 = new Milotic("Хрюкозавр", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
