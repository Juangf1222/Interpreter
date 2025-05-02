public class MarkdownExporter implements Exporter {
    @Override
    public void export(String content) {
        System.out.println("[Markdown Exported]\n# " + content.replace("\n", "\n## "));
    }
}
