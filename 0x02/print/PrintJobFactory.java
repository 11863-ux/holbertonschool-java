package print;

public class PrintJobFactory {



    public static PrintJob createPrintJob(PrintSize size,int totalPages,int totalColorPages,boolean isDoubleSided){
        PrintJob printJob = new PrintJob();
        printJob.setTotalPages(totalPages);
        printJob.setColorPages(totalColorPages);
        printJob.setDoubleSided(isDoubleSided);
        printJob.setPrintSize(size);
        return printJob;
    }
}
