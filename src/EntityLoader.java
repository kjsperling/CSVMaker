import java.util.ArrayList;


public class EntityLoader {

    public ArrayList<String> loadEntityIntoList(String entity, int rowNumber){

        final String delimiter = ",";
        ArrayList<String> csvRow = new ArrayList<>();

        if(entity.toUpperCase().equals("CLIENTCORPORATION")){
                ClientCorp clientCorp = new ClientCorp();

                if(rowNumber==0){
                    csvRow.add(clientCorp.header);
                }else {
                    csvRow.add(clientCorp.getName()+rowNumber+delimiter);
                    csvRow.add(clientCorp.getAddress1()+delimiter);
                    csvRow.add(clientCorp.getCityState()+delimiter);
                    csvRow.add(clientCorp.getCountryName()+delimiter);
                    csvRow.add(clientCorp.getDescription()+delimiter);
                    csvRow.add(clientCorp.getBusinessSector()+delimiter);
                    csvRow.add(clientCorp.getStatus());
                }
        }

        return csvRow;
    }


}
