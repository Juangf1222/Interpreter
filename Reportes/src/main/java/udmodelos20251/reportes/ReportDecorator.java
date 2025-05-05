
abstract class ReportDecorator{
    protected Report wrappedReport;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    public void generate() {
        wrappedReport.generateReport();
    }
}