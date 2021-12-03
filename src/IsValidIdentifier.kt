fun isValidIdentifier(s: String): Boolean {
   val sChar = s.toCharArray()
   var k = 0
    if(sChar.isEmpty()) k = 1
    else if(sChar[0] == '_' || sChar[0] in 'a'..'z'){
        for(ch in sChar){
           if(ch in 'a'..'z' || ch in '0'..'9' || ch == '_') k++
           else  break }
   }
     return (k == sChar.size)
}
fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}