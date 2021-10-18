public class Calculate {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        int salary = calculate.getInt();
        int TIN = 13; //ндфл с работника
        int FIU = 22; //пенсионный фонд с работодателя
        double FFOMS = 5.1; //медстрахование с работодателя
        double FSS = 3.1; //соцстрахование с работодателя
        int EmployeeSalary = calculate.CalcEmployeeSalary(salary, TIN);
        double EmployerContributions = calculate.CalcEmployerContributions(salary, FIU, FFOMS, FSS);
        System.out.println("Сумма зарплаты на руки: " + EmployeeSalary + " руб");
        System.out.println("Отчисления работодателя: " + EmployerContributions + " руб");
    }
    public int getInt(){
        int salary = 60000;
        if (salary <= 0) {
            salary = getInt();
        }
        return salary;
    }

    public int CalcEmployeeSalary(int salary, int TIN){
        int EmployeeSalary;
        EmployeeSalary = salary - (salary/100 * TIN);
        return EmployeeSalary;
    }

    public double CalcEmployerContributions(int salary, int FIU, double FFOMS, double FSS){
        double EmployerContributions;
        EmployerContributions = salary/100 * (FIU + FFOMS + FSS);
        return EmployerContributions;
    }
}
