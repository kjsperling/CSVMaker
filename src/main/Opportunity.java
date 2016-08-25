package main;


import java.util.Date;
import java.util.Objects;

public class Opportunity {

    private String title;
    private String type;
    private String clientContactID;
    private String description;
    private String status;
    private String assignedUser;
    private String clientCorpID;
    private String address1;
    private String address2;
    private String cityState;
    private String zip;
    private String countryName;
    private String dealValue;
    private String educationDegree;
    private String estimatedDuration;
    private String estimatedEndDate;
    private String expectedBillRate;
    private String expectedFee;
    private String isOpen;
    private String numOpenings;
    private String salary;
    private String willRelocate;
    private String header = "title,type,clientContact.id,description,status,assignedUsers.id,clientCorporation.id,address.address1,address.address2,address.city,address.state,address.zip,address.countryName,dealValue,educationDegree,estimatedEndDate,estimatedDuration,expectedBillRate,expectedFee,isOpen,numOpenings,salary,willRelocate";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public Opportunity() {
        this.title = "Test Opportunity"+"_"+timestamp+"_";
        this.type = constants.opportunityType[rand.randInt(0,constants.opportunityType.length-1)];
        this.clientContactID = constants.clientContactIDs[rand.randInt(0,constants.clientContactIDs.length-1)];
        this.description = "This is an Opportunity description";
        this.status = constants.opportunityStatus[rand.randInt(0,constants.opportunityStatus.length-1)];
        this.assignedUser = "2";
        this.clientCorpID = constants.clientCorpIDs[rand.randInt(0,constants.clientCorpIDs.length-1)];
        this.address1 = rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0, constants.streetName.length-1)]+" Street";
        this.address2 = "Suite " + rand.randString(1, 200);
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.zip = rand.randString(10000,99999);
        this.countryName = "United States";
        this.dealValue = rand.randString(10000,100000);
        this.educationDegree = constants.educationDegree[rand.randInt(0,constants.educationDegree.length-1)];
        this.estimatedEndDate = rand.randDate()+" 00:00";
        this.estimatedDuration = rand.randString(10,365);
        this.expectedBillRate = rand.randString(10,100);
        this.expectedFee = rand.randString(1000,50000);
        this.isOpen = constants.trueOrFalse[rand.randInt(0,constants.trueOrFalse.length-1)];
        this.numOpenings = rand.randString(1,10);
        this.salary = rand.randString(25000,250000);
        this.willRelocate = constants.trueOrFalse[rand.randInt(0,constants.trueOrFalse.length-1)];
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getClientContactID() {
        return clientContactID;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public String getHeader() {
        return header;
    }

    public String getClientCorpID() {
        return clientCorpID;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCityState() {
        return cityState;
    }

    public String getZip() {
        return zip;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getDealValue() {
        return dealValue;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public String getEstimatedDuration() {
        return estimatedDuration;
    }

    public String getEstimatedEndDate() {
        return estimatedEndDate;
    }

    public String getExpectedBillRate() {
        return expectedBillRate;
    }

    public String getExpectedFee() {
        return expectedFee;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public String getNumOpenings() {
        return numOpenings;
    }

    public String getSalary() {
        return salary;
    }

    public String getWillRelocate() {
        return willRelocate;
    }
}
