
object MyClass {
    
    
    def get_max(x : Int, y : Int, z : Int) : Int = {
        var maxy : Int = x;
        
        if(y > x && y > z)
            maxy = y;
        else if(z > x && z > y)
            maxy = z;
        
        return maxy;
    }

    def main(args: Array[String]) {
        
        var n = 5;
        var k:Int = 10;
        println(n)
        println(k)
        for(i <- 1 to 10) print(i+" ") // print 1 to 10
        println()
       for(i <- 1 until 10) print(i+" ")  // print 1 to 9
       
       val name: String = "mukesh";
       println(name);
       
    
    // list
    var fruits = List("mango","orange")
    for(a <- fruits) println(a)
    
    
    // maximum by function 
    println("maximum is - " + get_max(4,3,5));
    
    var arr = Array(4,3,5,2);
    var s = 0;
    
    for(n <- arr)
        s+=n;
    
    println("sum of array is : " + s)
    
    }
}