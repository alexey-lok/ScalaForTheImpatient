// 1.2
3 - ((math sqrt 3) * (math sqrt 3))
// res0: Double = 4.440892098500626E-16

// 1.4
"crazy" * 3
// res1: String = crazycrazycrazy

// 1.5
10 max 2
// res2: Int = 10
// method max is defined in RichInt


// 1.6
BigInt(2).pow(1024)
// res3: scala.math.BigInt = 179769313486231590772930519...

// 1.7
import scala.util.Random
import BigInt._
probablePrime(8, Random)
// res4: scala.math.BigInt = 151
// BigInt.probablePrime takes bitLength of rnd number
// and Random singleton object

// 1.8
probablePrime(100, Random).toString(36)
// res5: String = 1zkgw5rvv16h2tt5cdrt

// 1.9
val myStr: String = "abcdef"
myStr.head // res6: Char = a
myStr.last // res7: Char = f

// 1.10
myStr take 3 // res8: String = abc
myStr drop 3 // res9: String = def
myStr takeRight 3 // res10: String = def
myStr dropRight 3 // res11: String = abc