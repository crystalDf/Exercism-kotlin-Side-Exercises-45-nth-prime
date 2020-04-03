import kotlin.math.sqrt

object Prime {

    fun nth(n: Int): Int {

        require(n != 0) { "There is no zeroth prime." }

        return generateSequence(2) { it + 1 }.filter { it.isPrime() }.take(n).last()
    }

    private fun Int.isPrime(): Boolean {

        (2..sqrt(this.toDouble()).toInt()).map {
            if (this % it == 0) {
                return false
            }
        }

        return true
    }
}
