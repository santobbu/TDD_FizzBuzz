package main

class FizzBuzz {
    fun processNumber(number: Int): String? {
        if (isDividedByThree(number) && isDividedByFive(number)) {
            return "FizzBuzz";
        }

        if (isDividedByThree(number)) {
            return "Fizz";
        }

        if (isDividedByFive(number)) {
            return "Buzz";
        }

        return number.toString()
    }

    private fun isDividedByThree (number: Int): Boolean {
        return number % 3 == 0
    }

    private fun isDividedByFive (number: Int): Boolean {
        return number % 5 == 0
    }
}