import java.util.ArrayList;

/**
 * Created by ksperling on 7/27/2016.
 */
public class EntityLoader {

    public ArrayList<String> loadEntityIntoList(String entity, int rowNumber){

        final String delimiter = ",";

        if(entity.toUpperCase().equals("CLIENTCORPORATION")){
                ClientCorp clientCorp = new ClientCorp();
                ArrayList<String> clientCorpRow = new ArrayList<>();

                if(rowNumber==0){
                    clientCorpRow.add(clientCorp.header);
                    return clientCorpRow;
                }else {
                    clientCorpRow.add(clientCorp.getName()+rowNumber+delimiter);
                    clientCorpRow.add(clientCorp.getAddress1()+delimiter);
                    clientCorpRow.add(clientCorp.getCityState()+delimiter);
                    clientCorpRow.add(clientCorp.getCountryName()+delimiter);
                    clientCorpRow.add(clientCorp.getDescription()+delimiter);
                    clientCorpRow.add(clientCorp.getBusinessSector()+delimiter);
                    clientCorpRow.add(clientCorp.getStatus());
                }

                return clientCorpRow;

        }else
            return null;

    }


}
