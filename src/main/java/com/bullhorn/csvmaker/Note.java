package com.bullhorn.csvmaker;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Note {

    private String action;
    private String candidateID;
    private String commentingPersonName;
    private String comments;
    private String dateAdded;
    private String jobOrderID;
    private String personReferenceID;
    private String header = "commentingPerson.name, comments, action, dateAdded, personReference.id, candidates.id, jobOrders.id";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    SimpleDateFormat dateFormat = new SimpleDateFormat("M/dd/yyyy HH:mm");
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public Note() {

        this.action = constants.noteAction[rand.randInt(0,constants.noteAction.length-1)];
        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.commentingPersonName = constants.corpUsers[rand.randInt(0,constants.corpUsers.length-1)];
        this.comments = "CSV Note " + timestamp;
        this.dateAdded = dateFormat.format(date).toString();
        this.jobOrderID = constants.jobOrderIDs[rand.randInt(0,constants.jobOrderIDs.length-1)];
        this.personReferenceID = constants.clientContactIDs[rand.randInt(0,constants.clientContactIDs.length-1)];

    }

    public String getHeader(){
        return header;
    }

    public String getAction() {
        return action;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getCommentingPersonName() {
        return commentingPersonName;
    }

    public String getComments() {
        return comments;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getJobOrderID() {
        return jobOrderID;
    }

    public String getPersonReferenceID() {
        return personReferenceID;
    }
}
