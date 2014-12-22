package com.ps.ssh.bean;



/**
 * TEmployment entity. @author MyEclipse Persistence Tools
 */

public class TEmployment  implements java.io.Serializable {


    // Fields    

     private Integer emplId;
     private String emplName;
     private String emplDesc;
     private String emplTreatment;
     private String emplFunction;
     private Integer emplIndustry;
     private Integer emplNumber;
     private String emplWorkplace;
     private String emplWorkType;
     private String emplRequestment;
     private String postRequestment;
     private String emplWorkYears;
     private Long emplReachTime;
     private Integer emplDept;
     private Integer emplHr;
     private Long emplStartTime;
     private Long emplEndTime;
     private Integer emplState;


    // Constructors

    /** default constructor */
    public TEmployment() {
    }

    
    /** full constructor */
    public TEmployment(String emplName, String emplDesc, String emplTreatment, String emplFunction, Integer emplIndustry, Integer emplNumber, String emplWorkplace, String emplWorkType, String emplRequestment, String postRequestment, String emplWorkYears, Long emplReachTime, Integer emplDept, Integer emplHr, Long emplStartTime, Long emplEndTime, Integer emplState) {
        this.emplName = emplName;
        this.emplDesc = emplDesc;
        this.emplTreatment = emplTreatment;
        this.emplFunction = emplFunction;
        this.emplIndustry = emplIndustry;
        this.emplNumber = emplNumber;
        this.emplWorkplace = emplWorkplace;
        this.emplWorkType = emplWorkType;
        this.emplRequestment = emplRequestment;
        this.postRequestment = postRequestment;
        this.emplWorkYears = emplWorkYears;
        this.emplReachTime = emplReachTime;
        this.emplDept = emplDept;
        this.emplHr = emplHr;
        this.emplStartTime = emplStartTime;
        this.emplEndTime = emplEndTime;
        this.emplState = emplState;
    }

   
    // Property accessors

    public Integer getEmplId() {
        return this.emplId;
    }
    
    public void setEmplId(Integer emplId) {
        this.emplId = emplId;
    }

    public String getEmplName() {
        return this.emplName;
    }
    
    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmplDesc() {
        return this.emplDesc;
    }
    
    public void setEmplDesc(String emplDesc) {
        this.emplDesc = emplDesc;
    }

    public String getEmplTreatment() {
        return this.emplTreatment;
    }
    
    public void setEmplTreatment(String emplTreatment) {
        this.emplTreatment = emplTreatment;
    }

    public String getEmplFunction() {
        return this.emplFunction;
    }
    
    public void setEmplFunction(String emplFunction) {
        this.emplFunction = emplFunction;
    }

    public Integer getEmplIndustry() {
        return this.emplIndustry;
    }
    
    public void setEmplIndustry(Integer emplIndustry) {
        this.emplIndustry = emplIndustry;
    }

    public Integer getEmplNumber() {
        return this.emplNumber;
    }
    
    public void setEmplNumber(Integer emplNumber) {
        this.emplNumber = emplNumber;
    }

    public String getEmplWorkplace() {
        return this.emplWorkplace;
    }
    
    public void setEmplWorkplace(String emplWorkplace) {
        this.emplWorkplace = emplWorkplace;
    }

    public String getEmplWorkType() {
        return this.emplWorkType;
    }
    
    public void setEmplWorkType(String emplWorkType) {
        this.emplWorkType = emplWorkType;
    }

    public String getEmplRequestment() {
        return this.emplRequestment;
    }
    
    public void setEmplRequestment(String emplRequestment) {
        this.emplRequestment = emplRequestment;
    }

    public String getPostRequestment() {
        return this.postRequestment;
    }
    
    public void setPostRequestment(String postRequestment) {
        this.postRequestment = postRequestment;
    }

    public String getEmplWorkYears() {
        return this.emplWorkYears;
    }
    
    public void setEmplWorkYears(String emplWorkYears) {
        this.emplWorkYears = emplWorkYears;
    }

    public Long getEmplReachTime() {
        return this.emplReachTime;
    }
    
    public void setEmplReachTime(Long emplReachTime) {
        this.emplReachTime = emplReachTime;
    }

    public Integer getEmplDept() {
        return this.emplDept;
    }
    
    public void setEmplDept(Integer emplDept) {
        this.emplDept = emplDept;
    }

    public Integer getEmplHr() {
        return this.emplHr;
    }
    
    public void setEmplHr(Integer emplHr) {
        this.emplHr = emplHr;
    }

    public Long getEmplStartTime() {
        return this.emplStartTime;
    }
    
    public void setEmplStartTime(Long emplStartTime) {
        this.emplStartTime = emplStartTime;
    }

    public Long getEmplEndTime() {
        return this.emplEndTime;
    }
    
    public void setEmplEndTime(Long emplEndTime) {
        this.emplEndTime = emplEndTime;
    }

    public Integer getEmplState() {
        return this.emplState;
    }
    
    public void setEmplState(Integer emplState) {
        this.emplState = emplState;
    }
   








}