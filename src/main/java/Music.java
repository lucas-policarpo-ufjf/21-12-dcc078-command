public class Music {
    private String name;
    private String artist;
    private Boolean isPlaying = false;

    public Music(String name, String artist, Boolean isPlaying) {
        this.name = name;
        this.artist = artist;
        this.isPlaying = isPlaying;
    }

    public Music(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Boolean getIsPlaying() {
        return isPlaying;
    }

    public void play() {
        this.isPlaying = true;
    }

    public void stop() {
        this.isPlaying = false;
    }
}
