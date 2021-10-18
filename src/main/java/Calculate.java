import java.util.Scanner;

public class Calculate {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.getInt();
    }
    public int getInt(){
        System.out.println("Введите оклад работника:");
        int salary;
        if(scanner.hasNextInt()){
            salary = scanner.nextInt();
            if (salary <= 0) {
                System.out.println("Оклад не может быть меньше 0. Попробуйте еще раз.");
                salary = getInt();
            }
        } else {
            System.out.println("Вы допустили ошибку при вводе оклада. Попробуйте еще раз.");
            scanner.next();//рекурсия
            salary = getInt();
        }
        return salary;
    }
}
