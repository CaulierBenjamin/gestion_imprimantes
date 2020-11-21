package model;

public class Modele_imprimante {
    private int idModele_Imprimante;
    private int refImprimante;
    private String modeleImprimante;
    private String marque;

    public Modele_imprimante(int idModele_Imprimante, int refImprimante, String modeleImprimante, String marque) {
        this.idModele_Imprimante = idModele_Imprimante;
        this.refImprimante = refImprimante;
        this.modeleImprimante = modeleImprimante;
        this.marque = marque;
    }

    public int getIdModele_Imprimante() {
        return idModele_Imprimante;
    }

    public void setIdModele_Imprimante(int idModele_Imprimante) {
        this.idModele_Imprimante = idModele_Imprimante;
    }

    public int getRefImprimante() {
        return refImprimante;
    }

    public void setRefImprimante(int refImprimante) {
        this.refImprimante = refImprimante;
    }

    public String getModeleImprimante() {
        return modeleImprimante;
    }

    public void setModeleImprimante(String modeleImprimante) {
        this.modeleImprimante = modeleImprimante;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
