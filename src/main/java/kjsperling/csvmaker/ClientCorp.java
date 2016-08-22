package kjsperling.csvmaker;

public class ClientCorp {

    private String name;
    private String address1;
    private String cityState;
    private String zip;
    private String countryName;
    private String description;
    private String businessSector;
    private String status;
    private String header = "name,address.address1,address.city,address.state,address.zip,address.countryName,companyDescription,businessSectorList,status";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();


    public ClientCorp(){

        this.name = "Test Client Corp";
        this.address1 =rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0,constants.streetName.length-1)]+" Street";
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.zip = rand.randString(10000,99999);
        this.countryName = "United States";
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

    public String getCityState() {
        return cityState;
    }

    public String getZip(){return zip;}

    public String getCountryName() {
        return countryName;
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
