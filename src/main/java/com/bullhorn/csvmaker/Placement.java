package com.bullhorn.csvmaker;


public class Placement {

    private String jobOrderID;
    private String candidateID;
    private String dateBegin;
    private Integer payrate;
    private String employmentType;
    private String status;
    private String salaryUnit;
    private Integer clientBillRate;
    private String hoursPerDay;
    private String header = "jobOrder.id,candidate.id,dateBegin,payRate,employmentType,status,salaryUnit,clientBillRate,hoursPerDay";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();

    public Placement() {
        this.jobOrderID = constants.jobOrderIDs[rand.randInt(0,constants.jobOrderIDs.length-1)];
        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.dateBegin = rand.randDate();
        this.payrate = rand.randInt(10, 100);
        this.employmentType = constants.employmentType[rand.randInt(0,constants.employmentType.length-1)];
        this.status = constants.placementStatus[rand.randInt(0,constants.placementStatus.length-1)];
        this.salaryUnit = "Hourly";
        this.clientBillRate = payrate+rand.randInt(10,50);
        this.hoursPerDay = rand.randString(1, 8);
    }

    public String getJobOrderID() {
        return jobOrderID;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public Integer getPayrate() {
        return payrate;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getStatus() {
        return status;
    }

    public String getSalaryUnit() {
        return salaryUnit;
    }

    public Integer getClientBillRate() {
        return clientBillRate;
    }

    public String getHoursPerDay() {
        return hoursPerDay;
    }

    public String getHeader() {
        return header;
    }
}
