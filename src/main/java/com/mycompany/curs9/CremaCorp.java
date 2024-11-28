package com.mycompany.curs9;

class CremaCorp extends Cosmetice 
{
    String zonaDeAplicare;

    CremaCorp(String nume, double pret, int gramaj, String zonaDeAplicare) 
    {
        super(nume, pret, gramaj);
        this.zonaDeAplicare = zonaDeAplicare;
    }
    
    @Override
    void afisare() 
    {
        super.afisare();
        System.out.println("Zona de aplicare: " + zonaDeAplicare);
    }
}
