def fizzBuzz(i:Int):Unit = {
  if (i<30)
  {
   if (i%3 == 0 ) println(i + " Fizz")
   if  (i%5 == 0) println(i+ " Buzz")
   if (i%15 ==0 ) println(i + " FizzBuzz")
   fizzBuzz(i+1) 
  }

}

  fizzBuzz(15)


