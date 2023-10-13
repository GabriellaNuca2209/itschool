package fitnessCenterChallenge;

import fitnessCenterChallenge.models.Activity;
import fitnessCenterChallenge.models.Item;
import fitnessCenterChallenge.models.Member;
import fitnessCenterChallenge.models.MembershipTier;
import fitnessCenterChallenge.service.MemberService;
import fitnessCenterChallenge.service.ItemService;
import fitnessCenterChallenge.testInterface.Drink;
import fitnessCenterChallenge.testInterface.Item2;
import fitnessCenterChallenge.testInterface.Snack;


public class GymApp {

    public static void main(String[] args) {
        MemberService gymDB = new MemberService();
        ItemService itemService = new ItemService();

        Member kenny = gymDB.createMember("Kenny", MembershipTier.BASIC);
        gymDB.addMember(kenny);
        gymDB.printAllMembers();

        Activity fitnessForBoys = new Activity("Gym Bros");
        gymDB.bookClass(fitnessForBoys, kenny);

        Item frappe = new Item("Frappe", 21.98);
        itemService.buy(frappe, kenny);
        itemService.printLogs();
        gymDB.modifyMembership(kenny, "platinum");
        System.out.println(kenny.getMembershipTier());
        gymDB.renewalNotification(kenny);

        // testing here
        Item2 soda = new Drink();
        Item2 snack = new Snack();
        soda.use();

        // kenny.buy()

    }
}
