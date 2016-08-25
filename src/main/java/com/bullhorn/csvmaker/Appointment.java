package com.bullhorn.csvmaker;


import java.util.Date;
import java.util.Objects;

public class Appointment {

    private String ownerID;
    private String contactID;
    private String candidateID;
    private String jobOrderID;
    private String placementID;
    private String dateBegin;
    private String dateEnd;
    private String type;
    private String subject;
    private String location;
    private String description;
    private String header = "owner.id,clientContactReference.id,candidateReference.id,jobOrder.id,placement.id,dateBegin,dateEnd,type,subject,location,description";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public Appointment() {

        this.ownerID = constants.internalUsers[rand.randInt(0,constants.internalUsers.length-1)];
        this.contactID = constants.clientContactIDs[rand.randInt(0,constants.clientContactIDs.length-1)];
        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.jobOrderID = constants.jobOrderIDs[rand.randInt(0,constants.jobOrderIDs.length-1)];
        this.placementID = constants.placementIDs[rand.randInt(0,constants.placementIDs.length-1)];
        this.dateBegin = rand.randDate();
        this.dateEnd = dateBegin;
        this.type = constants.appointmentType[rand.randInt(0,constants.appointmentType.length-1)];
        this.subject = "Generic subject_"+timestamp+"_";
        this.location = "Generic Location";
        this.description = "Generic description_"+timestamp+"_";
    }

    public String getHeader() {
        return header;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public String getContactID() {
        return contactID;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getJobOrderID() {
        return jobOrderID;
    }

    public String getPlacementID() {
        return placementID;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getType() {
        return type;
    }

    public String getSubject() {
        return subject;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
