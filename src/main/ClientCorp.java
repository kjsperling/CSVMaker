package main;

import java.util.Date;
import java.util.Objects;

public class ClientCorp {

    private String name;
    private String address1;
    private String address2;
    private String cityState;
    private String zip;
    private String countryName;
    private String parentClientCorporationID;
    private String phone;
    private String fax;
    private String companyURL;
    private Integer numOffices;
    private Integer numEmployees;
    private Integer annualRevenue;
    private String description;
    private String businessSector;
    private String status;
    private String header = "name,address.address1,address.address2,address.city,address.state,address.zip,address.countryName,parentClientCorporation.id," +
            "phone,fax,companyURL,numOffices,numEmployees,annualRevenue,companyDescription,businessSectorList,status";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());


    public ClientCorp(){

        this.name = "Test Client Corp"+"_"+timestamp+"_";
        this.address1 = rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0,constants.streetName.length-1)]+" Street";
        this.address2 = "Suite "+rand.randString(1, 200);
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.zip = rand.randString(10000,99999);
        this.countryName = "United States";
        this.parentClientCorporationID = constants.clientCorpIDs[rand.randInt(0,constants.clientCorpIDs.length-1)];
        this.phone = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.fax = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.companyURL = "www.example_"+System.currentTimeMillis()+"_"+rand.randInt(0,100)+".com";
        this.numOffices = rand.randInt(1,25);
        this.numEmployees = rand.randInt(1,500);
        this.annualRevenue = rand.randInt(1,25);
        this.description = "This is a Client Corp Description";
        this.businessSector = constants.businessSectors[rand.randInt(0,constants.businessSectors.length-1)];
        this.status = constants.clientCorpStatus[rand.randInt(0,constants.clientCorpStatus.length-1)];

    }

    public String getHeader(){
        return header;
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

    public String getZip(){return zip;}

    public String getCountryName() {
        return countryName;
    }

    public String getParentClientCorporationID() {
        return parentClientCorporationID;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public Integer getNumOffices() {
        return numOffices;
    }

    public Integer getNumEmployees() {
        return numEmployees;
    }

    public Integer getAnnualRevenue() {
        return annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public String getBusinessSector() {
        return businessSector;
    }

    public String getStatus() {
        return status;
    }

}
