package gis.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();


    // 이걸 정적 메소드로 만들어도 된다.
    public Font getFont(String font) {
        if(cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }

    //    private static Map<String, Font> cache = new HashMap<>();
    //
    //
    //    public static Font createFont(String font) {
    //        if(cache.containsKey(font)) {
    //            return cache.get(font);
    //        } else  {
    //            String[] split = font.split(":");
    //            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
    //            cache.put(font, newFont);
    //            return newFont;
    //        }
    //    }
}
