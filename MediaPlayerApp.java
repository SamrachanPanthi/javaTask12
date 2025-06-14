// Abstract class representing the base MediaPlayer
abstract class MediaPlayer {
    // Abstract methods 
    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    // Concrete method
    public void info() {
        System.out.println("This is a Media Player");
    }
}

// Interface 
interface Playlist {
    void addSong(String songName);
    void removeSong(String songName);
}

// Concrete class that extends the abstract class and implements the interface
class VideoPlayer extends MediaPlayer implements Playlist {

    
    public void play() {
        System.out.println("Playing video");
    }

   
    public void pause() {
        System.out.println("Pausing video");
    }

   
    public void stop() {
        System.out.println("Stopping video");
    }

    
    public void addSong(String songName) {
        System.out.println("Added song: " + songName);
    }
    public void removeSong(String songName) {
        System.out.println("Removed song: " + songName);
    }

    // Additional methods in the subclass
    public void rewind() {
        System.out.println("Rewinding video");
    }

    public void fastForward() {
        System.out.println("Fast-forwarding video");
    }
}

// Main class to demonstrate abstraction and interface implementation
public class MediaPlayerApp {
    public static void main(String[] args) {
        VideoPlayer myPlayer = new VideoPlayer();

        // Abstract class methods (implemented)
        myPlayer.play();
        myPlayer.pause();
        myPlayer.stop();

        // Concrete method from abstract class
        myPlayer.info();

        // Interface methods
        myPlayer.addSong("Song 1");
        myPlayer.removeSong("Song 1");

        // Subclass-specific methods
        myPlayer.rewind();
        myPlayer.fastForward();
    }
}
