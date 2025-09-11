//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Пётр Вячеславович Крутых", 5, 283);
        employees[1] = new Employee("Сергей Алексеевич Котов", 3, 250);
        employees[2] = new Employee("Артём Петрович Кузнецов", 2, 250);
        employees[3] = new Employee("Иван Михайлович Синкин", 3, 390);
        employees[4] = new Employee("Николай Андреевич Байдаков", 1, 200);
        employees[5] = new Employee("Фёдор Ильич Леонович", 1, 120);
        employees[6] = new Employee("Софья Ивановна Клыкова", 4, 210);
        employees[7] = new Employee("Анна Сергеевна Зуева", 4, 50);
        employees[8] = new Employee("Янина Игоревна Блинова", 1, 68);
        employees[9] = new Employee("Аристарх Николаевич Майский", 2, 94);


        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        // сравнение зарплат
        System.out.println("employees[1].equals(employees[2]) = " + employees[1].equals(employees[2]));
        // краткая информация
        employees[2].printShortInfo();

        System.out.println();
        EmployeeBook book1 = new EmployeeBook();
        // присвоение значений
        book1.addEmployee(employees[0]);
        book1.addEmployee(employees[1]);
        book1.addEmployee(employees[2]);
        book1.addEmployee(employees[3]);
        book1.addEmployee(employees[4]);
        book1.addEmployee(employees[5]);
        book1.addEmployee(employees[6]);
        book1.addEmployee(employees[7]);
        book1.addEmployee(employees[8]);
        book1.addEmployee(employees[9]);
        book1.addEmployee(employees[0]);
        //средняя зарплата
        System.out.println("Средняя зарплата = " + book1.avgSalary());
        System.out.println();
        //расчёт налога Progressive
        book1.calculateTax();
        // индексация
        book1.indexSalary(1, 13);
        System.out.println();
        // вывод данных после индексации
        System.out.println("После индексации:");
        book1.toString();
        System.out.println();

        // поиск сотрудника с з/п выше
        book1.higherSalaryEmployee(3, 180).printShortInfo();
        System.out.println();
        // вывод сотрудников с з/п ниже порога
        System.out.println("З/п ниже заданного wage: " );
        book1.lowSalary(250, 3);
        System.out.println();

        // бухгалтерский поиск сотрудника
        Employee employeeToFind = new Employee("Иванов Иван Иванович", 1, 250);
        System.out.println("Есть сотрудник с такой зарплатой: " + book1.areThereEmployeeWithSalary(employeeToFind));

        //добавление нового
        System.out.println();
        System.out.println("Есть место для добавления: " + book1.addEmployee(employeeToFind));
        book1.toString();
        System.out.println();

        // поиск по id
        System.out.println("Результат поиска по id:");
        System.out.println(book1.searchId(3));



    }
}


