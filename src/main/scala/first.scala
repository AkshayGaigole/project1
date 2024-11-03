object first {

  def main(args: Array[String]):Unit={

//    val a=10
//    println("value of a is :"+a)
//
//    var b=10
//    b=20
//    b=30
//    b=50
//    b=90
//
//    println("value of b is :"+b)
//
//    var c=10
//    println("value of c is :"+c)
//
//    if(c%2==0){
//      println("c is an even number")
//
//    }
//    else{
//      println("c is not an even number")
//    }
//
//    for (i<- 1 to 10 by 1){
//
//      println(i)
//    }
//
//    println("display 1 to 10 but by 3 steps")
//
//    for(i<- 1 to 10 by 3){
//      println(i)
//    }
//
//    for(i<-1 until 10 by 3){
//      println(i)
//    }

//    println("using while loop")
//    var num1=1
//    while(num1 <= 10){
//      println(num1)
//      num1=num1+1
//    }
//

//      var arr=Array(10,20,30,40,50,60,70,80,90,100)
//      println(arr(0))
//
//      arr.foreach(println)
//
//      val len =arr.length
//      println("length of array is :"+len)
//
//      for(i <- 0 until len ){
//        println(arr(i))
//
//      }


        /*
        var tup=(10,20,10.5,true)
        println("2nd element of the tuple is :"+tup._2)

        var c=0
        for(i<-tup.productIterator){
          println(i)
          c=c+1
        }
         */


        var mylist=List(10,20,30,40,50,60,70,80,90,100)
//        println(mylist(1))
//
//        mylist.foreach(println)

//        for(i <- 0 until mylist.length){
//          println(mylist(i))
//        }
//        println(" ")
//        println(mylist.head)
//        println(mylist.tail)

        val array1=Array(1,2,3,3,4,5)
        for(element <- array1){
          println(element)
        }




  }

}

