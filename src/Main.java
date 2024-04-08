public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println();
        System.out.println("Задача 1");
        System.out.println();

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  " + fullName.toUpperCase());

        //Task 3
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника —  " + fullNameTrue);
    }
}