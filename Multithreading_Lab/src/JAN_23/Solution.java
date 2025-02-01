package JAN_23;

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Solution {
    public static void main(String[] args) {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());  // Outputs: Generic Sports
        c1.getNumberOfTeamMembers();  // Outputs: Each team has n players in Generic Sports
        System.out.println(c2.getName());  // Outputs: Soccer Class
        c2.getNumberOfTeamMembers();  // Outputs: Each team has 11 players in Soccer Class
    }
}
