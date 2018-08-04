import io.StdIn._

def inputList(n:Int) : List[Int] = 
{
  if (n<1 ) Nil
  else 
    readInt :: inputList(n-1)
}


def operateOnList(lst:List[Int], base:Int, func :(Int, Int) => Int ):Int =
{ 

  if ( lst == Nil)
    base
  else 
    func(lst.head, operateOnList(lst.tail,base,func))
  
}


def operateOnList2(lst:List[Int], base:Int, g: (Int, Int) => Int) : Int = 
{
 lst match  
  {
    case Nil => base
    case h :: t => g(lst.head,operateOnList2(lst.tail,base,g))

  }
}


def fillList(n:

val lst = inputList(5)
println(lst)
println(operateOnList2(lst,0,_+_))



