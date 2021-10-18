public class Calculate {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.getInt();
    }
    public int getInt(){
        int salary = 60000;
        if (salary <= 0) {
            salary = getInt();
        }
        return salary;
    }

    public static int CalcEmployeeSalary(int salary, int TIN){
        int EmployeeSalary;
        EmployeeSalary = salary - (salary/100 * TIN);
        return EmployeeSalary;
    }

    public static double CalcEmployerContributions(int salary, int FIU, double FFOMS, double FSS){
        double EmployerContributions;
        EmployerContributions = salary/100 * (FIU + FFOMS + FSS);
        return EmployerContributions;
    }
}
