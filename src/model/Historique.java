package model;

import java.util.Date;

public class Historique {
    private int idHistorique;
    private Date dateHistorique;
    private int quantiteHistorique;
    private int idConsomable;
    private int idUtilisateur;
    private int idSalle;

    public Historique(int idHistorique, Date dateHistorique, int quantiteHistorique, int idConsomable, int idUtilisateur, int idSalle) {
        this.idHistorique = idHistorique;
        this.dateHistorique = dateHistorique;
        this.quantiteHistorique = quantiteHistorique;
        this.idConsomable = idConsomable;
        this.idUtilisateur = idUtilisateur;
        this.idSalle = idSalle;
    }

    public int getIdHistorique() {
        return idHistorique;
    }

    public void setIdHistorique(int idHistorique) {
        this.idHistorique = idHistorique;
    }

    public Date getDateHistorique() {
        return dateHistorique;
    }

    public void setDateHistorique(Date dateHistorique) {
        this.dateHistorique = dateHistorique;
    }

    public int getQuantiteHistorique() {
        return quantiteHistorique;
    }

    public void setQuantiteHistorique(int quantiteHistorique) {
        this.quantiteHistorique = quantiteHistorique;
    }

    public int getIdConsomable() {
        return idConsomable;
    }

    public void setIdConsomable(int idConsomable) {
        this.idConsomable = idConsomable;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }
}
