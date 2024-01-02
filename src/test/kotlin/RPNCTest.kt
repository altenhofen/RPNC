import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RPNCTest {
    private val rpnc = RPNC()

    @Test
    fun testAddition() {
        val expected = 6.0
        assertEquals(expected, rpnc.apply("4 2 +"))
    }

    @Test
    fun testSubtraction() {
        val expected = 13.0
        assertEquals(expected, rpnc.apply("20 7 -"))
    }

    @Test
    fun testMultiplication() {
        val expected = 42.0
        assertEquals(expected, rpnc.apply("7 6 *"))
    }

    @Test
    fun testDivision() {
        val expected = 25.0
        assertEquals(expected, rpnc.apply("50 2 /"))
    }

    @Test
    fun testDoubles() {
        val expected = 39.25
        assertEquals(expected, rpnc.apply("7.5 2.5 + 7.85 * 2 /"))
    }

    @Test
    fun testErrors() {
        val expected = 39.25
        assertEquals(expected, rpnc.apply("7.5 2.5 hey + 7.85 * 2 / its wrong"))
    }
}