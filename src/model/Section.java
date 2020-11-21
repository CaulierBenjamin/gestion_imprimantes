package model;

public class Section {
    private int idSection;
    private String sigleSection;
    private String libSection;

    public Section(int idSection, String sigleSection, String libSection) {
        this.idSection = idSection;
        this.sigleSection = sigleSection;
        this.libSection = libSection;
    }

    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public String getSigleSection() {
        return sigleSection;
    }

    public void setSigleSection(String sigleSection) {
        this.sigleSection = sigleSection;
    }

    public String getLibSection() {
        return libSection;
    }

    public void setLibSection(String libSection) {
        this.libSection = libSection;
    }
}
