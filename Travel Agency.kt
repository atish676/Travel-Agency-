import java.util.*

var pl: Int = 0
var tiexp: Int = 0
var totals: Int = 0
var total: Int = 0

fun Total() {
    val x: Int = tiexp.plus(totals).plus(total).plus(5000)
    var ans: String? = null

    println("------------------------------------------------------------------------------------------------------------------------")
    println("GST on Travel Agency is 18%")
    println("For Sightseeing and some Other Activities, we will include some extra charges :)")
    print("Would you like to go Sightseeing with us ? [Y] for Yes and [N] for No ")
    ans = readLine()!!

    when (ans) {
        "y" -> println("\t\t\t\t\t\t\t\t\t\tYour Total for whole travel = RS ${(x.times(0.18).plus(x)).toLong()}")
        "Y" -> println("\t\t\t\t\t\t\t\t\t\tYour Total for whole travel = RS ${(x.times(0.18).plus(x)).toLong()}")
        "n" -> println(
            "\t\t\t\t\t\t\t\t\t\tYour Total for whole travel = RS ${(x.times(0.18).plus(x).minus(15900)).toLong()}"
        )
        "N" -> println(
            "\t\t\t\t\t\t\t\t\t\tYour Total for whole travel = RS ${(x.times(0.18).plus(x).minus(15900)).toLong()}"
        )
        else -> Total()
    }
    println("------------------------------------------------------------------------------------------------------------------------")
}

fun hotel(no: Int, family: Int, mf: Int) {
    var rooms: Int = 0
    val summer: Int = 100
    val winter: Int = 50
    val days: Int = no
    val members: Int = family

    println("------------------------------------------------------------------------------------------------------------------------")
    println("\t\t\t\t\t\t\t\t\t\t--LETS CHOOSE THE HOTEL REQUIREMENTS--")
    println("------------------------------------------------------------------------------------------------------------------------")
    print("Enter Number of Rooms required: ")
    val sc = Scanner(System.`in`)
    rooms = sc.nextInt()

    if (mf == 4 || mf == 5 || mf == 6 || mf == 7 || mf == 8 || mf == 9) {
        total = rooms * days * members * plan() * summer
        println("\t\t\t\t\t\t\t\t\t\tYour total for the stay = RS $total")
        println("------------------------------------------------------------------------------------------------------------------------")

    } else {
        total = rooms * days * members * plan() * winter
        println("\t\t\t\t\t\t\t\t\t\tYour total for the stay = RS $total")
        println("------------------------------------------------------------------------------------------------------------------------")
    }
}

fun plan(): Int {
    var x: Int = 0
    val breakfast: Int = 10
    val lunch: Int = 7
    val dinner: Int = 5
    var price: Int = 1

    println("------------------------------------------------------------------------------------------------------------------------")
    println("Please choose your plan for the stay:")
    println("1. Continental Plan")
    println("2. American Plan")
    println("3. Modified American Plan")
    println("4. European Plan")
    print("Your choice: ")
    val sc = Scanner(System.`in`)
    x = sc.nextInt()
    println("------------------------------------------------------------------------------------------------------------------------")

    when (x) {
        1 -> price = breakfast
        2 -> price = breakfast + lunch + dinner
        3 -> price = modified(breakfast, lunch, dinner, price)
        4 -> price = 4
        else -> plan()
    }
    return price
}

fun modified(breakfast: Int, lunch: Int, dinner: Int, price: Int): Int {
    var ld: String? = null
    var price: Int = 1

    println("What would you like to be provided with ? Lunch[L] or Dinner[D] ? ")
    print("Your choice: ")
    ld = readLine()!!

    when (ld) {
        "L" -> price = breakfast + lunch
        "l" -> price = breakfast + lunch
        "d" -> price = breakfast + dinner
        "D" -> price = breakfast + dinner
        else -> modified(breakfast, lunch, dinner, price)
    }
    return price
}

fun taxi(pl: Int, family: Int) {
    var taxi: Int = 0
    val charge: Int = 8
    var distance: Int = 0

    println("\t\t\t\t\t\t\t\t\t\t--CALCULATING TAXI FARE--")
    println("------------------------------------------------------------------------------------------------------------------------")
    print("Number of taxis you would require from home: ")
    val sc = Scanner(System.`in`)
    taxi = sc.nextInt()

    if (pl == 5 || pl == 6) {
        print("Please enter the distance between your Home to Railway Station (in KM): ")
        distance = sc.nextInt()
        println("Taxi fare from your Home to Railway Station = ${family * taxi * charge * distance}")
        println("Taxi fare from Railway Station to your Hotel = ${family * taxi * charge * 20}")
        totals = (family * taxi * charge * distance) + (family * taxi * charge * 20)
        println("\t\t\t\t\t\t\t\t\t\tTotal Fare = RS $totals")
    } else {
        print("Please enter the distance between your Home to Airport (in KM): ")
        distance = sc.nextInt()
        println("Taxi fare from your Home to Airport = ${family * taxi * charge * distance}")
        println("Taxi fare from Airport to your Hotel = ${family * taxi * charge * 30}")
        totals = (family * taxi * charge * distance) + (family * taxi * charge * 30)
        println("\t\t\t\t\t\t\t\t\t\tTotal Fare = RS $totals")
    }
}

