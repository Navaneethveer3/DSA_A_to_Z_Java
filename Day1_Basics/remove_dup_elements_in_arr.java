import java.util.*;

class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,2,8};
        sc.close();
        
        //Use HashSet to keep track of unique elements;
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int[] newArr = new int[set.size()];
        int ind = 0;
        for(int i : set){
            newArr[ind++] = i;
        }
        for(int i : newArr){
            System.out.print(i+" ");
        }
    }
}
