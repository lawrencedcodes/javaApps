import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        
        int result = 7;
        int[] myArray = new int[] {1,2,3,4,5,7,9};
        int[] finalResult = getSum(myArray,result);
        System.out.print(finalResult[0]+" "+finalResult[1]);
    }
    public static int[] getSum(int[] myArray, int result) {
        Map<Integer,Integer> visited = new HashMap<>();
        for (int i=0; i<myArray.length; i++) {
            int delta = result-myArray[i];
            if (visited.containsKey(delta)) {
                return new int[] {i, visited.get(delta)};
            }
            visited.put(myArray[i],i);
        }
        return new int[] {-1,-1};
    }
}