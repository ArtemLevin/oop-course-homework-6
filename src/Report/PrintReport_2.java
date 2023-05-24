package Report;

import java.io.FileWriter;
import java.io.IOException;


public class PrintReport_2 implements PrintingReportInterface {

    @Override
    public void output(Report report) {
        String fileName = "report.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (ReportItem item : report.getItems()) {
                writer.write("<Amount>:" + item.getAmount() + "</Amount> \n");
                writer.write("<Description>:" + item.getDescription() +"</Description> \n");

            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
