package proxyimage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage proxyImage;
    @BeforeEach
    void setUp() {
        proxyImage = new ProxyImage("disappointed.png");
    }

    @Test
    void display() {
        assertEquals(proxyImage.getFileName(), "disappointed.png");
        assertNull(proxyImage.getRealImage());

        proxyImage.display();

        assertNotNull(proxyImage.getRealImage());
    }
}