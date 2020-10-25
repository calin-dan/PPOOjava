package Clase;

abstract class Bauturi extends ProdusRestaurant implements IProdusRestaurant {
    protected double cantitate;
    protected String continut;
    protected String tipServire;
    protected int contorBauturi=0;

    public Bauturi(int idProdus, boolean disponibil, double pret, int numarProduse, String denumireProdus, double cantitate, String continut, String tipServire) {
        super(idProdus, disponibil, pret, numarProduse, denumireProdus);
        this.cantitate = cantitate;
        this.continut = continut;
        this.tipServire = tipServire;
    }

    public int getContorBauturi() {
        return contorBauturi;
    }

    public double getCantitate() {
        return cantitate;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public String getTipServire() {
        return tipServire;
    }

    public void setTipServire(String tipServire) {
        this.tipServire = tipServire;
    }
}
