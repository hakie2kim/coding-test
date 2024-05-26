/*
BufferedReader + toCharArray + Arrays.sort
*/
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] nums = br.readLine().toCharArray();
        
        Arrays.sort(nums);
        
        int numsLen = nums.length;
        for (int i = numsLen - 1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
	}
}