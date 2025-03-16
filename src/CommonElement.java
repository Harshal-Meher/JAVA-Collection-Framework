import java.util.HashSet;
import java.util.Set;

public class CommonElement {
    public static void main(String[] args) {
        System.out.println(" Common Element ");
        int[] arr1 = {1,2,3,4,5,4};
        int[] arr2 = {6,7,8,3,4,1,5};

//      HashSet<Integer> res = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();

        for (int i =0; i<arr1.length; i++) {
            for(int j =0 ; j<arr2.length ; j++) {
                if(arr1[i] == arr2[j]){
//                    System.out.println(arr1[i]);
                    res2.add(arr1[i]);
                }
            }
        }
        for(Integer result : res2){
            System.out.println(result);
        }


    }

}
