package gis.structural.factory;

public abstract class Factory {

    public Item create(String name) {

        boolean bCreatable = this.isCreatable(name);

        if(bCreatable) {
            Item item = this.createItem(name);
            postprocessItem(name);
            return item;
        }

        return null;
    }


    protected abstract void postprocessItem(String name);

    public abstract Item createItem(String name);

    public abstract boolean isCreatable(String name);
}
