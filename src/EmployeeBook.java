public class EmployeeBook {
    public static Employee[] employees = new Employee[10];

    @Override
    public String toString() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getId() + " ФИО " + employee.getFullName() + " отдел " + employee.getDepartment() + " заплата " + employee.getSalary());
            }
        }
        return "Ф.И.О. " + employees[1].getFullName() + " отдел " + employees[1].getDepartment() + " зарплата " + employees[1].getSalary();

    }

    // средняя зарплата
    public double avgSalary() {
        int sum = 0;
        int counter = 0;
        double avg;
        while (counter < employees.length && employees[counter] != null) {
            sum = sum + employees[counter].getSalary();
            counter++;
        }
        avg = (double) sum / counter;
        return avg;
    }
    //расчёт налога

    public boolean calculateTax() {
        int[] taxRate = new int[10];
        double tax;
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null) {
                if (employees[j].getSalary() < 150) {
                    taxRate[j] = 1;
                } else if (employees[j].getSalary() < 350) {
                    taxRate[j] = 2;
                } else {
                    taxRate[j] = 3;
                }
            }
        }

        for (int j = 0; j < employees.length; j++) {
            switch (taxRate[j]) {
                case 1:
                    tax = employees[j].getSalary() * 0.13;
                    System.out.println("Налог для " + employees[j].getFullName() + " составляет 13% в рублях это " + tax);
                    break;
                case 2:
                    tax = employees[j].getSalary() * 0.17;
                    System.out.println("Налог для " + employees[j].getFullName() + " составляет 17% в рублях это " + tax);
                    break;
                case 3:
                    tax = employees[j].getSalary() * 0.21;
                    System.out.println("Налог для " + employees[j].getFullName() + " составляет 21% в рублях это " + tax);
                    break;
            }
        }
        return true;
    }

    public boolean indexSalary(int department, int indexPercent) {
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) continue;
            employee.setSalary(employee.getSalary() + (employee.getSalary() * indexPercent / 100));
        }
        return true;
    }

    // сотрудник с зп выше
    public Employee higherSalaryEmployee(int department, int salary) {
        Employee highSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) continue;
            if (employee.getSalary() > salary) {
                highSalaryEmployee = employee;
                break;
            }
        }
        return highSalaryEmployee;
    }

    // вывод сотрудников с з/п ниже порога
    public boolean lowSalary(int wage, int employeeNumber) {
        int i = 0;
        int empCounter = 0;
        while (i < employees.length) {
            if (employees[i] != null && wage > employees[i].getSalary()) {
                empCounter++;
                employees[i].printShortInfo();
            }
            i++;
            if (empCounter >= employeeNumber) break;

        }
        return true;
    }

    // бухгалтерский поиск

    public boolean areThereEmployeeWithSalary(Employee toFind) {
        boolean result = false;
        for (Employee employee : employees) {
            if (!toFind.equals(employee)) continue;
            result = true;
            break;
        }
        return result;
    }

    public boolean addEmployee(Employee toAdd) {
        boolean result = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) continue;
            employees[i] = toAdd;
            result = true;
            break;
        }
        return result;

    }

    public Employee searchId(int id) {
        Employee emp01 = null;
        for (Employee employee : employees) {
            if (id != employee.getId()) continue;
            emp01 = employee;
            break;
        }
        return emp01;
    }


}

