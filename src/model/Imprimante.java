package model;

public class Imprimante {
    private int idImprimante;
    private int idSalle;
    private int idModel_imprimante;

    public Imprimante(int prmidImprimante, int prmidSalle, int prmidModel_imprimante) {
        this.idImprimante = prmidImprimante;
        this.idSalle = prmidSalle;
        this.idModel_imprimante = prmidModel_imprimante;
    }

    public int getIdImprimante() {
        return idImprimante;
    }

    public void setIdImprimante(int idImprimante) {
        this.idImprimante = idImprimante;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getIdModel_imprimante() {
        return idModel_imprimante;
    }

    public void setIdModel_imprimante(int idModel_imprimante) {
        this.idModel_imprimante = idModel_imprimante;
    }
}
