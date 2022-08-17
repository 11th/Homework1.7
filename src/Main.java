public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String midletName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + midletName;
        System.out.printf("ФИО сотрудника — %s", fullName);

        //Task 2
        System.out.println("\nTask 2");
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s", fullName.toUpperCase());

        //Task 3
        System.out.println("\nTask 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.printf("Данные ФИО сотрудника — %s", fullName);
    }
}