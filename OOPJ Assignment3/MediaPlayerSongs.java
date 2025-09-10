import java.util.Scanner;

interface AudioPlayer {
    void playAudio(String song);
}

interface VideoPlayer {
    void playVideo(String movie);
}
class MediaPlayer implements AudioPlayer, VideoPlayer {
   
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }

    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}
class MediaPlayerSongs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter song name to play: ");
        String song = sc.nextLine();
        System.out.print("Enter movie name to play: ");
        String movie = sc.nextLine();

        MediaPlayer player = new MediaPlayer();
        player.playAudio(song);
        player.playVideo(movie);

        sc.close();
    }
}
