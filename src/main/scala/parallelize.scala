import org.apache.spark.SparkContext

object parallelize {

  def main(args: Array[String]):Unit={

    val sc=new SparkContext("local[*]","parallelize")

    val arr=Array(10,20,30,40,50,60,70,80)
    val rdd1=sc.parallelize(arr)
    rdd1.collect.foreach(println)
  }

}
