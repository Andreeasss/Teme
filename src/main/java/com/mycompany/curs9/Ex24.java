package com.mycompany.curs9;

public class Ex24 
{
    public static void main(String[] args) 
    {
        Sampon sampon1 = new Sampon("Sampon revitalizant", 15, 500, "Normal");
        Sampon sampon2 = new Sampon("Sampon pentru volum", 20, 400, "Subtire");
        Sampon sampon3 = new Sampon("Sampon hidratant", 25, 450, "Uscat");

        CremaFata cremaFata1 = new CremaFata("Crema de fata hidratanta", 30, 50, "Mixt");
        CremaFata cremaFata2 = new CremaFata("Crema de fata antirid", 40, 60, "Sensibil");
        CremaFata cremaFata3 = new CremaFata("Crema de fata noapte", 35, 55, "Gras");

        CremaCorp cremaCorp1 = new CremaCorp("Crema de corp hidratanta ", 25, 200, "Corp");
        CremaCorp cremaCorp2 = new CremaCorp("Crema cu sclipici", 28, 250, "Corp");
        CremaCorp cremaCorp3 = new CremaCorp("Crema pentru maini", 15, 100, "Maini");

        AfterShave afterShave1 = new AfterShave("After Shave racoritor", 20, 100, "Menthol");
        AfterShave afterShave2 = new AfterShave("After Shave proaspat", 22, 120, "Citrus");
        AfterShave afterShave3 = new AfterShave("After Shave lemnos", 25, 110, "Woody");

        GelDeDus gelDeDus1 = new GelDeDus("Gel de dus relaxant", 18, 300, "Lavanda");
        GelDeDus gelDeDus2 = new GelDeDus("Gel de dus revitalizant", 20, 350, "Menta");
        GelDeDus gelDeDus3 = new GelDeDus("Gel de dus energizant", 22, 400, "Portocala");

        Cosmetice[] cosmeticeList = {sampon1, sampon2, sampon3, cremaFata1, cremaFata2, cremaFata3,cremaCorp1, cremaCorp2, cremaCorp3, afterShave1, afterShave2, afterShave3, gelDeDus1, gelDeDus2, gelDeDus3};

            for (Cosmetice produs : cosmeticeList)
            {
                produs.afisare();
                System.out.println();
            }
    }
}
