package com.bullhorn.csvmaker;


public class Sendout {

    private String senderID;
    private String dateAdded;
    private String candidateID;
    private String jobOrderID;
    private String header = "user.id,dateAdded,candidate.id,jobOrder.id";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();

    public Sendout() {
        this.senderID = constants.internalUsers[rand.randInt(0,constants.internalUsers.length-1)];
        this. dateAdded = rand.randDate();
        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.jobOrderID = constants.jobOrderIDs[rand.randInt(0,constants.jobOrderIDs.length-1)];
    }

    public String getSenderID() {
        return senderID;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getJobOrderID() {
        return jobOrderID;
    }

    public String getHeader() {
        return header;
    }
}
