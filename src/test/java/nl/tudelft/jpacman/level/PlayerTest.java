package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

        private static final PacManSprites PACMAN_SPRITE = new PacManSprites();
        private PlayerFactory playerFactory = new PlayerFactory(PACMAN_SPRITE);
        private Player ThePlayer = playerFactory.createPacMan();

        @Test
        void isAlive(){
            assertThat(ThePlayer.isAlive()).isEqualTo(true);
        }
}
