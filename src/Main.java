public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + middleName + " " + firstName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
    }
}