import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PlayerTest {
  Music music;
  Player player;

  @BeforeEach
  void setup() {
    player = new Player();
    music = new Music("Cellphone", "Unaloon");
  }

  @Test
  void shouldPlayMusic() {
    Command playMusic = new PlayMusic(music);
    player.runCommand(playMusic);
    assertEquals(true, music.getIsPlaying());
  }

  @Test
  void shouldStopMusic() {
    Command stopMusic = new StopMusic(music);
    player.runCommand(stopMusic);
    assertEquals(false, music.getIsPlaying());
  }

  @Test
  void shouldCancelCommandToStopPlayMusic() {
    Command playMusic = new PlayMusic(music);
    Command stopMusic = new StopMusic(music);

    player.runCommand(playMusic);
    player.runCommand(stopMusic);
    player.cancelLastCommand();

    assertEquals(true, music.getIsPlaying());
  }

  @Test
  void shouldCancelCommandToPlayMusic() {
    Command playMusic = new PlayMusic(music);
    Command stopMusic = new StopMusic(music);

    player.runCommand(stopMusic);
    player.runCommand(playMusic);
    player.cancelLastCommand();

    assertEquals(false, music.getIsPlaying());
  }

}
