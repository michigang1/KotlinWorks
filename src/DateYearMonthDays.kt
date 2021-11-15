import java.util.Scanner
import kotlin.math.abs

 class DateYearMonthDays(_year: Int, _month: Int, _day: Int) {
     private var year = _year
     private var month = _month
     private var day = _day


    fun isLeapYear (): Boolean = (year>0 && (year%4==0) )

    fun monthDays (): Int? {
        if( (month in (1..12) ) && (year > 0) ) {
            when(month){
                1 -> return 31
                2 -> {
                    return if(isLeapYear()) 29
                    else 28
                }
                3 -> return 31
                4 -> return 30
                5 -> return 31
                6 -> return 30
                7 -> return 31
                8 -> return 31
                9 -> return 30
                10 -> return 31
                11 -> return 30
                12 -> return 31
            }
        }
    return null
    }
   fun prevDate (): String {
       return if(day==1 && monthDays()==31)
                 if (month==1) ("${abs(day-31)+1}.${12-(month-1)}.${year-1}")

                 else ("${abs(day-31)+1}.${month-1}.$year")

                 else if (day==1 && monthDays()==30) ("${abs(day-30)+1}.$month.$year")

                 else ("${day-1}.${month}.$year")
   }

   fun nextDate (): String {
       return if(day==31 && monthDays()==31)
           if (month==12) ("${abs(day-31)+1}.${month-month+1}.${year+1}")

           else ("${abs(day-31)+1}.${month+1}.$year")

       else if (day==30 && monthDays()==30) ("${abs(day-30)+1}.${month+1}.$year")

       else ("${day+1}.${month}.$year")
   }

}

fun main() {
    val scan = Scanner(System.`in`)

    var day: Int
    var month: Int
    var year: Int


    println("Enter the year:")
    year = scan.nextInt()
    println("Enter the month:")
    month = scan.nextInt()
    println("Enter the day:")
    day = scan.nextInt()

    val date = DateYearMonthDays(year,month,day)

    while(year<0 || month !in 1..12 || (day !in 1..31 || ((day==29) && !date.isLeapYear() && month==2))){

    println("Enter  correct the year:")
    year = scan.nextInt()
    println("Enter the correct month:")
    month = scan.nextInt()
    println("Enter the correct day:")
    day = scan.nextInt()
}
    println("Date:$day.$month.$year")
    println("Is leap year?-${date.isLeapYear()}")
    println("Month #$month has ${date.monthDays()} days")
    println("Prev date:${date.prevDate()}")
    println("Next date:${date.nextDate()}")

}