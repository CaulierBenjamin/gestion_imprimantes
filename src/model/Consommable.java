package model;

public class Consommable {
    private int idConsommable;
    private int refConsommable;
    private int seuilAlerteConso;
    private int stockConso;
    private String typeConsommable;

    public Consommable(int idConsommable, int refConsommable, int seuilAlerteConso, int stockConso, String typeConsommable) {
        this.idConsommable = idConsommable;
        this.refConsommable = refConsommable;
        this.seuilAlerteConso = seuilAlerteConso;
        this.stockConso = stockConso;
        this.typeConsommable = typeConsommable;
    }

    public int getIdConsommable() {
        return idConsommable;
    }

    public void setIdConsommable(int idConsommable) {
        this.idConsommable = idConsommable;
    }

    public int getRefConsommable() {
        return refConsommable;
    }

    public void setRefConsommable(int refConsommable) {
        this.refConsommable = refConsommable;
    }

    public int getSeuilAlerteConso() {
        return seuilAlerteConso;
    }

    public void setSeuilAlerteConso(int seuilAlerteConso) {
        this.seuilAlerteConso = seuilAlerteConso;
    }

    public int getStockConso() {
        return stockConso;
    }

    public void setStockConso(int stockConso) {
        this.stockConso = stockConso;
    }

    public String getTypeConsommable() {
        return typeConsommable;
    }

    public void setTypeConsommable(String typeConsommable) {
        this.typeConsommable = typeConsommable;
    }
}
