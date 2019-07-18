package com.tw.apistackbase.entity;

import javax.persistence.*;

@Entity
public class CriminalCase {
    @Id
    @GeneratedValue
    private  int id;
    @Column(length = 255,nullable = false)
    private  String name;
    private  long caseTime;
    @OneToOne(cascade = CascadeType.ALL)
    private  SpecificInfo specificInfo;
    private  Procuratorate procuratorate;

    public SpecificInfo getSpecificInfo() {
        return specificInfo;
    }

    public void setSpecificInfo(SpecificInfo specificInfo) {
        this.specificInfo = specificInfo;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }

    public CriminalCase(String name, long caseTime, SpecificInfo specificInfo) {
        this.name = name;
        this.specificInfo = specificInfo;
        this.caseTime = caseTime;
    }

    public CriminalCase(int id, String name, long caseTime, SpecificInfo specificInfo) {
        this.id = id;
        this.name = name;
        this.specificInfo = specificInfo;
        this.caseTime = caseTime;
    }

    public CriminalCase() {
    }

    public CriminalCase(String name, long caseTime) {
        this.name = name;
        this.caseTime = caseTime;
    }

    public CriminalCase(int id, String name, long caseTime) {
        this.id = id;
        this.name = name;
        this.caseTime = caseTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(long caseTime) {
        this.caseTime = caseTime;
    }
}
