package Clase;

import java.util.LinkedList;
import java.util.List;

public class Meniu {

    protected List<Mancare> listaMancare = new LinkedList<>();
    protected List<Bauturi> listaBauturi = new LinkedList<>();


    public List<Mancare> getListaMancare() {
        return listaMancare;
    }

    public List<Bauturi> getListaBauturi() {
        return listaBauturi;
    }

    public void addMancare(Mancare mancare){
        listaMancare.add(mancare);
    }
    public  void addBauturi(Bauturi bauturi){
        listaBauturi.add(bauturi);
    }

    public void getMancare(){
        System.out.println("This is all food on the menu: ");
        for(int i = 0;i<listaMancare.size();i++){
            Mancare stocks = listaMancare.get(i);
            System.out.println(stocks.toString());
        }
    }
    public void getBauturi(){
        System.out.println("This is all our drink on menu: ");
        for(int i = 0;i<listaBauturi.size();i++){
            Bauturi stocks = listaBauturi.get(i);
            System.out.println(stocks.toString());
        }
    }

    public void mancareAleasa(int index){
        System.out.println("food type that you choos: ");
        for(int i=0;i<listaMancare.size();i++) {
            Mancare unFelDeMancare = listaMancare.get(i);
            if(unFelDeMancare.idProdus == index){
                System.out.println(unFelDeMancare.toString());
            }
        }

        //if(id == unFelDeMancare.idProdus){
        //System.out.println(unFelDeMancare);}
    }

    public void mancarePeStock(){
        System.out.println("what food do we have diponible: ");
        for (int i = 0; i<listaMancare.size();i++){
            Mancare felDeMancare = listaMancare.get(i);
            if(felDeMancare.disponibil == true){
                System.out.println(felDeMancare);
            }
        }
    }
    public void bauturiPeStock(){
        System.out.println("what drink we have on the stock: ");
        for (int i = 0; i<listaBauturi.size();i++){
            Bauturi bauturi = listaBauturi.get(i);
            if(bauturi.disponibil == true){
                System.out.println(bauturi);
            }
        }
    }
    public void comandaMancare(int index,int cantitate){

        boolean flag = false;
        for(int i=0;i<listaMancare.size();i++){
            Mancare mancare = listaMancare.get(i);
            if(mancare.idProdus == index){
                mancare.contorMeniuri = mancare.contorMeniuri + cantitate;
                flag = true;
                mancare.numarProduse =mancare.numarProduse- cantitate; // se comanda produsul cu id =index si scade cantitatea din stoc
                System.out.println("stocul de mancare cu id-ul: " +mancare.idProdus+" si denumirea acestea "+mancare.denumireProdus+" a scazut la "+ mancare.numarProduse );
            }
        }
        if(flag == false ){
            System.out.println("produsul "+index+" nu mai este pe stoc, verificati stocul folosind comanda bautura pe stoc");
        }

    }
    public void comandaBautura(int index,int cantitate){
        boolean flag = false;
        for(int i=0;i<listaBauturi.size();i++){
            Bauturi bauturi = listaBauturi.get(i);

            if(bauturi.idProdus == index){
                bauturi.contorBauturi = bauturi.contorBauturi + cantitate;
                flag = true;
                bauturi.numarProduse =bauturi.numarProduse- cantitate; // se comanda produsul cu id =index si scade cantitatea din stoc
                System.out.println("stocul de bautura cu id-ul: " +bauturi.idProdus+" si denumirea acesteia "+bauturi.denumireProdus+" a scazut la "+ bauturi.numarProduse );
                
            }
        }
        if(flag == false){
            System.out.println("produsul "+index+" nu mai este pe stoc, verificati stocul folosind comanda bautura pe stoc");
        }

    }




    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();

        for(Mancare m: listaMancare){
            buffer.append(m.toString()+"\n");
        }
        for (Bauturi b: listaBauturi){
            buffer.append(b.toString()+"\n");
        }
        return  buffer.toString();
    }
    public void citireContorBauturi(){
        for(int i=0;i<listaBauturi.size();i++){
            Bauturi b = listaBauturi.get(i);
            System.out.println("au fost consumate un numar de "+ b.contorBauturi +
                    " de bauturile cu id ul "+b.idProdus+" cu denumirea produsului: "+b.denumireProdus);
        }

    }

    public void citireContorMancare(){
        for(int i=0;i<listaMancare.size();i++){
            Mancare  m= listaMancare.get(i);
            System.out.println("au fost consumate un numar de "+ m.contorMeniuri +
                    " de meniuri cu id ul "+m.idProdus+" cu denumirea produsului: "+m.denumireProdus);
        }

    }
}
