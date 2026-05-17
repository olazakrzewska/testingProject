package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleServiceTest {

    TriangleService service = new TriangleService();

    @Test
    void validTriangle() {
        assertTrue(service.isValid(3,4,5));
    }

    @Test
    void invalidTriangle() {
        assertFalse(service.isValid(1,2,10));
    }

    @Test
    void areaTest() {
        assertEquals(6.0, service.area(3,4,5), 0.001);
    }
}