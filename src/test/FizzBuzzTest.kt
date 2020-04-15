package test

import main.*
import org.junit.jupiter.api.*
import kotlin.test.assertEquals

class FizzBuzzTest {

    private lateinit var fizzBuzz: FizzBuzz

    @BeforeEach
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun shouldProcessNumber() {
        assertEquals("1", fizzBuzz.processNumber(1))
        assertEquals("2", fizzBuzz.processNumber(2))
        assertEquals("Fizz", fizzBuzz.processNumber(3))
        assertEquals("4", fizzBuzz.processNumber(4))
        assertEquals("Buzz", fizzBuzz.processNumber(5))
        assertEquals("Fizz", fizzBuzz.processNumber(6))
        assertEquals("Buzz", fizzBuzz.processNumber(10))
        assertEquals("FizzBuzz", fizzBuzz.processNumber(15));
    }

    @Test
    fun shouldExecuteListOfNumberCorrectly() {
        assertEquals("1", fizzBuzz.execute(arrayOf<Int>(1)))
        assertEquals("1, 2", fizzBuzz.execute(arrayOf<Int>(1, 2)))
    }
}