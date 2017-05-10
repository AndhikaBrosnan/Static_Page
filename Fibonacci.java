import java.util.ArrayList;
import java.util.List;
 
public class Fibonacci {
    
    private int pass=0;
    private int current=1;
    private int fibonacci;
    private List<Integer> list=new ArrayList<Integer>();
    
    public Fibonacci(){
        list.add(0);
        list.add(1);
    }
    
    public List<Integer> getFibonacci(int limit){
        
        for(int i=0;i<limit-2;i++){
            fibonacci=current+pass;
            pass=current;
            current=fibonacci;
            
            list.add(fibonacci);
        }
        
        return list;
    }
}
