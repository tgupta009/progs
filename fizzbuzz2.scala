import io.StdIn.readLine

def checkNum:Unit = {
  val input = readLine.toString.trim

  if (input != "quit")
  {
    ( input.toInt%3, input.toInt%5) match 
    { case (0,0) => println( input.toInt + "Fizz Buzz")
      case (0,n) => println( "Fizz")
      case (n,0) => println( "Buzz")
      case (_,_) => println ( " NA")
    }
 checkNum
  }
}

println("Enter a number to be checked for : ")
checkNum

