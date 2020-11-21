package model;

public class Salle {
	private int idSalle;
	private String batiment;
	private int idSection;
	
	public Salle(int prmIdSalle , String prmBatiment , int prmIdSection) {
		this.idSalle = prmIdSalle;
		this.batiment = prmBatiment;
		this.idSection = prmIdSection;
	}

	public int getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	public String getBatiment() {
		return batiment;
	}

	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}

	public int getIdSection() {
		return idSection;
	}

	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}
}
