package Assignment4

object caseclass {
  
    case class point(a:Int,b:Int)
    {
        def x:Int=a
        def y:Int=b
        
        def +(that:point)=point(this.x+that.x,this.y+that.y)// Q part 1- +function
        def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)  // Q part 2- move function
        def distance(that:point)=scala.math.sqrt(scala.math.pow(this.x-that.x,2) +scala.math.pow(this.y-that.y,2)) //Q part3 - distance function
        def invert()= point(this.y,this.x)// Q part 4- invert function
    }
    def main(args: Array[String])
    {
      val s1=point(3,6) 
      val s2=point(2,2) 
      val s3=s1.move(3,4) 
      println(s1)
      println(s3)
      println(s1==s2)
      val v4=s1+s2       
      println(v4)
     println(s2.distance(s1)) 
     println(s1.invert())   
      
    }
}