import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Hashmap {
	public static void main(String[] args) {
		Hashmap obj = new Hashmap();
		int[] arr = {1, 2, 3, 3, 5};
		List<Integer> result = obj.frequencyCount(arr);
		System.out.println(result); // Output: [1, 1, 3, 0, 1]
		int[] arr2 = {1, 4, 2, 4, 1};
		System.out.println(mostFreqEle(arr2)); // Output: 5
	}

	// Given an array of N integers. The task is to count the frequency of all elements in the array.
	// The frequency of an element is the number of times it appears in the array.
	// The output should be a list of integers where the i-th integer is the frequency of i+1 in the array.
	public List<Integer> frequencyCount(int[] arr) {
        int N = arr.length;
        HashMap<Integer,Integer>frqcnt=new HashMap<>();
        for(int i=0;i<N;i++){
            frqcnt.put(arr[i],frqcnt.getOrDefault(arr[i],0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=N;i++){
            result.add(frqcnt.getOrDefault(i,0));
        }
        return result;
    }
	
	// Given an array of N integers. The task is to find the most frequent element in the array.
// If there are multiple elements with the same frequency, return the largest element among them.

    static int mostFreqEle(int[] arr) {
        // code here
        int N = arr.length;
        HashMap<Integer,Integer>freqcnt=new HashMap<>();
        for(int i=0;i<N;i++){
            freqcnt.put(arr[i],(freqcnt.getOrDefault(arr[i],0)+1));
        }
        int maxfreq=Integer.MIN_VALUE;
        int Maxelem=-1;
        for(Map.Entry<Integer,Integer> entry:freqcnt.entrySet()){
         int element=entry.getKey();
         int freq=entry.getValue();
         if(freq>maxfreq || (freq==maxfreq && element>Maxelem)){
            Maxelem=element;
             maxfreq=freq;
         }
        }
        return Maxelem;
    }
}

