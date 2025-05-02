public class ExecutiveReport extends Report {

    public ExecutiveReport(Exporter exporter) {
        super(exporter);
    }

    @Override
    public void generate(String content) {
        String summary = "Executive Summary:\n" + content;
        exporter.export(summary);
    }
}
