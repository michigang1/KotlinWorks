fun  List<Int>.sum(list: List<Int> ): Int {
  var result = 0;
    for (i in list) {
        result += i
    }
    return result
}
fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)
    val sum = list.sum()
    println(sum)
}