import java.util.*;

public class top_k_frequent_elements {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		int[] topKElements = topKFrequent(nums,k);
		for(int i : topKElements) {
			System.out.print(i+" ");
		}
		
	}
	public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        Queue<Tuple> pq = new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m : freq.entrySet()){
            pq.add(new Tuple(m.getValue(),m.getKey()));
        }
        while(list.size()!=k){
            list.add(pq.remove().num);
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
	static class Tuple{
	    int freq, num;
	    Tuple(int freq, int num){
	        this.freq = freq;
	        this.num = num;
	    }
	}
}
