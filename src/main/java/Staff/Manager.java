package Staff;

public class Manager extends Employee{

    private String deptName;

    public Manager(String name, String niNumber, Double salary, String deptName){
        super(name, niNumber, salary);

    }

    public String getDeptName() {
        return deptName;
    }


}
