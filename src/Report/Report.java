package Report;

import java.util.ArrayList;
import java.util.List;

public class Report {

    public PrintReport outputToPrinter;

    public PrintReport_2 savingToFile;

    public Report(PrintReport_2 savingToFile) {
        this.savingToFile = savingToFile;
    }

    public Report(PrintReport outputToPrinter) {
        this.outputToPrinter = outputToPrinter;
    }

    List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public List<ReportItem> getItems() {
        return items;
    }
}
