
public class StopMusic implements Command {
    private Music music;

    public StopMusic(Music music) {
        this.music = music;
    }

    public void run() {
        this.music.stop();
    };

    public void cancel() {
        this.music.play();
    };
}
