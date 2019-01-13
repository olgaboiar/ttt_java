import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    void whenGameStartsWellcomigMessageIsShown() {
        Game game = new Game();
        String message = game.greet();
        Assertions.assertEquals("Hello", message);
    }
//    Game game = new Game();
//    String mesage = game.greet();
//
//    assertEquals(message, "HEllo!");

}