/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udmodelos20251.reportes;

/**
 *
 * @author SCVA9
 */
public abstract class Report {
    protected Exporter exporter;

    public Report(Exporter exporter) {
        this.exporter = exporter;
    }

    public abstract void generate(String content);
}
