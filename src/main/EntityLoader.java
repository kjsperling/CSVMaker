package main;

import java.util.ArrayList;


public class EntityLoader {

    public ArrayList<String> loadEntityIntoList(String entity, int rowNumber){

        final String delimiter = ",";
        ArrayList<String> csvRow = new ArrayList<>();

        if(entity.equalsIgnoreCase("clientcorporation")){
            ClientCorp clientCorp = new ClientCorp();

            if(rowNumber==0){
                csvRow.add(clientCorp.getHeader());
            }else {
                csvRow.add(clientCorp.getName()+rowNumber+delimiter);
                csvRow.add(clientCorp.getAddress1()+delimiter);
                csvRow.add(clientCorp.getAddress2()+delimiter);
                csvRow.add(clientCorp.getCityState()+delimiter);
                csvRow.add(clientCorp.getZip()+delimiter);
                csvRow.add(clientCorp.getCountryName()+delimiter);
                csvRow.add(clientCorp.getParentClientCorporationID()+delimiter);
                csvRow.add(clientCorp.getPhone()+delimiter);
                csvRow.add(clientCorp.getFax()+delimiter);
                csvRow.add(clientCorp.getCompanyURL()+delimiter);
                csvRow.add(clientCorp.getNumOffices()+delimiter);
                csvRow.add(clientCorp.getNumEmployees()+delimiter);
                csvRow.add(clientCorp.getAnnualRevenue()+delimiter);
                csvRow.add(clientCorp.getDescription()+delimiter);
                csvRow.add(clientCorp.getBusinessSector()+delimiter);
                csvRow.add(clientCorp.getStatus());
            }
        }else if(entity.equalsIgnoreCase("candidate")){
            Candidate candidate = new Candidate();

            if(rowNumber==0){
                csvRow.add(candidate.getHeader());
            }else {
                csvRow.add(candidate.getFirstName()+delimiter);
                csvRow.add(candidate.getLastName()+rowNumber+delimiter);
                csvRow.add(candidate.getName()+rowNumber+delimiter);
                csvRow.add(candidate.getAddress1()+delimiter);
                csvRow.add(candidate.getAddress2()+delimiter);
                csvRow.add(candidate.getCityState()+delimiter);
                csvRow.add(candidate.getZip()+delimiter);
                csvRow.add(candidate.getCountryName()+delimiter);
                csvRow.add(candidate.getStatus()+delimiter);
                csvRow.add(candidate.getFirstName()+candidate.getLastName()+rowNumber+candidate.getEmail()+delimiter);
                csvRow.add(candidate.getPhone()+delimiter);
                csvRow.add(candidate.getMobile()+delimiter);
                csvRow.add(candidate.getPrimarySkills()+delimiter);
                csvRow.add(candidate.getComments()+delimiter);
                csvRow.add(candidate.getEducationDegree()+delimiter);
                csvRow.add(candidate.getEmployeeType()+delimiter);
                //csvRow.add(candidate.getBusinessSectors()+delimiter);
                csvRow.add(candidate.getGender()+delimiter);
                csvRow.add(candidate.getFederalFilingStatus()+delimiter);
                csvRow.add(candidate.getFederalExemptions()+delimiter);
                csvRow.add(candidate.getTaxState()+delimiter);
                csvRow.add(candidate.getStateFilingStatus()+delimiter);
                csvRow.add(candidate.getStateExemptions()+delimiter);
                csvRow.add(candidate.getLocalFilingStatus()+delimiter);
                csvRow.add(candidate.getI9OnFile()+delimiter);
                csvRow.add(candidate.getSmsOptIn()+delimiter);
                csvRow.add(candidate.getDescription());
            }
        }else if(entity.equalsIgnoreCase("clientcontact")){
            ClientContact clientContact = new ClientContact();

            if(rowNumber==0){
                csvRow.add(clientContact.getHeader());
            }else {
                csvRow.add(clientContact.getFirstName()+delimiter);
                csvRow.add(clientContact.getLastName()+rowNumber+delimiter);
                csvRow.add(clientContact.getName()+rowNumber+delimiter);
                csvRow.add(clientContact.getStatus()+delimiter);
                csvRow.add(clientContact.getEmail()+delimiter);
                csvRow.add(clientContact.getTitle()+delimiter);
                csvRow.add(clientContact.getClientCorporationID()+delimiter);
                csvRow.add(clientContact.getPhone()+delimiter);
                csvRow.add(clientContact.getMobile()+delimiter);
                //csvRow.add(clientContact.getCategoriesName()+delimiter);
                csvRow.add(clientContact.getAddress1()+delimiter);
                csvRow.add(clientContact.getAddress2()+delimiter);
                csvRow.add(clientContact.getCityState()+delimiter);
                csvRow.add(clientContact.getZip()+delimiter);
                csvRow.add(clientContact.getCountryName()+delimiter);
                csvRow.add(clientContact.getComments());
            }
        }else if(entity.equalsIgnoreCase("joborder")){
            JobOrder jobOrder = new JobOrder();

            if(rowNumber==0){
                csvRow.add(jobOrder.getHeader());
            }else{
                csvRow.add(jobOrder.getTitle()+rowNumber+delimiter);
                csvRow.add(jobOrder.getSalary()+delimiter);
                csvRow.add(jobOrder.getSkills()+delimiter);
                csvRow.add(jobOrder.getStartDate()+delimiter);
                csvRow.add(jobOrder.getDescription()+delimiter);
                csvRow.add(jobOrder.getIsOpen()+delimiter);
                csvRow.add(jobOrder.getEmploymentType()+delimiter);
                csvRow.add(jobOrder.getAddress1()+delimiter);
                csvRow.add(jobOrder.getCityState()+delimiter);
                csvRow.add(jobOrder.getZip()+delimiter);
                csvRow.add(jobOrder.getCountryID()+delimiter);
                csvRow.add(jobOrder.getClientContactID()+delimiter);
                csvRow.add(jobOrder.getClientCorporationID()+delimiter);
                csvRow.add(jobOrder.getOwnerID()+delimiter);
                csvRow.add(jobOrder.getBusinessSector()+delimiter);
                csvRow.add(jobOrder.getStatus()+delimiter);
                csvRow.add(jobOrder.getHoursPerWeek()+delimiter);
                csvRow.add(jobOrder.getDurationWeeks()+delimiter);
                csvRow.add(jobOrder.getTaxStatus()+delimiter);
                csvRow.add(jobOrder.getSalaryUnit());
            }
        }else if(entity.equalsIgnoreCase("lead")){
            Lead lead = new Lead();

            if(rowNumber==0){
                csvRow.add(lead.getHeader());
            }else {
                csvRow.add(lead.getFirstName()+delimiter);
                csvRow.add(lead.getLastName()+rowNumber+delimiter);
                csvRow.add(lead.getName()+rowNumber+delimiter);
                csvRow.add(lead.getComments()+delimiter);
                csvRow.add(lead.getCompanyName()+delimiter);
                csvRow.add(lead.getFirstName()+lead.getLastName()+rowNumber+lead.getEmail()+delimiter);
                csvRow.add(lead.getPhone()+delimiter);
                csvRow.add(lead.getFax()+delimiter);
                csvRow.add(lead.getMobile()+delimiter);
                csvRow.add(lead.getPreferredContact()+delimiter);
                csvRow.add(lead.getSalary()+delimiter);
                csvRow.add(lead.getSalaryLow()+delimiter);
                csvRow.add(lead.getPrimarySkills()+delimiter);
                csvRow.add(lead.getSecondarySkills()+delimiter);
                csvRow.add(lead.getWillRelocate()+delimiter);
                csvRow.add(lead.getAssignedTo()+delimiter);
                csvRow.add(lead.getSmsOptIn()+delimiter);
                csvRow.add(lead.getOccupation()+delimiter);
                csvRow.add(lead.getNamePrefix()+delimiter);
                csvRow.add(lead.getDescription()+delimiter);
                csvRow.add(lead.getCompanyURL()+delimiter);
                csvRow.add(lead.getSource()+delimiter);
                csvRow.add(lead.getType()+delimiter);
                csvRow.add(lead.getStatus()+delimiter);
                csvRow.add(lead.getAddress1()+delimiter);
                csvRow.add(lead.getAddress2()+delimiter);
                csvRow.add(lead.getCityState()+delimiter);
                csvRow.add(lead.getZip()+delimiter);
                csvRow.add(lead.getCountryName());
            }
        }else if(entity.equalsIgnoreCase("opportunity")){
            Opportunity opportunity = new Opportunity();

            if (rowNumber==0){
                csvRow.add(opportunity.getHeader());
            }else {
                csvRow.add(opportunity.getTitle()+rowNumber+delimiter);
                csvRow.add(opportunity.getType()+delimiter);
                csvRow.add(opportunity.getClientContactID()+delimiter);
                csvRow.add(opportunity.getDescription()+delimiter);
                csvRow.add(opportunity.getStatus()+delimiter);
                csvRow.add(opportunity.getAssignedUser());
            }
        }else if(entity.equalsIgnoreCase("placement")){
            Placement placement = new Placement();

            if(rowNumber==0){
                csvRow.add(placement.getHeader());
            }else {
                csvRow.add(placement.getJobOrderID()+delimiter);
                csvRow.add(placement.getCandidateID()+delimiter);
                csvRow.add(placement.getDateBegin()+delimiter);
                csvRow.add(placement.getPayrate()+delimiter);
                csvRow.add(placement.getEmploymentType()+delimiter);
                csvRow.add(placement.getStatus()+delimiter);
                csvRow.add(placement.getSalaryUnit()+delimiter);
                csvRow.add(placement.getClientBillRate()+delimiter);
                csvRow.add(placement.getHoursPerDay());
            }
        }else if(entity.equalsIgnoreCase("jobsubmission")){
            JobSubmission jobSubmission = new JobSubmission();

            if(rowNumber==0){
                csvRow.add(jobSubmission.getHeader());
            }else {
                csvRow.add(jobSubmission.getCandidateID()+delimiter);
                csvRow.add(jobSubmission.getJobOrderID()+delimiter);
                csvRow.add(jobSubmission.getPayRate()+delimiter);
                csvRow.add(jobSubmission.getBillRate()+delimiter);
                csvRow.add(jobSubmission.getSubmissionSource()+delimiter);
                csvRow.add(jobSubmission.getSubmissionStatus()+delimiter);
                csvRow.add(jobSubmission.getDateAdded());
            }
        }else if(entity.equalsIgnoreCase("note")){
            Note note = new Note();

            if(rowNumber==0){
                csvRow.add(note.getHeader());
            }else {
                csvRow.add(note.getCommentingPersonName()+delimiter);
                csvRow.add(note.getComments()+delimiter);
                csvRow.add(note.getAction()+delimiter);
                csvRow.add(note.getDateAdded()+delimiter);
                csvRow.add(note.getPersonReferenceID()+delimiter);
                csvRow.add(note.getCandidateID()+delimiter);
                csvRow.add(note.getJobOrderID());
            }
        }

        return csvRow;
    }


}
