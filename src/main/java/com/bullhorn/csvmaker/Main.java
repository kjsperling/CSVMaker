package com.bullhorn.csvmaker;

public class Main {

    public static void printUsage() {
        System.out.println("Usage: java -jar target/CSVMaker-1.0.jar <EntityName> <NumRecords> <OutputDirectory>");
        System.out.println("    where <EntityName> is one of the supported entities listed at:");
        System.out.println("    https://github.com/bullhorn/dataloader/wiki/Supported-Entities");
    }

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 3) {
            printUsage();
            return;
        }

        String outputDirectory = "csvOutput";
        if (args.length > 2) {
            outputDirectory = args[2];
        }

        CSVMaker csvMaker = new CSVMaker();
        csvMaker.createCSVFile(args[0], Integer.parseInt(args[1]), outputDirectory);
    }
}
