public class Employee {
    private static int counterId = 1;
    private int id;
    private String fullName;
    private int salary;
    private int departmentId;

    public Employee(String fullName,int departmentId,int salary) {
        this.id = counterId++;
        this.fullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return String.format(
                "id: %d, ФИО: %s, ЗП: %d, N отдела: %d",
                id,
                fullName,
                salary,
                departmentId
        );
    }
}


