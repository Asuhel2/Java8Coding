import java.io.*;
import java.util.*;

public class Solution {
    public static List<Integer> isPower(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if ((num & (num - 1)) == 0) {
                result.add(1);
            } else {
                result.add(0);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(input[i]));
        }
        List<Integer> result = isPower(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}