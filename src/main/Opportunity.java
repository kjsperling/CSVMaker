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
    private String header = "title,type,clientContact.id,description,status,assignedUsers.id";

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
}
