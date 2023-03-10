
object MyClass {
    
    def main(args: Array[String]) {
        
        var n=5;
        while(n>0){
            println("n is " + n);
            n-=1;
        }
        
        for(i <- 1 to 5){
            println("i is "+ i);
        }
        
        for(i <- 1 to 10 by 2){ // go from 1 to 10 and step = 2
            print(i + " ");
        }
        
    }
}