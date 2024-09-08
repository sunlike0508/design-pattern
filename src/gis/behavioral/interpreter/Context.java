package gis.behavioral.interpreter;

import java.util.StringTokenizer;

public class Context {

    private final StringTokenizer stringTokenizer;
    private String currentKeyword;


    public Context(String script) {
        stringTokenizer = new StringTokenizer(script);
        readNextKeyword();
    }


    public String readNextKeyword() {
        if(stringTokenizer.hasMoreTokens()) {
            currentKeyword = stringTokenizer.nextToken();
        } else {
            currentKeyword = null;
        }

        return currentKeyword;
    }


    public String getCurrentKeyword() {
        return currentKeyword;
    }
}
