package gis.structural.facade;

import java.util.HashMap;

public class Cache {

    private final HashMap<String, Row> cache = new HashMap<>();


    public void put(Row row) {
        cache.put(row.getName(), row);
    }


    public Row get(String name) {
        return cache.get(name);
    }

}
