package kjsperling.csvmaker;

import kjsperling.csvmaker.util.RESTUtil;

public class Main {

    public static void main(String[] args) {
//        CSVMaker csvMaker = new CSVMaker();
//        csvMaker.createCSVFile("candidate",1000);

        RESTUtil restUtil = new RESTUtil();

        try {
            restUtil.getCategories(restUtil.login("jrun","username","password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
