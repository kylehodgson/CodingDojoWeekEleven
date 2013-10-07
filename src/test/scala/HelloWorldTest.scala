package com.example.test
 
import org.scalatest.FunSuite
import org.example.GeneratePrimes	
 
class HelloWorldTest extends FunSuite {
 
  test("Hello World") {
    expect(true) { true }
  }

  test("Print prime numbers")
  {

  	var generator = new GeneratePrimes()

  	expect (List(2,3,5,7)) {generator.generate(10)}
  	expect (List(2,3,5,7,11)) {generator.generate(12)}
  }


}