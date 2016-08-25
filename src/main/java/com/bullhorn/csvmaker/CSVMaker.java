package com.bullhorn.csvmaker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVMaker {

    public void createCSVFile(String filename,int numRows,String outputDirectory){
        FileWriter fileWriter = null;
        File file = new File(outputDirectory);

        try{
            if(!file.exists()){
                file.mkdirs();
            }
            fileWriter = new FileWriter(outputDirectory + "/" + filename + "_" + numRows + ".csv");

            for(int x=0;x<numRows+1; x++){

                EntityLoader entityLoader = new EntityLoader();
                ArrayList<String> row = new ArrayList<String>(entityLoader.loadEntityIntoList(filename,x));
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
