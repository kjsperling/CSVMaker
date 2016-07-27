import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class CSVMaker {

    //private final String delimitter = ",";
    FileWriter fileWriter = null;
    Date date = new Date();


    public void createCSVFile(String filename,int numRows){

        try{
            fileWriter = new FileWriter("output\\"+filename+date.getTime()+".csv");

            for(int x=0;x<numRows; x++){

                EntityLoader entityLoader = new EntityLoader();
                ArrayList<String> row = new ArrayList<>(entityLoader.loadEntityIntoList(filename,x));
                for(String columnContents:row){
                    fileWriter.append(columnContents);
                }
                fileWriter.append("\n");

//                ClientCorp corp = new ClientCorp();
//
//                if(x==0) {
//                    fileWriter.append(corp.header + "\n");
//                }
//                fileWriter.append(corp.getName()+Integer.toString(x) + delimitter);
//                fileWriter.append(corp.getAddress1()+ delimitter);
//                fileWriter.append(corp.getCityState() + delimitter);
//                fileWriter.append(corp.getCountryName() + delimitter);
//                fileWriter.append(corp.getDescription() + delimitter);
//                fileWriter.append(corp.getBusinessSector() + delimitter);
//                fileWriter.append(corp.getStatus()+"\n");
                if(x%1000==0){
                    System.out.println(x);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

}
