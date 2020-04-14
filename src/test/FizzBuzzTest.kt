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
        val result = fizzBuzz.processNumber(1)

        assertEquals("1", result)
    }
}