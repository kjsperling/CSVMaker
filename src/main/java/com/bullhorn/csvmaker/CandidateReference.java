package com.bullhorn.csvmaker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CandidateReference {

    private String candidateID;
    private String clientCorporationID;
    private String dateAdded;
    private String employmentEnd;
    private String employmentStart;
    private String referenceEmail;
    private String referenceFirstName;
    private String referenceLastName;
    private String referencePhone;
    private String referenceTitle;
    private String yearsKnown;
    private String header = "candidate.id, dateAdded, referenceFirstName, referenceLastName, referencePhone, referenceTitle, referenceEmail, clientCorporation.id, yearsKnown, employmentStart, employmentEnd";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm");
    Date date = new Date();
    String timestamp = Objects.toString(date.getTime());

    public CandidateReference() {

        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.clientCorporationID = constants.clientCorpIDs[rand.randInt(0,constants.clientCorpIDs.length-1)];
        this.dateAdded = dateFormat.format(date).toString();
        this.employmentEnd = rand.randString(1,12) + "/" + rand.randString(1,28) + "/" + rand.randString(2008,2015) + " 00:00";
        this.employmentStart = rand.randString(1,12) + "/" + rand.randString(1,28) + "/" + rand.randString(2000,2007) + " 00:00";
        this.referenceEmail = "@example.com";
        this.referenceFirstName = constants.firstNames[rand.randInt(0,constants.firstNames.length-1)];
        this.referenceLastName = constants.lastNames[rand.randInt(0,constants.lastNames.length-1)];
        this.referencePhone = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.referenceTitle = constants.occupation[rand.randInt(0,constants.occupation.length-1)];
        this.yearsKnown = rand.randString(1,10);

    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getClientCorporationID() {
        return clientCorporationID;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getEmploymentEnd() {
        return employmentEnd;
    }

    public String getEmploymentStart() {
        return employmentStart;
    }

    public String getReferenceEmail() {
        return referenceEmail;
    }

    public String getReferenceFirstName() {
        return referenceFirstName;
    }

    public String getReferenceLastName() {
        return referenceLastName;
    }

    public String getReferencePhone() {
        return referencePhone;
    }

    public String getReferenceTitle() {
        return referenceTitle;
    }
    public String getYearsKnown() {
        return yearsKnown;
    }

    public String getHeader() {
        return header;
    }
}
