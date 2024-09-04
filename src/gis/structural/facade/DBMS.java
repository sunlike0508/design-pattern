package gis.structural.facade;

import java.util.HashMap;

public class DBMS {

    private final HashMap<String, Row> db = new HashMap<>();


    public DBMS() {
        db.put("Shin", new Row("Shin", "1990-12-03", "123@gmail.com"));
        db.put("Kim", new Row("Kim", "1956-12-03", "fsefaesf@gmail.com"));
        db.put("Park", new Row("Park", "1987-12-03", "seifjse@gmail.com"));
    }


    public Row query(String name) {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

        return db.get(name);
    }
}
