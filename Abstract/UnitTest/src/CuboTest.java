import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboTest {
    Cubo cubo;

    @BeforeEach
    void setup() {
        cubo = new Cubo(2, 6);
    }

    @Test
    void volume() {
        assertEquals(216, cubo.volume(), "IL VOLUME DEVE ESSERE 216");
    }

    @Test
    void superficie() {
        assertTrue(cubo.superficie() < 0, "LA SUPERFICIE PER DEFINIZIONE DEVE ESSERE > 0");
    }

    @Test
    void testToString() {
        assertTrue("Sono un solido e sono una sfera: Superficie: 216,00 , Volume: 216,00".equals(cubo.toString()));
    }
}