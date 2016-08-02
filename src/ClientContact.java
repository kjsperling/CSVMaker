
public class ClientContact {

    private String firstName;
    private String lastName;
    private String name;
    private String clientCorporationName;
    private String categoriesName;
    private String address1;
    private String cityState;
    private String zip;
    private String countryName;
    private String header ="firstName,lastName,name,clientCorporation.name,categories.name,address.address1,address.city,address.state,address.zip,address.countryName";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();


    public ClientContact() {
        this.firstName = "Test";
        this.lastName = "ClientContact";
        this.name = firstName+" "+lastName;
        this.clientCorporationName = "Test Client Corp";
        this.categoriesName = constants.categories[rand.randInt(0,constants.categories.length-1)];
        this.address1 =rand.randString(1, 999)+" "+constants.streetName[rand.randInt(0, constants.streetName.length-1)]+" Street";
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.zip = rand.randString(10000,99999);
        this.countryName = "United States";
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

    public String getClientCorporationName() {
        return clientCorporationName;
    }

    public String getCategoriesName() {
        return categoriesName;
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

    public String getCountryName() {
        return countryName;
    }
}