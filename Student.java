package com.practice.fullstack.model;


import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SNo;

    @Column(name = "cccode")
    private String cccode;

    @Column(name = "cccredit")
    private String cccredit;

    @Column(name = "corecourse")
    private String corecourse;

    @Column(name = "dccode")
    private String dccode;

    @Column(name = "dccredit")
    private String dccredit;

    @Column(name = "domaincourse")
    private String domaincourse;

    @Column(name = "sccode")
    private String sccode;

    @Column(name = "sccredit")
    private String sccredit;

    @Column(name = "skillcourse")
    private String skillcourse;

    public int getSNo() {
        return SNo;
    }

    public void setSNo(int SNo) {
        this.SNo = SNo;
    }

    public String getCccode() {
        return cccode;
    }

    public void setCccode(String cccode) {
        this.cccode = cccode;
    }

    public String getCccredit() {
        return cccredit;
    }

    public void setCccredit(String cccredit) {
        this.cccredit = cccredit;
    }

    public String getCorecourse() {
        return corecourse;
    }

    public void setCorecourse(String corecourse) {
        this.corecourse = corecourse;
    }

    public String getDccode() {
        return dccode;
    }

    public void setDccode(String dccode) {
        this.dccode = dccode;
    }

    public String getDccredit() {
        return dccredit;
    }

    public void setDccredit(String dccredit) {
        this.dccredit = dccredit;
    }

    public String getDomaincourse() {
        return domaincourse;
    }

    public void setDomaincourse(String domaincourse) {
        this.domaincourse = domaincourse;
    }

    public String getSccode() {
        return sccode;
    }

    public void setSccode(String sccode) {
        this.sccode = sccode;
    }

    public String getSccredit() {
        return sccredit;
    }

    public void setSccredit(String sccredit) {
        this.sccredit = sccredit;
    }

    public String getSkillcourse() {
        return skillcourse;
    }

    public void setSkillcourse(String skillcourse) {
        this.skillcourse = skillcourse;
    }
}
