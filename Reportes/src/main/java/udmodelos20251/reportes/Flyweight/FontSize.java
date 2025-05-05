package udmodelos20251.reportes.Flyweight;

public final class FontSize {
    private final int size;  // Ej: 12 (pt)

    public FontSize(int size) {
        if (size <= 0) throw new IllegalArgumentException("Tamaño inválido");
        this.size = size;
    }

    public int getSize() { return size; }
}