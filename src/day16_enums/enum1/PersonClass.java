package day16_enums.enum1;

public class PersonClass {

    private String name;
    private String id;
    private DaysOfWeek offDay;

    public PersonClass(String name, String id, DaysOfWeek offDay) {
        this.name = name;
        this.id = id;
        this.offDay = offDay;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public DaysOfWeek getOffDay() {
        return offDay;
    }
}
