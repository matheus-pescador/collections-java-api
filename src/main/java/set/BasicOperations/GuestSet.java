package main.java.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuestToSet(String name, int inviteCode) {
        guestSet.add(new Guest(name, inviteCode));
    }

    public void removeGuestByInviteCode(int inviteCode) {
        Guest guestToRemove = null;
        for (Guest g : guestSet) {
            if (g.getInviteCode() == inviteCode) {
                guestToRemove = g;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int guestCount() {
        return guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        GuestSet guestSet = new GuestSet();
        System.out.println("There are " +guestSet.guestCount() + " guests in the Guest Set.");


        guestSet.addGuestToSet("Guest 1",1234);
        guestSet.addGuestToSet("Guest 2",1235);
        guestSet.addGuestToSet("Guest 3",1235);
        guestSet.addGuestToSet("Guest 4",1236);

        System.out.println("There are " +guestSet.guestCount() + " guests in the Guest Set.");

        guestSet.removeGuestByInviteCode(1234);
        System.out.println("There are " +guestSet.guestCount() + " guests in the Guest Set.");

        guestSet.showGuests();
    }
}
