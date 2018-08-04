import scala.io.StdIn.readLine

/* this program takes time as input (separated by :) and returns number of seconds.
 * ?
 */



def breakDownTime(time:String) : (Int, Int, Int) = {

val firstCol = time.indexOf(':')
val lastCol = time.lastIndexOf(':')
val hour = time.substring(0,firstCol).toInt
val minute = time.substring((firstCol+1),lastCol).toInt
val seconds = time.substring((lastCol+1)).toInt
 (hour, minute, seconds)

}

def calcSeconds(hour:Int, Minute:Int, sec:Int) : Int  =  hour*3600+Minute*60+sec 
 

print(" Enter the time in HH:MM:SS format separated by ':' ")
val time =  readLine //"10:20:40"
val (hour, minute, sec) = breakDownTime(time)

//val total_sec = 
val timeInSec = calcSeconds(hour,minute,sec)
val timeinseconds = calcSeconds(breakDownTime(time)._1,breakDownTime(time)._2,breakDownTime(time)._3) 

print(s"timeInseconds = $timeinseconds")

//println(s"$hour, $minute, $seconds")

println(timeInSec)

