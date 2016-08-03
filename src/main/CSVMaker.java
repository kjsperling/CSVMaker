package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class CSVMaker {

    FileWriter fileWriter = null;
    Date date = new Date();


    public void createCSVFile(String filename,int numRows){

        try{
            fileWriter = new FileWriter("csvOutput\\"+filename+date.getTime()+".csv");

            for(int x=0;x<numRows+1; x++){

                EntityLoader entityLoader = new EntityLoader();
                ArrayList<String> row = new ArrayList<>(entityLoader.loadEntityIntoList(filename,x));
                for(String columnContents:row){
                    fileWriter.append(columnContents);
                }
                fileWriter.append("\n");

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
