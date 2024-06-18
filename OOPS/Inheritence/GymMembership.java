package OOPS.Inheritence;

public class GymMembership {
    String name;
    String type;
    int duration;
    int fees=1000;
    GymMembership(){
        this.name="Ritesh";
        this.type="Regular";
        this.duration=6;
    }
    GymMembership(String name, String type, int duration) {
        this.name = name;
        this.type = type;
        this.duration = duration;
    }
    public  int fees(){
       return this.fees;
    }
    public void checkOffers(){
        if (duration<6){
            System.out.println("No offers");
        }
        else {
            System.out.println("You get 20% off on next Membership!!");
        }
    }
}
