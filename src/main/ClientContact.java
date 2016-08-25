package main;

import java.util.Date;
import java.util.Objects;

public class ClientContact {

    private String firstName;
    private String lastName;
    private String name;
    private String status;
    private String email;
    private String title;
    private String clientCorporationID;
    private String phone;
    private String mobile;
    //private String categoriesName;
    private String address1;
    private String address2;
    private String cityState;
    private String zip;
    private String countryName;
    private String comments;
    private String header ="firstName,lastName,name,status,email,occupation,clientCorporation.id,phone,mobile," +
            "address.address1,address.address2,address.city,address.state,address.zip,address.countryName,comments";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public ClientContact() {
        this.firstName = "Test";
        this.lastName = "ClientContact"+"_"+timestamp+"_";
        this.name = firstName+" "+lastName;
        this.status = constants.clientContactStatus[rand.randInt(0,constants.clientContactStatus.length-1)];
        this.email = "@example.com";
        this.title = constants.contactTitle[rand.randInt(0,constants.contactTitle.length-1)];
        this.clientCorporationID = constants.clientCorpIDs[rand.randInt(0,constants.clientCorpIDs.length-1)];
        this.phone = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.mobile = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        //this.categoriesName = constants.categories[rand.randInt(0,constants.categories.length-1)];
        this.address1 = rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0, constants.streetName.length-1)]+" Street";
        this.address2 = "Suite " + rand.randString(1, 200);
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.zip = rand.randString(10000,99999);
        this.countryName = "United States";
        this.comments = "Generic description about a Candidate";
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

    public String getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getClientCorporationID() {
        return clientCorporationID;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

//    public String getCategoriesName() {
//        return categoriesName;
//    }

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

    public String getComments() {
        return comments;
    }
}
