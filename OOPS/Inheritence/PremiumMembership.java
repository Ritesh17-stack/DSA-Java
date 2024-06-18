package OOPS.Inheritence;

import javax.sound.midi.Soundbank;

public class PremiumMembership extends GymMembership {
    boolean p_trainer;
    boolean spa_access;
    PremiumMembership(boolean p_trainer,boolean spa_access){
        super();
        this.type="premium";
        this.spa_access=spa_access;
        this.p_trainer=p_trainer;
        this.fees =2000;
    }    PremiumMembership(String name,int duration, boolean p_trainer,boolean spa_access){
        this.type="Premium";
        this.spa_access=spa_access;
        this.p_trainer=p_trainer;
        this.fees =2000;
    }
    @Override
    public int fees(){
        return this.fees;
    }
    @Override
    public void checkOffers(){
        if (this.duration<6){
            System.out.println("No offers");
        }
        else {
            System.out.println("You get 40% off on next Membership!!");
        }
    }
}
