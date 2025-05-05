package udmodelos20251.reportes.Flyweight;

public final class TextStyle {
    private final Font font;
    private final FontSize size;
    private final TextColor color;

    public TextStyle(Font font, FontSize size, TextColor color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public Font getFont() { return font; }
    public FontSize getSize() { return size; }
    public TextColor getColor() { return color; }

    @Override
    public String toString() {
        return String.format(
                "Font: %s, Size: %d, Color: %s",
                font.getName(), size.getSize(), color.getHexCode()
        );
    }
}