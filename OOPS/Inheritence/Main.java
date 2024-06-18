package OOPS.Inheritence;

public class Main {
    public static void main(String[] args) {
        GymMembership m1 = new PremiumMembership("Rahul",6,true,true);
        System.out.println(m1.name);
        System.out.println(m1.fees());
        System.out.println(m1.duration);
        System.out.println(m1.type);
        m1.checkOffers();
    }

}
