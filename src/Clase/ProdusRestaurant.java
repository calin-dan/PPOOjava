package Clase;

abstract class ProdusRestaurant implements IProdusRestaurant {
    protected int idProdus;
    protected boolean disponibil=true;
    protected double pret;
    protected int numarProduse;
    protected String denumireProdus;

    public ProdusRestaurant(int idProdus, boolean disponibil, double pret, int numarProduse,String denumireProdus) {
        this.idProdus = idProdus;
        this.disponibil = disponibil;
        this.pret = pret;
        this.numarProduse = numarProduse;
        this.denumireProdus = denumireProdus;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public void setDenumireProdus(String denumireProdus) {
        this.denumireProdus = denumireProdus;
    }

    public int getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(int idProdus) {
        this.idProdus = idProdus;
    }

    public boolean isDisponibil() {
        return disponibil;
    }


    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getNumarProduse() {
        return numarProduse;
    }

    public void setNumarProduse(int numarProduse) {
        this.numarProduse = numarProduse;
    }


}
