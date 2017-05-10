import com.agungsetiawan.interview.stack.Stack;
import java.util.List;
 
public class App 
{
    public static void main( String[] args ) {
   
        Fibonacci fibonacci=new Fibonacci();
        List<Integer> list=fibonacci.getFibonacci(10);
        
        for(Integer i:list){
            System.out.print(i+", ");
        }
       
    }
}
