package Clase;

abstract public class Mancare extends ProdusRestaurant implements IProdusRestaurant {
    protected double gramaj;
    protected String[] incrediente;
    protected int contorMeniuri;

    public Mancare(int idProdus, boolean disponibil, double pret, int numarProduse, String denumireProdus, double gramaj, String[] incrediente) {
        super(idProdus, disponibil, pret, numarProduse, denumireProdus);
        this.gramaj = gramaj;
        this.incrediente = incrediente;
    }

    public double getGramaj() {
        return gramaj;
    }

    public void setGramaj(double gramaj) {
        this.gramaj = gramaj;
    }

    public String[] getIncrediente() {
        return incrediente;
    }

    public void setIncrediente(String[] incrediente) {
        this.incrediente = incrediente;
    }


}
