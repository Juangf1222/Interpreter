public class PDFExporter implements Exporter {
    @Override
    public void export(String content) {
        System.out.println("[PDF Exported]\n" + content);
    }
}
