package com.mycompany.curs9;
class Cosmetice 
{
    String nume;
    double pret;
    int gramaj;

    Cosmetice(String nume, double pret, int gramaj)
    {
        this.nume = nume;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    void afisare() 
    {
        System.out.println("Nume: " + nume + ", Pret: " + pret + " RON, Gramaj: " + gramaj + " ml");
    }
}