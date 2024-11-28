package com.mycompany.curs9;

class AfterShave extends Cosmetice 
{
    String parfum;

    AfterShave(String nume, double pret, int gramaj, String parfum) 
    {
        super(nume, pret, gramaj);
        this.parfum = parfum;
    }

    @Override
    void afisare() 
    {
        super.afisare();
        System.out.println("Parfum: " + parfum);
    }
}


