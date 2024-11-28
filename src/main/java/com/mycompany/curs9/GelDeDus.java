package com.mycompany.curs9;

class GelDeDus extends Cosmetice 
{
    String parfum;

    GelDeDus(String nume, double pret, int gramaj, String prafum) 
    {
        super(nume, pret, gramaj);
        this.parfum= parfum;
    }

    @Override
    void afisare() 
    {
        super.afisare();
        System.out.println("Parfum: " + parfum);
    }
}
