package day17_record;

public final record EmployeeRecord(String name, int employeeId) implements Workable {

    public static final  String defaultManager = "John";

//    public EmployeeRecord(String name, int employeeId){
//        if (employeeId < 0){
//            throw new IllegalArgumentException("Id cannot be negative");
//        }
//        this.name = name;
//        this.employeeId = employeeId;
//    }

    public EmployeeRecord{
        if (employeeId < 0){
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }

    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    public static void printManager(){
        System.out.println("John");
        System.out.println(defaultManager);
    }

    @Override
    public boolean isWork() {
        return employeeId > 1000;
    }
}
