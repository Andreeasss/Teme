package com.mycompany.curs9;

class CremaFata extends Cosmetice 
{
    String tipTen;

    CremaFata(String nume, double pret, int gramaj, String tipTen) 
    {
        super(nume, pret, gramaj);
        this.tipTen = tipTen;
    }

    @Override
    void afisare() 
    {
        super.afisare();
        System.out.println("Tip Ten: " + tipTen);
    }
}