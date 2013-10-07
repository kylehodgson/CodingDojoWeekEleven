package org.example
class GeneratePrimes {
  var primes = List()
  def generate(number : Integer) = {
  	for ( n <- 2 until number + 1) {
  		Console.println("does it work " + n)
  	}
  }
}