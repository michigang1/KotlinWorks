data class AmountOfElementsOfArrayByType(val amountOfNull: Int,
                                         val amountOfInt: Int,
                                         val amountOfDouble: Int,
                                         val amountOfChar: Int,
                                         val amountOfString: Int,
                                         )

fun List<Any?>.amountOfElementsByType(): AmountOfElementsOfArrayByType {
        val amountOfNull = this.count { it is Unit? }
        val amountOfInt = this.count { it is Int }
        val amountOfDouble = this.count { it is Double }
        val amountOfChar = this.count { it is Char }
        val amountOfString = this.count { it is String }
    
        return AmountOfElementsOfArrayByType(
            amountOfNull,
            amountOfInt,
            amountOfDouble,
            amountOfChar,
            amountOfString)
}

fun AmountOfElementsOfArrayByType.printlnAmountOfElementsByType(){
    println("\nInt - ${this.amountOfInt}" +
            "\nDouble - ${this.amountOfDouble}" +
            "\nChar - ${this.amountOfChar}" +
            "\nString - ${this.amountOfString}" +
            "\nNull - ${this.amountOfNull}")
}

fun main(){
    val array = listOf('a','b','c', 1, 2, 3, 4, 5, 2.7, 3.14, "UA", "John Lennon", null, null)
    val amountOfElementsByType = array.amountOfElementsByType()
    amountOfElementsByType.printlnAmountOfElementsByType()
}
