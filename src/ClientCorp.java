
public class ClientCorp {

    private String name;
    private String address1;
    private String cityState;
    private String countryName;
    private String description;
    private String businessSector;
    private String status;

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    String header = "name,address.address1,address.city,address.state,address.countryName,companyDescription,businessSectorList,status";

    ClientCorp(){

        this.name = "Test Client Corp";
        this.address1 =rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0, 13)]+" Street";
        this.cityState = constants.cityStates[rand.randInt(0, 48)];
        this.countryName = "United States";
        this.description = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Maecenas id lacus sed odio imperdiet dignissim. Donec erat nisl faucibus at.";
        this.businessSector = constants.businessSectors[rand.randInt(0, 3)];
        this.status = constants.status[rand.randInt(0, 3)];

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
