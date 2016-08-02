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
                csvRow.add(clientCorp.getCityState()+delimiter);
                csvRow.add(clientCorp.getZip()+delimiter);
                csvRow.add(clientCorp.getCountryName()+delimiter);
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
                csvRow.add(candidate.getStatus()+delimiter);
                csvRow.add(candidate.getEmail()+delimiter);
                csvRow.add(candidate.getPhone()+delimiter);
                csvRow.add(candidate.getPrimarySkills()+delimiter);
                csvRow.add(candidate.getComments()+delimiter);
                csvRow.add(candidate.getEducationDegree()+delimiter);
                csvRow.add(candidate.getEmployeeType()+delimiter);
                csvRow.add(candidate.getBusinessSectors());
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
        }

        return csvRow;
    }


}
