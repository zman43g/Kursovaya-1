public class Employee {
    private static int idEmployeeNext = 1;
    private final String fullName;
    private int department, salary;
    private final int id;


    public Employee(String fullName, int department, int salary) {
        id = idEmployeeNext++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }


    //Гетеры

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public String getFullName() {
        return fullName;
    }

    //Сеттеры
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " Ф.И.О. " + fullName + " отдел " + department + " зарплата " + salary;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            Employee e1 = (Employee) obj;
            return salary == e1.salary;
        }

    }

    public void printShortInfo() {
        System.out.println(fullName + " зарплата " + salary);
    }

    /*public int IndexDepNumber(int DepNumber) {
        for (int i = 0; i <; i++) {


        }
    }*/


}
















