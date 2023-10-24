package session15_equals_and_hashcode.challenges.challenge04;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("Someone like you", "Adele", 180);
        Song song2 = new Song("Someone like you", "Adele", 190);

        System.out.println(song1.equals(song2));
        System.out.println(song1.hashCode());
        System.out.println(song2.hashCode());
    }
}
