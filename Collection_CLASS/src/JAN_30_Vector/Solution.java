package JAN_30_Vector;
import java.io.*;
import java.util.*;

class Result {
    
    public static long subarraySum(List<Integer> arr) {
        int n = arr.size();
        long totalSum = 0;

        
        for (int start = 0; start < n; start++) {
            long subarraySum = 0;
            for (int end = start; end < n; end++) {
                subarraySum += arr.get(end);  
                totalSum += subarraySum;      
            }
        }
        return totalSum;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

         
        int n = Integer.parseInt(bufferedReader.readLine().trim());

       
        List<Integer> arr = new ArrayList<>();
        String[] values = bufferedReader.readLine().trim().split("\\s+");
        for (String value : values) {
            arr.add(Integer.parseInt(value));
        }

        
        long result = Result.subarraySum(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}