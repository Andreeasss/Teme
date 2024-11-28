package com.mycompany.curs9;
class Email 
{
    AdresaEmail expeditor;
    AdresaEmail destinatar;
    String subiect;
    String continut;

    Email(AdresaEmail expeditor, AdresaEmail destinatar, String subiect, String continut)
    {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.subiect = subiect;
        this.continut = continut;
    }

    void trimite()
    {
        System.out.println("Trimitere email...");
        System.out.println("De la: " + expeditor);
        System.out.println("Către: " + destinatar);
        System.out.println("Subiect: " + subiect);
        System.out.println("Conținut: " + continut);
    }

    void primeste() 
    {
        System.out.println("Email primit!");
        System.out.println("De la: " + expeditor);
        System.out.println("Către: " + destinatar);
        System.out.println("Subiect: " + subiect);
        System.out.println("Conținut: " + continut);
    }
}
