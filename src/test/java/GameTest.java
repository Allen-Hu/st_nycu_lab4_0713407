import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void winTest() {
        assertEquals(Kekka.p1, game.duel(Waza.rock    , Waza.scissors));
        assertEquals(Kekka.p1, game.duel(Waza.paper   , Waza.rock    ));
        assertEquals(Kekka.p1, game.duel(Waza.scissors, Waza.paper   ));
    }

    @Test
    void loseTest() {
        assertEquals(Kekka.p2, game.duel(Waza.rock    , Waza.paper   ));
        assertEquals(Kekka.p2, game.duel(Waza.paper   , Waza.scissors));
        assertEquals(Kekka.p2, game.duel(Waza.scissors, Waza.rock    ));
    }

    @Test
    void drawTest() {
        assertEquals(Kekka.draw, game.duel(Waza.rock    , Waza.rock    ));
        assertEquals(Kekka.draw, game.duel(Waza.paper   , Waza.paper   ));
        assertEquals(Kekka.draw, game.duel(Waza.scissors, Waza.scissors));
    }

    @Test
    void validTest() {
        assertEquals(true, game.valid("rock"));
        assertEquals(true, game.valid("paper"));
        assertEquals(true, game.valid("scissors"));
        assertEquals(false, game.valid("peko"));
        assertEquals(false, game.valid("A"));
    }
}