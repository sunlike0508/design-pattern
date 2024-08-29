package gis.structural.composite;

public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));

        Folder sub1 = new Folder("sub1");
        sub1.add(new File("sub1-a.txt", 100));
        sub1.add(new File("sub1-b.txt", 400));
        root.add(sub1);

        Folder sub2 = new Folder("sub2");
        sub2.add(new File("sub2-a.txt", 400));
        sub2.add(new File("sub2-b.txt", 500));
        root.add(sub2);

        root.list();
    }
}
