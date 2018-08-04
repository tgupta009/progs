
def fact2(n:Int) : Int = n match {
   case 0 => 1
   case _ => n*fact2(n-1) 
}
printf("Factorial of 5 is ")
println(fact2(5))
  
def sumSquare2(n:Int) : Int = n match {
  case 1 => 1
  case _ => n*n + sumSquare2(n-1)
 }

println("Sum of Squares of 5 is ")
println(sumSquare2(5))

def countDown2(n:Int) : Unit = 
  n match {
   case 0 =>
   case _ => 
     println(n)
     countDown2(n-1)

  }

println("Countdown from 10 : \n")
//printf(countDown2(10))  //CountDown2 retuns nothings hence printf gives error as it is expecting something.
//
countDown2(10)


