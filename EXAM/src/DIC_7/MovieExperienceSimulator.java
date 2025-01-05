package DIC_7;

class Theater {
 protected String theaterName;
 protected boolean is3DEnabled;


 public Theater(String theaterName, boolean is3DEnabled) {
     this.theaterName = theaterName;
     this.is3DEnabled = is3DEnabled;
 }


 public Theater getTheaterDetails() {
     System.out.println("Theater Name: " + theaterName);
     System.out.println("3D Enabled: " + (is3DEnabled ? "Yes" : "No"));
     return this;
 }
}

class IMAXTheater extends Theater {
 public IMAXTheater(String theaterName) {
     super(theaterName, true);
 }


 @Override
 public IMAXTheater getTheaterDetails() {
     super.getTheaterDetails();
     System.out.println("Unique Features: IMAX screens, superior sound quality, and special seating.");
     return this;
 }
}


class PremiumTheater extends Theater {
 public PremiumTheater(String theaterName) {
     super(theaterName, true);
 }


 @Override
 public PremiumTheater getTheaterDetails() {
     super.getTheaterDetails();
     System.out.println("Unique Features: Luxury seating, gourmet food, and high-end audio system.");
     return this;
 }
}


class RegularTheater extends Theater {
 public RegularTheater(String theaterName) {
     super(theaterName, false);
 }


 @Override
 public RegularTheater getTheaterDetails() {
     super.getTheaterDetails();
     System.out.println("Unique Features: Comfortable seating and standard movie viewing.");
     return this;
 }
}


public class MovieExperienceSimulator {
 public static void main(String[] args) {
     Theater theater = new Theater("General Theater", false);
     IMAXTheater imax = new IMAXTheater("IMAX Deluxe");
     PremiumTheater premium = new PremiumTheater("Premium Luxe");
     RegularTheater regular = new RegularTheater("Classic Theater");

     System.out.println("Theater Details:");
     theater.getTheaterDetails();
     System.out.println("\nIMAX Theater Details:");
     imax.getTheaterDetails();
     System.out.println("\nPremium Theater Details:");
     premium.getTheaterDetails();
     System.out.println("\nRegular Theater Details:");
     regular.getTheaterDetails();
 }
}