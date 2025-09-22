//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[11];
        employees[1] = new Employee("Сергей", "Алексеевич", "Котов", 3, 450);
        employees[2] = new Employee("Артём", "Петрович", "Мурлышев", 2, 250);
        employees[3] = new Employee("Иван", "Михайлович", "Синкин", 3, 130);
        employees[4] = new Employee("Николай", "Андреевич", "Байдаков", 1, 200);
        employees[5] = new Employee("Фёдор", "Ильич", "Леонович", 1, 120);
        employees[6] = new Employee("Софья", "Ивановна", "Клыкова", 4, 210);
        employees[7] = new Employee("Анна", "Сергеевна", "Зуева", 4, 50);
        employees[8] = new Employee("Янина", "Игоревна", "Блинова", 1, 68);
        employees[9] = new Employee("Аристарх", "Николаевич", "Майский", 2, 94);
        employees[10] = new Employee("Юлия", "Генриховна", "Роде", 5, 265);
        employees[0] = new Employee("Пётр", "Вячеславович", "Крутых", 5, 283);



        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}

