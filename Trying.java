import java.util.HashMap;
import java.util.Map;

public class Trying {
    public static void main(String[] args) {
        Map<Integer, Integer> A=new HashMap<>();
        for(int i=1;i<=5;i++){
            A.put(i,(i*i));
        }
        //printMap(new HashMap<>(A));
        Map<Integer,Integer> B=A;
        //printMap(new HashMap<>(B));
        B.remove(1);
        printMap(new HashMap<>(A));
        System.out.println("B/w A&B: "+A.equals(B));
        Map<Integer,Integer> C=new HashMap<>(A);
        /*for(int i=1;i<=5;i++){
            C.put(i,(i*i));
        }*/
        //C.remove(3);
        System.out.println("B/w A&C: "+A.equals(C));
        System.out.println("B/w B&C: "+B.equals(C));
    }

    public static void printMap(Map<Integer,Integer> A){
        for(Integer i : A.keySet())
            System.out.println(i+" : "+A.get(i));
        System.out.println("------------");
    }
}



