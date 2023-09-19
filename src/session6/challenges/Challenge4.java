package session6.challenges;

public class Challenge4 {

    public static void main(String[] args) {
        String str = "Bucharest";
        removeVowels(str);
    }

    public static void removeVowels(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String vowels = "AaEeIiOoUu";

        for (char character : str.toCharArray()) {
            if (vowels.indexOf(character) < 0) { // here we verify if a character from our string isn't found in the vowels string
                stringBuilder.append(character); // if it isn't, we append it to our stringbuilder, that way we only have consonants
            }
        }
        System.out.println(stringBuilder); // print it, queen
    }
}
