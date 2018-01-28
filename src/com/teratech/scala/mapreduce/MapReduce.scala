package com.teratech.scala.mapreduce

object MapReduce2 
{
    def main(args: Array[String]):Unit =
	  {
        import io.Source._
        val lines =  fromFile("logs/The-Adventure-Of-The-Three-Students.txt") 
        val  wordGrouped= lines.getLines().toList.flatMap(_.split("\\W+")).map(i => (i->1)).groupBy(_._1)
        // wordGrouped will consist of elements such as the following:  (leave,List((leave,1), (leave,1), (leave,1)))
        // So, all we need to replace the second element of the tuple which is a list with the size of the list.
        wordGrouped.mapValues(_.size).foreach(println)
        // The following is another method of doing it if you want to use just map().
        // wordGrouped.map(wordTuple => (wordTuple._1, wordTuple._2.size)).foreach(println)
				
	  }
  
}