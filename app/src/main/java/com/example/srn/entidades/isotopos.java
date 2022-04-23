package com.example.srn.entidades;

public class isotopos {
    private Integer idisot;
    private String nomisot;
    private String simisot;
    private Integer zisot;
    private Integer aisot;
    private Double misot;

    public isotopos(Integer idisot, String nomisot, String simisot, Integer zisot, Integer aisot, Double misot) {
        this.idisot = idisot;
        this.nomisot = nomisot;
        this.simisot = simisot;
        this.zisot = zisot;
        this.aisot = aisot;
        this.misot = misot;
    }

    public Integer getIdisot() {
        return idisot;
    }

    public void setIdisot(Integer idisot) {
        this.idisot = idisot;
    }

    public String getNomisot() {
        return nomisot;
    }

    public void setNomisot(String nomisot) {
        this.nomisot = nomisot;
    }

    public String getSimisot() {
        return simisot;
    }

    public void setSimisot(String simisot) {
        this.simisot = simisot;
    }

    public Integer getZisot() {
        return zisot;
    }

    public void setZisot(Integer zisot) {
        this.zisot = zisot;
    }

    public Integer getAisot() {
        return aisot;
    }

    public void setAisot(Integer aisot) {
        this.aisot = aisot;
    }

    public Double getMisot() {
        return misot;
    }

    public void setMisot(Double misot) {
        this.misot = misot;
    }
}
