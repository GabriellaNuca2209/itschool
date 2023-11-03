package session18_recap.challenge18;

public class App {

    public static void main(String[] args) {
        Playlist fun = new Playlist("Fun");
        fun.getSongs().add(new Song("All I want from Christmas", 160));
        fun.getSongs().add(new Song("Santa", 230));
        fun.getSongs().add(new Song("Merry Christmas", 190));

        printPlaylistDuration(fun);
    }

    private static void printPlaylistDuration(Playlist playlist) {
        int duration = playlist.getSongs().stream()
                .map(Song::getDuration)
                .reduce(Integer::sum)
                .get();

        secondToMinuteConvertor(duration);
    }

    private static void secondToMinuteConvertor(int input) {
        int S = input % 60;
        int H = input / 60;
        int M = H % 60;
        H = H / 60;

        System.out.print(H + ":" + M + ":" + S);
    }
}
