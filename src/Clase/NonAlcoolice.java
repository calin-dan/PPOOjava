package Clase;

public class NonAlcoolice extends Bauturi implements IProdusRestaurant{
    protected String tipBautura;
    protected String temperatura;
    protected String producator;


    public NonAlcoolice(int idProdus, boolean disponibil, double pret, int numarProduse, String denumireProdus, double cantitate, String continut, String tipServire, String tipBautura, String temperatura,String producator) {
        super(idProdus, disponibil, pret, numarProduse, denumireProdus, cantitate, continut, tipServire);
        this.tipBautura = tipBautura;
        this.temperatura = temperatura;
        this.producator = producator;
    }

    public String getTipBautura() {
        return tipBautura;
    }

    public void setTipBautura(String tipBautura) {
        this.tipBautura = tipBautura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
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
        return "NonAlcoolice{" +
                "tipBautura='" + tipBautura + '\'' +
                ", temperatura='" + temperatura + '\'' +
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
