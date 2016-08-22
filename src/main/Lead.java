package main;

import java.util.Date;
import java.util.Objects;

public class Lead {

    private String firstName;
    private String lastName;
    private String name;
    private String companyName;
    private String email;
    private String phone;
    private String companyURL;
    private String source;
    private String type;
    private String status;
    private String header="firstName,lastName,name,companyName,email,phone,companyURL,source,type,status";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public Lead() {
        this.firstName = "Test";
        this.lastName = "Lead"+"_"+timestamp+"_";
        this.name = firstName+" "+lastName;
        this.companyName = "Lead Test Company";
        this.email = firstName+lastName+"@example.com";
        this.phone = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
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
