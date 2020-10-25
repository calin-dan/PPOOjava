package Clase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Meniu getMeniuPopulat() {
        Meniu meniu = new Meniu();
        meniu.addMancare(new MicDejun(123, true, 12, 14, "Sarmale", 500, new String[]{"carne", "salata", "varza"}));
        meniu.addMancare(new MeniuPranz(123333, true, 12, 124, "Salata", 1000, new String[]{"carne", "salata", "varza"}));
        meniu.addMancare(new MeniuPranz(133, true, 12, 124, "Salata", 1000, new String[]{"carne", "salata", "varza"}));
        meniu.addMancare(new MeniuPranz(13334, true, 12, 124, "Salata", 1000, new String[]{"carne", "salata", "varza"}));

        meniu.addBauturi(new NonAlcoolice(123242421, true, 15, 123, "cola", 1000, "sadasddsadasd", "laPahar", "Calda", "das", "Coca-Cola"));
        meniu.addBauturi(new NonAlcoolice(123242421, true, 15, 123, "cola", 1000, "sadasddsadasd", "laPahar", "Calda", "das", "Coca-Cola"));
        meniu.addBauturi(new Alcoolice(12, true, 15, 123, "BEre", 1000, "sadasddsadasd", "laPahar", 12, "dsadsa"));
        meniu.addBauturi(new Alcoolice(333222222, true, 15, 123, "BEre", 1000, "sadasddsadasd", "laPahar", 12, "dsadsa"));
        return meniu;

    }


    public static void salvare(String fis, Meniu m) {

        try {
            File f = new File(fis);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bf = new BufferedWriter(fw);

            for (int i = 0; i < m.listaMancare.size(); i++) {
                bf.write(m.listaMancare.get(i).toString());
                if (i < m.listaMancare.size() - 1) {
                    bf.write("\n");
                }
            }
            for (int i = 0; i < m.listaBauturi.size(); i++) {
                bf.write(m.listaBauturi.get(i).toString());
                if (i < m.listaBauturi.size() - 1) {
                    bf.write("\n");
                }
            }

            bf.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void ListaOptiuni(String fisier, Meniu m){
        System.out.println("\n Alegeti ce optiuni doriti sa folositi pentru a manipula datele din meniul restaurantului\n");
        System.out.println("1 - Comanda bautura");
        System.out.println("2 - Comanda mancare");
        System.out.println("3 - Afiseaza produslu cu id-ul...");
        System.out.println("4 - Afiseaza meniul complet de mancare");
        System.out.println("5 - Afiseaza meniul complet de bauturi");
        System.out.println("6 - Afisare meniul mancare disponibila");
        System.out.println("7 - Afisare meniu bauturi disponibile");

        System.out.println("8 - Save");
        System.out.println("9 - Afiseaza cantitatea de produse vandute");


        Scanner s =new Scanner(System.in);
        int var = s.nextInt();
        int index;
        int cantitate;

        switch (var){
            case 1:
                System.out.println("introduceti id-ul meniului pe care il comandati: ");
                index = s.nextInt();
                System.out.println(" introduceti cate meniuri s-au comandat");
                cantitate = s.nextInt();
                m.comandaBautura(index,cantitate);
                ListaOptiuni(fisier,m);


            case 2:
                System.out.println("introduceti id-ul bauturii pe care il comandati: ");
                index = s.nextInt();
                System.out.println(" introduceti cate bauturi s-au comandat");
                cantitate = s.nextInt();
                m.comandaMancare(index,cantitate);
                ListaOptiuni(fisier,m);
            case 3:
                System.out.println("introduceti id-ul produsului pe care doriti sa-l vizualizati: ");
                index = s.nextInt();

                m.mancareAleasa(index);
                ListaOptiuni(fisier,m);

            case 4:

                m.getMancare();
                ListaOptiuni(fisier,m);

            case 5:
                m.getBauturi();
                ListaOptiuni(fisier,m);

            case 6:
                m.mancarePeStock();
                ListaOptiuni(fisier,m);
            case 7:
                m.bauturiPeStock();
                ListaOptiuni(fisier,m);
            case 8:
                salvare(fisier,m);
                ListaOptiuni(fisier,m);

            case 9:
                m.citireContorBauturi();
                m.citireContorMancare();
                ListaOptiuni(fisier,m);
        }


    }

public static void inregistrareComanda(MeniuCina c, int cantitate){

}
    public static void main(String[] args) {

        MeniuCina c = new MeniuCina(123,true,12344,12,"sarmala",123,new String[]{"gramaj","dasdas"});




        String fisier = "meniu.txt";
        Meniu m = new Meniu();
        m= getMeniuPopulat();

        System.out.println("Our menu: .....");
        System.out.println(m.toString());


        while(true){
            try{
                ListaOptiuni(fisier,m);
            }catch (NullPointerException e){
                System.out.println("nu exita asa ceva");
            }
        }
    }
}



