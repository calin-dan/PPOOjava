package Clase;

import java.io.Serializable;
import java.util.Arrays;

public class MeniuPranz extends Mancare implements Serializable,IProdusRestaurant {
    protected static final int timpPreparare = 70;


    public MeniuPranz(int idProdus, boolean disponibil, double pret, int numarProduse, String denumireProdus, double gramaj, String[] incrediente) {
        super(idProdus, disponibil, pret, numarProduse, denumireProdus, gramaj, incrediente);

    }

    public int getTimpPreparare() {
        return timpPreparare;
    }

    @Override
    public int countProduct() {
        return 0;
    }

    @Override
    public void disponibilitate() {

    }

    @Override
    public String toString() {
        return "Pranz{" +
                "gramaj=" + gramaj +
                ", incrediente=" + Arrays.toString(incrediente) +
                ", idProdus=" + idProdus +
                ", disponibil=" + disponibil +
                ", pret=" + pret +
                ", numarProduse=" + numarProduse +
                ", denumireProdus='" + denumireProdus + '\'' +
                '}';
    }
}