fun ticket(no: Int, adult: Int, child: Int, age: Int): Int {
    var exp: Int = 0
    var n: String? = null

    println("\t\t\t\t\t\t\t\t\t\t--BOOK YOUR TICKET--")
    println("\t\t\t\t\t\t\t\t\t\t--AND--")
    println("\t\t\t\t\t\t\t\t\t\t--CHOOSE PLACE YOU WANT TO GO--")
    println("------------------------------------------------------------------------------------------------------------------------")
    print("Press [N] for National Trip and [I] for International Trip: ");
    val sc = Scanner(System.`in`)
    n = readLine()!!
    println("------------------------------------------------------------------------------------------------------------------------")

    if (n == "N" || n == "n") {
        println("------------------------------------------------------------------------------------------------------------------------")
        println("Please select the destination if you want to travel via Airplane")
        println("For GOA in Economy Class, press 1 ")
        println("For GOA in Business Class, press 2 ")
        println("For SHIMLA in Economy Class, press 3 ")
        println("For SHIMLA in Business Class, press 4 ")
        println("------------------------------------------------------------------------------------------------------------------------")
        println("Please select the destination if you want to travel via Railways")
        println("For GOA, press 5")
        println("For SHIMLA, press 6")
        println("------------------------------------------------------------------------------------------------------------------------")
        print("Your choice: ")
        pl = sc.nextInt()

        if (pl == 1) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense of journey for GOA in Economy Class is RS 4000 per head ")
            exp = 4000
        } else if (pl == 2) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense of journey for GOA in Business Class is RS 6000 per head ")
            exp = 6000
        } else if (pl == 3) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense of journey for SHIMLA Economy Class is RS 4000 per head")
            exp = 4000
        } else if (pl == 4) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense of journey for SHIMLA Business Class  is RS 6000 per head")
            exp = 6000
        } else if (pl == 5) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense of journey for GOA via RAILWAYS is RS 4000 per head")
            exp = 4000
        } else if (pl == 6) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense of journey for SHIMLA via RAILWAYS is RS 4000 per head")
            exp = 4000
        } else {
            println("Please enter between 1 and 6")
            ticket(no, adult, child, age)
        }
    } else if (n == "I" || n == "i") {
        println("\t\t\t\t\t\t\t\t\t\t--GET PASSPORT READY--")
        println("------------------------------------------------------------------------------------------------------------------------")
        println("For TOKYO in Economy Class, press 7")
        println("For TOKYO in Business Class, press 8")
        println("For PARIS in Economy Class, press 9")
        println("For PARIS in Business Class, press 0")
        print("Your choice: ")
        pl = sc.nextInt()

        if (pl == 7) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense for journey of TOKYO in Economy Class is RS 30000 per head")
            exp = 30000
        } else if (pl == 8) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense for journey of TOKYO in Business Class is RS 45000 per head")
            exp = 45000
        } else if (pl == 9) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense for journey of PARIS in Economy Class is RS 30000 per head")
            exp = 30000
        } else if (pl == 0) {
            println("\t\t\t\t\t\t\t\t\t\tTotal expense for journey of PARIS in Business Class is RS 45000 per head")
            exp = 45000
        } else {
            println("Please enter one of 7 , 8 , 9 and 0")
            ticket(no, adult, child, age)
        }
    } else
        ticket(no, adult, child, age)

    return when (age) {
        1 -> (exp.times(no))
        else -> (exp.times(adult) + exp * child)
    }
}

fun isDate(df: Int) = df in 1..31
fun isMonth(mf: Int) = mf in 1..12
fun isYear(yf: Int) = yf in 2020..2025
fun date(df: Int, mf: Int, yf: Int): Boolean {
    return when {
        isDate(df) -> true
        isMonth(mf) -> true
        isYear(yf) -> true
        else -> false
    }
}

fun main(args: Array<String>) {
    println("------------------------------------------------------------------------------------------------------------------------");
    println("\t\t\t\t\t\t\t\t\t\t---WELCOME TO PAISA WASOOL TRAVELS !!---")
    println("------------------------------------------------------------------------------------------------------------------------");

    var family: Int = 0
    var adult: Int = 0
    var child: Int = 0
    var no: Int = 0
    var df: Int = 0
    var mf: Int = 0
    var yf: Int = 0
    var age: Int = 0

    val sc = Scanner(System.`in`)

    print("Enter the number of family members going on trip (including children): ")
    family = sc.nextInt()

    print("Enter the number of adults (if any): ")
    adult = sc.nextInt()
    child = family - adult

    print("If you're going along with a child and is aged between 10 and 18 years, press 1 else press 0: ")
    age = sc.nextInt()

    print("Number of days you want to go on your trip: ")
    no = sc.nextInt()

    print("Please enter journey date only (dd format): ")
    df = sc.nextInt()
    if(!date(df,0,0)){
        print("Please enter VALID journey date only (dd format): ")
        df = sc.nextInt()
    }


    print("Please enter journey month only (mm format): ")
    mf = sc.nextInt()
    if(!date(0,mf,0)){
        print("Please enter VALID journey month only (mm format): ")
        mf = sc.nextInt()
    }

    print("Please enter journey year only (yyyy format): ")
    yf = sc.nextInt()
    if(!date(0,0,yf)){
        print("Please enter VALID journey year only (yyyy format): ")
        yf = sc.nextInt()
    }

    println("------------------------------------------------------------------------------------------------------------------------")

    tiexp = ticket(family, adult, child, age)

    println("\t\t\t\t\t\t\t\t\t\tYour total expense of travel is $tiexp")

    hotel(no, family, mf)

    taxi(pl, family)

    Total()

    println("\t\t\t\t\t\t\t\t\t\tTHANK YOU FOR TRAVELLING WITH US !!!")
}
