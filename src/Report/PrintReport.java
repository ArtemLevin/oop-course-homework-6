package Report;
public class PrintReport implements PrintingReportInterface {

    @Override
    public void output(Report report) {
        System.out.println("Output to printer");
        for (ReportItem item : report.getItems()) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

}
