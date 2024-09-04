package gis.structural.facade;

public class Row {

    private final String name;
    private final String birthDay;
    private final String email;


    public Row(String name, String birthDay, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
    }


    public String getName() {

        return name;
    }


    public String getBirthDay() {
        return birthDay;
    }


    public String getEmail() {
        return email;
    }
}
