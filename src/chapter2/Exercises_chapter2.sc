// 2.1
def signum(number: Int) : Int = {
  if(number > 0) 1
  else if (number < 0) -1
  else 0
}

// 2.2
val empty = {}
// same as
val empty2 = ()

// 2.4
for(i <- (0 to 10).reverse) println(i)

// 2.5
def countdown(n: Int) {
  for(i <- (0 to n).reverse) println(i)
}

countdown(5)

// 2.6
var counter: Long = 1
for(letter <- "Hello") counter = counter * letter
println(counter)

// 2.7
println("Hello".map(_.toLong).product)

// 2.8
def product(s: String): Long = {
  s.map(_.toLong).product
}

println(product("Hi"))

// 2.9
def productRec(s: String): Long = {
  if(s.isEmpty) 1
  else s.head.toLong * productRec(s.tail)
}

println(productRec("Hi"))

// 2.10
def pow(x: Double, n: Int): Double = {
  if(n > 0) {
    if(n % 2 == 0) {
      val y = pow(x, n/2)
      y * y
    } else {
      x * pow(x, n - 1)
    }
  }
  else if(n == 0) 1
  else 1 / pow(x, -n)
}

println(pow(1.5, 2))