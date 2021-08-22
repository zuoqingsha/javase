package com.chenxk.entity;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/14 18:56
 */
public class Building {
    private int id;
    private String estateCode;
    private String buildingCode;
    private String buildingName;

    public Building() {
    }

    public Building(int id, String estateCode, String buildingCode, String buildingName) {
        this.id = id;
        this.estateCode = estateCode;
        this.buildingCode = buildingCode;
        this.buildingName = buildingName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstateCode() {
        return estateCode;
    }

    public void setEstateCode(String estateCode) {
        this.estateCode = estateCode;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Building(String estateCode, String buildingCode, String buildingName) {
        this.estateCode = estateCode;
        this.buildingCode = buildingCode;
        this.buildingName = buildingName;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", estateCode='" + estateCode + '\'' +
                ", buildingCode='" + buildingCode + '\'' +
                ", buildingName='" + buildingName + '\'' +
                '}';
    }
}
