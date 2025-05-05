package udmodelos20251.reportes.Flyweight;
public final class Font {
    private final String name;      // Ej: "Arial"
    private final String filePath;  // Ej: "/fonts/arial.ttf" (opcional)

    public Font(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
    }

    // Getters
    public String getName() { return name; }
    public String getFilePath() { return filePath; }

    // Clave única para el pool
    public String getKey() {
        return name + "|" + filePath;
    }
}
