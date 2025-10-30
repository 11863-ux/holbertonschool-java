package print;

public class PrintJobFactory {



    public static PrintJob createPrintJob(PrintSize printSize,int totalPages,int totalColorPages,boolean isDoubleSided){
        PrintJob printJob = new PrintJob();
        printJob.totalPages = totalPages;
        printJob.colorPages = totalColorPages;
        printJob.isDoubleSided = isDoubleSided;
        printJob.printSize = printSize;
        return printJob;
    }
}
