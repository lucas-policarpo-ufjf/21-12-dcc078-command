
public class PlayMusic implements Command {
    private Music music;

    public PlayMusic(Music music) {
        this.music = music;
    }

    public void run() {
        this.music.play();
    };

    public void cancel() {
        this.music.stop();
    };
}
