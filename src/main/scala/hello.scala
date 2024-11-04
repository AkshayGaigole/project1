import org.apache.spark.SparkContext

object hello {

  def main(args: Array[String]):Unit={

    val sc=new SparkContext("local[*]","Akshay")
    val input=sc.textFile("C:/Users/Admin/Documents/data.txt")
      val rdd1=input.flatMap(x=>x.split(" "))
      val rdd2=rdd1.map(x=>(x,1))
      val rdd3=rdd2.reduceByKey((x,y)=>x+y)
      rdd3.collect().foreach(println)
  }

}
