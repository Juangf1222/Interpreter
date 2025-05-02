public class DetailedReport extends Report {

    public DetailedReport(Exporter exporter) {
        super(exporter);
    }

    @Override
    public void generate(String content) {
        String detailedContent = "Detailed Report:\n" + content;
        exporter.export(detailedContent);
    }
}
