package Day_3;
public class Dominos {
    public static void main(String[] args) {
        int chickenrolls = 60;
        int vegetablepuffs = 25;

        int nochicken = Integer.parseInt(args[0]);
        int nopuffs = Integer.parseInt(args[1]);

        int totalchickenrolls = chickenrolls * nochicken;
        int totalnopuffs = vegetablepuffs * nopuffs;

        int totalBill = totalchickenrolls + totalnopuffs;

        System.out.println("--------Dominos bil---------");

        System.out.println(" chicken rolls = 64 * " + chickenrolls + "=" + totalchickenrolls);
        System.out.println("vegetable puffs=25* " + vegetablepuffs + "=" + totalnopuffs);
        System.out.println("--------------------------------------------");
        System.out.println("total bill: " + totalBill);

    }
}