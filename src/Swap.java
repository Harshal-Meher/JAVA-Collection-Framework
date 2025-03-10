import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("black");
        list.add("red");

        for (String swap :list){
            System.out.println("Befour Swap : "+swap);
        }
        System.out.println("----------------------------");
        Collections.swap(list,0,1);

        for (String swap :list){
            System.out.println("After Swap : "+swap);
        }
    }
}
