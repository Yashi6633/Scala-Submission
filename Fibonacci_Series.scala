object Fibonacci_Series extends App {

    def main (args: Array[String])
    {
        fibonacciseq(1)
    }

    def fibonacci(n:Int): Int= n match {
        case 0 => 0
        case 1 => 1
        case _ => fibonacci(n-1)+fibonacci(n-2)
    }

    def fibonacciseq(a:Int): Unit = {
        if(a>0) fibonacciseq(a-1)
        println(fibonacci(a))
    }
}