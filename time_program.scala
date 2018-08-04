import scala.io.StdIn.readLine

/* this program takes time as input (separated by :) and returns number of seconds.
 * ?
 */


print(" Enter the time in HH:MM:SS format separated by ':' ")

val time =  readLine //"10:20:40"
val firstCol = time.indexOf(':')
val lastCol = time.lastIndexOf(':')
val hour = time.substring(0,firstCol).toInt
val minute = time.substring((firstCol+1),lastCol).toInt
val seconds = time.substring((lastCol+1)).toInt
val total_sec = hour*3600+minute*60+seconds
println(s"$hour, $minute, $seconds")

println(total_sec)

