package Clase;

public class Alcoolice extends Bauturi implements IProdusRestaurant {
    protected double alcool;
    protected String producator;


    public Alcoolice(int idProdus, boolean disponibil, double pret, int numarProduse, String denumireProdus,
                     double cantitate, String continut, String tipServire, double alcool, String producator)
    {
        super(idProdus, disponibil, pret, numarProduse, denumireProdus, cantitate, continut, tipServire);
        this.alcool = alcool;
        this.producator = producator;
    }

    public double getAlcool() {
        return alcool;
    }

    public void setAlcool(double alcool) {
        this.alcool = alcool;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }


    @Override
    public int countProduct() {
        int couter = 0;

        return 0;
    }

    @Override
    public void disponibilitate() {

    }

    @Override
    public String toString() {
        return "Alcoolice{" +
                "alcool=" + alcool +
                ", producator='" + producator + '\'' +
                ", cantitate=" + cantitate +
                ", continut='" + continut + '\'' +
                ", tipServire='" + tipServire + '\'' +
                ", idProdus=" + idProdus +
                ", disponibil=" + disponibil +
                ", pret=" + pret +
                ", numarProduse=" + numarProduse +
                ", denumireProdus='" + denumireProdus + '\'' +
                '}';
    }
}
