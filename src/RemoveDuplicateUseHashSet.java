import java.util.Arrays;import java.util.HashSet;public class RemoveDuplicateUseHashSet {    public static void main(String[] args) {        int arr[] = {1,2,3,4,4,5,6,6,7};        System.out.println(Arrays.toString(RemoveDuplicate(arr)));        HashSet<Integer> remove = new HashSet<>();        remove.add(12);        remove.add(1);        remove.add(2);        remove.add(22);        remove.add(12);        System.out.println(remove);    }    public static int[] RemoveDuplicate(int arr[]) {        HashSet<Integer> remove = new HashSet<>();        for (int i : arr){            remove.add(i);        }        return remove.stream().mapToInt(Integer::intValue).toArray();    }}