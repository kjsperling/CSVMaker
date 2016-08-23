package main;

import java.util.Date;
import java.util.Objects;

public class Lead {

    private String firstName;
    private String lastName;
    private String name;
    private String comments;
    private String companyName;
    private String email;
    private String phone;
    private String fax;
    private String mobile;
    private String preferredContact;
    private String salary;
    private String salaryLow;
    private String primarySkills;
    private String secondarySkills;
    private String willRelocate;
    private String assignedTo;
    private String smsOptIn;
    private String occupation;
    private String namePrefix;
    private String description;
    private String companyURL;
    private String source;
    private String type;
    private String status;

    private String header="firstName,lastName,name,comments,companyName,email,phone,fax,mobile,preferredContact,salary,salaryLow,primarySkills.name,secondarySkills.name,willRelocate,assignedTo.name,smsOptIn,occupation,namePrefix,description,companyURL,source,type,status";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public Lead() {
        this.firstName = "Test";
        this.lastName = "Lead"+"_"+timestamp+"_";
        this.name = firstName+" "+lastName;
        this.comments = "This is a Lead comment";
        this.companyName = "Lead Test Company";
        this.email = "@example.com";
        this.phone = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.fax = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.mobile = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.preferredContact = constants.leadPreferredContact[rand.randInt(0,constants.leadPreferredContact.length-1)];
        this.salary = rand.randString(50000,250000);
        this.salaryLow = rand.randString(40000,50000);
        this.primarySkills = constants.primarySkills[rand.randInt(0,constants.primarySkills.length-1)];
        this.secondarySkills = constants.primarySkills[rand.randInt(0,constants.primarySkills.length-1)];
        this.willRelocate = constants.trueOrFalse[rand.randInt(0,constants.trueOrFalse.length-1)];
        this.assignedTo = constants.corpUsers[rand.randInt(0,constants.corpUsers.length-1)];
        this.smsOptIn = constants.trueOrFalse[rand.randInt(0,constants.trueOrFalse.length-1)];
        this.occupation = constants.occupation[rand.randInt(0,constants.occupation.length-1)];
        this.namePrefix = constants.namePreix[rand.randInt(0,constants.namePreix.length-1)];
        this.description = "This is a Lead description";
        this.companyURL = "www.LeadTestCompany.com";
        this.source = constants.source[rand.randInt(0,constants.source.length-1)];
        this.type = constants.leadType[rand.randInt(0,constants.leadType.length-1)];
        this.status = constants.leadStatus[rand.randInt(0,constants.leadStatus.length-1)];

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

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getComments() {
        return comments;
    }

    public String getFax() {
        return fax;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPreferredContact() {
        return preferredContact;
    }

    public String getSalary() {
        return salary;
    }

    public String getSalaryLow() {
        return salaryLow;
    }

    public String getPrimarySkills() {
        return primarySkills;
    }

    public String getSecondarySkills() {
        return secondarySkills;
    }

    public String getWillRelocate() {
        return willRelocate;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getSmsOptIn() {
        return smsOptIn;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getDescription() {
        return description;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getHeader() {
        return header;
    }
}
