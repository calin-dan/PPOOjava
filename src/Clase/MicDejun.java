package Clase;

import java.util.Arrays;

public class MicDejun extends Mancare implements IProdusRestaurant {
    protected static final int timpPreparare = 70;


    public MicDejun(int idProdus, boolean disponibil, double pret, int numarProduse, String denumireProdus, double gramaj, String[] incrediente) {
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
        return "MicDejun{" +
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
