/*A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
 the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
  because it uses the letters A-Z at least once (case is irrelevant).

  Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
val ENGLISH_ALPHABET = charArrayOf(
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
)
const val AMOUNT_OF_LETTERS = 26

object PangramTest {
    fun main(args: Array<String>) {
        val pangram = "The quick brown fox jumps over the lazy dog"
        var counterOfLetters = 0
        
    }
    fun String?.isPangram(): Boolean{
       var result = this?.toCharArray()
       return
    }
}