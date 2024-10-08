package gis.structural.facade;

public class Message {

    private final Row row;


    public Message(Row row) {
        this.row = row;
    }


    public String makeName() {
        return "Name : \"" + row.getName() + "\"";
    }


    public String makeBirthday() {
        return "Birthday: " + row.getBirthDay();
    }


    public String makeEmail() {
        return "Email: " + row.getEmail();
    }
}
