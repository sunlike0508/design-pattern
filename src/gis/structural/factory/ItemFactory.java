package gis.structural.factory;

import java.util.HashMap;

public class ItemFactory extends Factory {

    private final HashMap<String, ItemData> repository;


    public ItemFactory() {
        this.repository = new HashMap<>();
        repository.put("sword", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(1));
    }


    @Override
    protected void postprocessItem(String name) {
        ItemData itemData = repository.get(name);

        if(itemData != null)
            itemData.currentCount++;
    }


    @Override
    public Item createItem(String name) {

        Item item = null;

        switch(name) {
            case "sword" -> item = new Sword();
            case "shield" -> item = new Shield();
            case "bow" -> item = new Bow();
            default -> System.out.println(name + "은 생성 할 수 없습니다.");
        }

        return item;
    }


    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = repository.get(name);

        if(itemData == null) {
            System.out.println(name + "은 알 수 없는 아이템");
            return false;
        }

        if(itemData.currentCount >= itemData.maxCount) {
            System.out.println(name + "은 품절 아이템");
            return false;
        }

        return true;
    }


    private static class ItemData {

        int maxCount;
        int currentCount;


        ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }
}
