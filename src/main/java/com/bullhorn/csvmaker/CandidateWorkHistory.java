package com.bullhorn.csvmaker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CandidateWorkHistory {

    private String candidateID;
    private String comments;
    private String companyName;
    private String dateAdded;
    private String endDate;
    private String isLastJob;
    private String startDate;
    private String title;
    private String header = "candidate.id, dateAdded, startDate, endDate, isLastJob, companyName, title, comments";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    SimpleDateFormat dateFormat = new SimpleDateFormat("M/dd/yyyy HH:mm");
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public CandidateWorkHistory() {

        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.dateAdded = dateFormat.format(date).toString();
        this.startDate = rand.randString(1,12) + "/" + rand.randString(1,28) + "/" + rand.randString(2000,2007) + " 00:00";
        this.endDate = rand.randString(1,12) + "/" + rand.randString(1,28) + "/" + rand.randString(2008,2015) + " 00:00";
        this.isLastJob = rand.randString(0, 1);
        this.companyName = constants.companyNames[rand.randInt(0,constants.companyNames.length-1)];
        this.title = constants.occupation[rand.randInt(0,constants.occupation.length-1)];
        this.comments = "CSV CandidateWorkHistory " + timestamp;

    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getComments() {
        return comments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getIsLastJob() {
        return isLastJob;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getTitle() {
        return title;
    }

    public String getHeader() {
        return header;
    }
}
