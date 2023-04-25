fun main(){
    var randomWord = randomString("Morning")
    println(randomWord)

    var p = password("stronggg")
    println(p)

    bingo()

    val account = CurrentAccount(123456, "Esther", 200.00)

    var addedBalance = account.deposit(10.00)
    println(addedBalance)

    var reducedBalance = account.withdraw(5.00)
    println(reducedBalance)

    var allDetails = account.details()



}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomString(word:String):List<Any>{

    var result = mutableListOf<Any>()

    result.add(word[0])

    var lastChar = word.length-1

    result.add(word[lastChar])

    result.add(word.length)

    var vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    if (word[0] in vowels){
        result.add("Starts with vowel")
    }
    else{
        result.add("Does not start with vowel")
    }
    return result
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun password(pass:String):Boolean{
    return pass.length in 8..16 && pass!="password"
}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun bingo() {
    var range = 1..1000
    for (r in range) {
        if (r/6 is Int && r/8 is Int){
            println("Bingo")
        }
        else if(r/6 is Int){
            println("Multiple of 6")
        }
        else if(r/8 is Int){
            println("Multiple of 8")
        }
//        else{
//            println(r)
//        }
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
open class CurrentAccount(var accountNumber:Long, var accountName:String, var balance:Double){
    fun deposit(amount:Double): Double{
        var balance = balance+amount
        return balance
    }

    fun withdraw(amount: Double):Double{
        var balance =  balance-amount
        return balance
    }

    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount():CurrentAccount(){

    fun withdrawals(withdraw:Int){
        var allWithdrawals = 0
    }
}