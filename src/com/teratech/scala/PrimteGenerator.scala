package com.teratech.scala

import scala.Stream

object PrimteGenerator extends App 
{

    def primeStream(stream:Stream[Int]): Stream[Int] =
    {
        return Stream.cons(stream.head, stream.tail.filter(_ % stream.head != 0))
    }
    
    val s = primeStream(Stream.from(2))
    s.filter(_ < 20).foreach(println)
    println("Mehrdad Was here.")
    
  
}