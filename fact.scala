import io.StdIn._

def factorial(n:Int) : Int = {
if (n<2) 
  1
else 
  n*factorial(n-1)
}

printf("Enter number to calculate factorial for : " ) 

println("Factorial is " +factorial(readLine.toInt))

