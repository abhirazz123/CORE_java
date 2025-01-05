package Day_3;
public class DominosBill {

    public static void main(String[] args) {
       
        int priceChickenRoll = 60;
        int priceVegetablePuff = 25;
   
        int numChickenRolls = 4;
        int numVegetablePuffs = 3;

        int totalChickenRolls = priceChickenRoll * numChickenRolls;
        int totalVegetablePuffs = priceVegetablePuff * numVegetablePuffs;
        

        int totalBill = totalChickenRolls + totalVegetablePuffs;
        
   
        int discount = 50;
        int finalBill = totalBill - discount;
        
        
        System.out.println("-------Dominos Bill-------");
        System.out.println("Chicken Rolls (4 x Rs 60): Rs " + totalChickenRolls);
        System.out.println("Vegetable Puffs (3 x Rs 25): Rs " + totalVegetablePuffs);
        System.out.println("----------------------------");
        System.out.println("Total Bill: Rs " + totalBill);
        System.out.println("Discount Applied: Rs " + discount);
        System.out.println("Final Bill Amount: Rs " + finalBill);
        System.out.println("----------------------------");
    }
}
