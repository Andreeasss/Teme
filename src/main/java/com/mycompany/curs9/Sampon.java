package com.mycompany.curs9;

class Sampon extends Cosmetice 
{
    String Par;

    Sampon(String nume, double pret, int gramaj, String Par) 
    {
        super(nume, pret, gramaj);
        this.Par = Par;
    }

    @Override
    void afisare() 
    {
        super.afisare();
        System.out.println("Tip de par: " + Par);
    }
}
