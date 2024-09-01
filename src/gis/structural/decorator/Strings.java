package gis.structural.decorator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Strings extends Item {

    private final List<String> strings = new ArrayList<>();


    public void add(String item) {
        strings.add(item);
    }


    @Override
    public int getLinesCount() {
        return strings.size();
    }


    @Override
    public int getMaxLength() {
        return strings.stream().max(Comparator.comparing(String::length)).get().length();
    }


    @Override
    public int getLength(int index) {
        return strings.get(index).length();
    }


    @Override
    public String getString(int index) {
        return strings.get(index);
    }
}
