public class HTMLExporter implements Exporter {
    @Override
    public void export(String content) {
        System.out.println("[HTML Exported]\n<html><body><p>" + content + "</p></body></html>");
    }
}
