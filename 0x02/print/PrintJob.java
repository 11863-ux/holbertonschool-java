package print;

public class PrintJob {
    private int totalPages;
    private int colorPages;
    private boolean isDoubleSided;
    private double colorDoubleSidedCost;
    private double bwDoubleSidedCost;
    private double colorSingleSidedCost;
    private double bwSingleSidedCost;
    PrintSize printSize;



    public double calculateTotal() {
        if (printSize == PrintSize.A2) {
            bwSingleSidedCost=22;
            colorSingleSidedCost=32;
            bwDoubleSidedCost=18;
            colorDoubleSidedCost=28;
        }
        if (printSize == PrintSize.A3) {
            bwSingleSidedCost=20;
            colorSingleSidedCost=30;
            bwDoubleSidedCost=15;
            colorDoubleSidedCost=25;
        }
        if (printSize == PrintSize.A4) {
            bwSingleSidedCost=15;
            colorSingleSidedCost=15;
            bwDoubleSidedCost=10;
            colorDoubleSidedCost=20;
        }

        if (isDoubleSided) return colorPages*colorDoubleSidedCost+(totalPages-colorPages)*bwDoubleSidedCost;
        else return colorPages*colorSingleSidedCost+(totalPages-colorPages)*bwSingleSidedCost;

    }

    @Override
    public String toString() {
        String text=isDoubleSided ? "double-sided" : "single-sided";
        return String.format("total pages: %d, color pages: %d, black-and-white pages: %d, %s. total: $%.2f",totalPages,colorPages,totalPages-colorPages,text,calculateTotal()/100.0);
    }
}
