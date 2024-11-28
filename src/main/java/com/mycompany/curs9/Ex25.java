package com.mycompany.curs9;



public class Ex25
{
    public static void main(String[] args) 
    {
        AdresaEmail expeditor = new AdresaEmail("expeditor@exemplu.com");
        AdresaEmail destinatar = new AdresaEmail("destinatar@exemplu.com");
        Email email = new Email(expeditor, destinatar, "Salutare", "Mesaj test.");
        
        email.trimite();
        System.out.println();
        
        email.primeste();
    }
}
