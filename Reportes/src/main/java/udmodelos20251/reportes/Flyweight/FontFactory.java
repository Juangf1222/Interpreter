package udmodelos20251.reportes.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private static FontFactory instance;
    private final Map<String, Font> fontPool = new HashMap<>();

    private FontFactory() {}

    public static FontFactory getInstance() {
        if (instance == null) {
            instance = new FontFactory();
        }
        return instance;
    }

    public Font getFont(String name, String filePath) {
        String key = new Font(name, filePath).getKey();
        if (!fontPool.containsKey(key)) {
            fontPool.put(key, new Font(name, filePath));
        }
        return fontPool.get(key);
    }

    public int getTotalFonts() {
        return fontPool.size();
    }
}