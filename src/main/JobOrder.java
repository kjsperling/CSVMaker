package main;

import java.util.Date;
import java.util.Objects;

public class JobOrder {

    private String title;
    private String salary;
    private String skills;
    private String startDate;
    private String description;
    private String isOpen;
    private String employmentType;
    private String address1;
    private String cityState;
    private String zip;
    private String countryID;
    private String clientContactID;
    private String clientCorporationID;
    private String OwnerID;
    private String businessSector;
    private String status;
    private Integer hoursPerWeek;
    private Integer durationWeeks;
    private String taxStatus;
    private String salaryUnit;
    private String header = "title,salary,skills.name,startDate,description,isOpen,employmentType,address.address1,address.city,address.state," +
            "address.zip,address.countryID,clientContact.id,clientCorporation.id,owner.id,businessSectors.name,status,hoursPerWeek,durationWeeks,taxStatus,salaryUnit";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public JobOrder() {
        this.title = "Test Job Order"+"_"+timestamp+"_";
        this.salary = rand.randString(10000,100000);
        this.skills = constants.primarySkills[rand.randInt(0,constants.primarySkills.length-1)];
        this.startDate = rand.randDate();
        this.description = "This is a Job Order Description";
        this.isOpen = constants.trueOrFalse[rand.randInt(0,constants.trueOrFalse.length-1)];
        this.employmentType = constants.employmentType[rand.randInt(0,constants.employmentType.length-1)];
        this.address1 = rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0, constants.streetName.length-1)]+" Street";
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.zip = rand.randString(10000,99999);
        this.countryID = "1";
        this.clientContactID = constants.clientContactIDs[rand.randInt(0,constants.clientContactIDs.length-1)];
        this.clientCorporationID = constants.clientCorpIDs[rand.randInt(0,constants.clientCorpIDs.length-1)];
        this.OwnerID = constants.internalUsers[rand.randInt(0,constants.internalUsers.length-1)];
        this.businessSector = constants.businessSectors[rand.randInt(0,constants.businessSectors.length-1)];
        this.status = constants.jobOrderStatus[rand.randInt(0,constants.jobOrderStatus.length-1)];
        this.hoursPerWeek = rand.randInt(1,40);
        this.durationWeeks = rand.randInt(1,52);
        this.taxStatus = "W2";
        this.salaryUnit = "yearly";
    }

    public String getTitle() {
        return title;
    }

    public String getSalary() {
        return salary;
    }

    public String getSkills() {
        return skills;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getDescription() {
        return description;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCityState() {
        return cityState;
    }

    public String getZip() {
        return zip;
    }

    public String getCountryID() {
        return countryID;
    }

    public String getClientContactID() {
        return clientContactID;
    }

    public String getClientCorporationID() {
        return clientCorporationID;
    }

    public String getOwnerID() {
        return OwnerID;
    }

    public String getBusinessSector() {
        return businessSector;
    }

    public String getStatus() {
        return status;
    }

    public Integer getHoursPerWeek() {
        return hoursPerWeek;
    }

    public Integer getDurationWeeks() {
        return durationWeeks;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public String getSalaryUnit() {
        return salaryUnit;
    }

    public String getHeader() {
        return header;
    }
}
