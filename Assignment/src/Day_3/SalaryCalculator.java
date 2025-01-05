package Day_3;
public class SalaryCalculator {
    public static void main(String[] args) {

        double basicsalary = Double.parseDouble(args[0]);

        double HRA = 1.50 * basicsalary;
        double Conveyance = 1.50 * basicsalary;
        double Entertainment = 1.0 * basicsalary;

        double totalsalary = HRA + Conveyance + Entertainment;

        System.out.println("HRA salary = " + HRA + "\nthe of salary Conveyance = " + Conveyance
                + "\nthe salary of Entertainment = " + Entertainment + "\nthe total salary = " + totalsalary);

    }

}
