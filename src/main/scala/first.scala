object first {

  def main(args: Array[String]):Unit={

    val a=10
    println("value of a is :"+a)

    var b=10
    b=20
    b=30
    b=50
    b=90

    println("value of b is :"+b)

    var c=10
    println("value of c is :"+c)

    if(c%2==0){
      println("c is an even number")

    }
    else{
      println("c is not an even number")
    }

    for (i<- 1 to 10 by 1){

      println(i)
    }

    println("display 1 to 10 but by 3 steps")

    for(i<- 1 to 10 by 3){
      println(i)
    }



  }

}

