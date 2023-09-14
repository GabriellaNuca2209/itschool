package session4.challenges;

public class Challenge17 {

    public static void main(String[] args) {
        boolean hasUserName = false;
        boolean hasPassword = true;

        if (hasPassword == true && hasUserName == true) {
            System.out.println("Authentication successful");
        } else if (hasUserName == false) {
            System.out.println("Authentication failed");
        } else {
            System.out.println("Password is incorrect");
        }
    }
}
