package kjsperling.csvmaker;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;


public class EntityLoader {

    public ArrayList<String> loadEntityIntoList(String entity, int rowNumber){

        Date date = new Date();

        final String delimiter = ",";
        ArrayList<String> csvRow = new ArrayList();

        if(entity.equalsIgnoreCase("clientcorporation")){
            ClientCorp clientCorp = new ClientCorp();

            if(rowNumber==0){
                csvRow.add(clientCorp.getHeader());
            }else {
                csvRow.add(clientCorp.getName()+rowNumber+delimiter);
                csvRow.add(clientCorp.getAddress1()+delimiter);
                csvRow.add(clientCorp.getCityState()+delimiter);
                csvRow.add(clientCorp.getZip()+delimiter);
                csvRow.add(clientCorp.getCountryName()+delimiter);
                csvRow.add(clientCorp.getDescription()+delimiter);
                csvRow.add(clientCorp.getBusinessSector()+delimiter);
                csvRow.add(clientCorp.getStatus());
            }
        }else if(entity.equalsIgnoreCase("candidate")){
            Candidate candidate = new Candidate();
            String timestamp = Objects.toString(date.getTime());
            if(rowNumber==0){
                csvRow.add(candidate.getHeader());
            }else {
                csvRow.add(candidate.getFirstName()+delimiter);
                csvRow.add(candidate.getLastName()+"_"+timestamp+"_"+rowNumber+delimiter);
                csvRow.add(candidate.getName()+"_"+timestamp+"_"+rowNumber+delimiter);
                csvRow.add(candidate.getAddress1()+delimiter);
                csvRow.add(candidate.getCityState()+delimiter);
                csvRow.add(candidate.getZip()+delimiter);
                csvRow.add(candidate.getCountryName()+delimiter);
                csvRow.add(candidate.getStatus()+delimiter);
                csvRow.add(candidate.getEmail()+delimiter);
                csvRow.add(candidate.getPhone()+delimiter);
//                csvRow.add(candidate.getPrimarySkills()+delimiter);
                csvRow.add(candidate.getComments()+delimiter);
                csvRow.add(candidate.getEducationDegree()+delimiter);
                csvRow.add(candidate.getEmployeeType());
                //csvRow.add(candidate.getBusinessSectors());
            }
        }else if(entity.equalsIgnoreCase("clientcontact")){
            ClientContact clientContact = new ClientContact();

            if(rowNumber==0){
                csvRow.add(clientContact.getHeader());
            }else {
                csvRow.add(clientContact.getFirstName()+delimiter);
                csvRow.add(clientContact.getLastName()+rowNumber+delimiter);
                csvRow.add(clientContact.getName()+rowNumber+delimiter);
                csvRow.add(clientContact.getClientCorporationName()+delimiter);
                csvRow.add(clientContact.getCategoriesName()+delimiter);
                csvRow.add(clientContact.getAddress1()+delimiter);
                csvRow.add(clientContact.getCityState()+delimiter);
                csvRow.add(clientContact.getZip()+delimiter);
                csvRow.add(clientContact.getCountryName());
            }
        }else if(entity.equalsIgnoreCase("joborder")){
            JobOrder jobOrder = new JobOrder();

            if(rowNumber==0){
                csvRow.add(jobOrder.getHeader());
            }else{
                csvRow.add(jobOrder.getTitle()+rowNumber+delimiter);
                csvRow.add(jobOrder.getSalery()+delimiter);
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
                csvRow.add(jobOrder.getBusinessSector());
            }
        }else if(entity.equalsIgnoreCase("lead")){
            Lead lead = new Lead();

            if(rowNumber==0){
                csvRow.add(lead.getHeader());
            }else {
                csvRow.add(lead.getFirstName()+delimiter);
                csvRow.add(lead.getLastName()+rowNumber+delimiter);
                csvRow.add(lead.getName()+rowNumber+delimiter);
                csvRow.add(lead.getCompanyName()+delimiter);
                csvRow.add(lead.getName()+rowNumber+lead.getEmail()+delimiter);
                csvRow.add(lead.getPhone()+delimiter);
                csvRow.add(lead.getCompanyURL()+delimiter);
                csvRow.add(lead.getSource()+delimiter);
                csvRow.add(lead.getType()+delimiter);
                csvRow.add(lead.getStatus());
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
                csvRow.add(placement.getEmploymentType());
            }
        }

        return csvRow;
    }


}
