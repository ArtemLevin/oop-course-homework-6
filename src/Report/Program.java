package Report;

public class Program {


    public static void main(String[] args) {

        Report report = new Report(new PrintReport());
        report.calculate();
        report.outputToPrinter.output(report);

        Report report2 = new Report(new PrintReport_2());
        report2.calculate();
        report2.savingToFile.output(report);
    }

}
