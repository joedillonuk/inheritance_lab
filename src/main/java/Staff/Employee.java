package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != "" & name != null){
        this.name = name;}
        else System.out.println("Not a valid name");
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise){
        if(raise > 0){
            this.salary = this.salary * raise;
        }
        else{
            System.out.println("Please provide a salary greater than zero");
        }
    }

    public Double payBonus(){
        return (this.salary * 0.01);
    }
}
