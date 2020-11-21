package model;

public class Conmodel {
    private int idConsommable;
    private int idModele_Imprimante;

    public Conmodel(int idConsommable, int idModele_Imprimante) {
        this.idConsommable = idConsommable;
        this.idModele_Imprimante = idModele_Imprimante;
    }

    public int getIdConsommable() {
        return idConsommable;
    }

    public void setIdConsommable(int idConsommable) {
        this.idConsommable = idConsommable;
    }

    public int getIdModele_Imprimante() {
        return idModele_Imprimante;
    }

    public void setIdModele_Imprimante(int idModele_Imprimante) {
        this.idModele_Imprimante = idModele_Imprimante;
    }
}
