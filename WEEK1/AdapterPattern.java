 package WEEK1;

interface MediaPlayer {
    void play(String audioType, String fileName);
}

class MP3Player {
    public void playMP3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

class MP3Adapter implements MediaPlayer {
    private MP3Player mp3Player = new MP3Player();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.playMP3(fileName);
        } else {
            System.out.println("Invalid format: " + audioType);
        }
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        MediaPlayer player = new MP3Adapter();
        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");
    }
}
