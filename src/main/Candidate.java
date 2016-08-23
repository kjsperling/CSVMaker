package main;

import java.util.Date;
import java.util.Objects;

public class Candidate {

    private String firstName;
    private String lastName;
    private String name;
    private String address1;
    private String address2;
    private String cityState;
    private String zip;
    private String countryName;
    private String status;
    private String email;
    private String phone;
    private String mobile;
    private String primarySkills;
    private String comments;
    private String educationDegree;
    private String employeeType;
    //private String businessSectors;
    private String gender;
    private String federalFilingStatus;
    private Integer federalExemptions;
    private String taxState;
    private String stateFilingStatus;
    private Integer stateExemptions;
    private String localFilingStatus;
    private Integer i9OnFile;
    private Integer smsOptIn;
    private String description;
    private String header = "firstName,lastName,name,address.address1,address.address2,address.city,address.state,address.zip,address.countryName," +
            "status,email,phone,mobile,primarySkills.name,comments,educationDegree,employeeType,gender,federalFilingStatus," +
            "federalExemptions,taxState,stateFilingStatus,stateExemptions,localFilingStatus,i9OnFile,smsOptIn,description";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public Candidate(){

        this.firstName = "Test";
        this.lastName = "Candidate"+"_"+timestamp+"_";
        this.name = firstName+" "+lastName;
        this.address1 = rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0, constants.streetName.length-1)]+" Street";
        this.address2 = "Suite " + rand.randString(1, 200);
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.zip = rand.randString(10000,99999);
        this.countryName = "United States";
        this.status = constants.candidateStatus[rand.randInt(0,7)];
        this.email = "@example.com";
        this.phone = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.mobile = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.primarySkills = constants.primarySkills[rand.randInt(0,constants.primarySkills.length-1)];
        this.comments = "This is a comment about a Candidate";
        this.educationDegree = constants.educationDegree[rand.randInt(0,constants.educationDegree.length-1)];
        this.employeeType = constants.employeeType[rand.randInt(0,constants.employeeType.length-1)];
        //this.businessSectors = constants.businessSectors[rand.randInt(0,constants.businessSectors.length-1)];
        this.gender = constants.gender[rand.randInt(0,constants.gender.length-1)];
        this.federalFilingStatus = constants.filingStatus[rand.randInt(0,constants.filingStatus.length-1)];
        this.federalExemptions = rand.randInt(0,8);
        this.taxState = constants.taxState[rand.randInt(0,constants.taxState.length-1)];
        this.stateFilingStatus = constants.filingStatus[rand.randInt(0,constants.filingStatus.length-1)];
        this.stateExemptions = rand.randInt(0,8);
        this.localFilingStatus = constants.filingStatus[rand.randInt(0,constants.filingStatus.length-1)];
        this.i9OnFile = rand.randInt(0,1);
        this.smsOptIn = rand.randInt(0,1);
        this.description = "Generic description about a Candidate";
    }

    public String getHeader(){
        return header;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
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

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPrimarySkills() {
        return primarySkills;
    }

    public String getComments() {
        return comments;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public String getEmployeeType() {
        return employeeType;
    }

//    public String getBusinessSectors() {
//        return businessSectors;
//    }

    public String getGender() {
        return gender;
    }

    public String getFederalFilingStatus() {
        return federalFilingStatus;
    }

    public Integer getFederalExemptions() {
        return federalExemptions;
    }

    public String getTaxState() {
        return taxState;
    }

    public String getStateFilingStatus() {
        return stateFilingStatus;
    }

    public Integer getStateExemptions() {
        return stateExemptions;
    }

    public String getLocalFilingStatus() {
        return localFilingStatus;
    }

    public Integer getI9OnFile() {
        return i9OnFile;
    }

    public Integer getSmsOptIn() {
        return smsOptIn;
    }

    public String getDescription() {
        return description;
    }
}
