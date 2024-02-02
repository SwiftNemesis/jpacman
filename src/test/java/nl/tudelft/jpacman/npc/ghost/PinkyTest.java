package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PinkyTest {
    private static final PacManSprites PACMAN_SPRITE = new PacManSprites();
    private static final GhostFactory GHOST_FACTORY = new GhostFactory(PACMAN_SPRITE);

    @Test
    void doesExist(){
        Ghost pinky = GHOST_FACTORY.createPinky();
        assertThat(pinky).isNotNull();
    }

}
