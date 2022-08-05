
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int max = 0;
        if(nums.length == 0) {
            return 0;
        }

        Set set = new HashSet();

        for (int a: nums) {
            set.add(a);
        }

        List<Integer> list = new ArrayList(set);
        int[] answer = new int[list.size()];


        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        for (int i = 0; i < answer.length-1; i++) {
            if(answer[i]+1 == answer[i+1]) {
                max++;
                count = Math.max(count, max);
            } else {
                max = 0;
            }
        }

        if(count == 0) {
            return 1;
        } else {
            return count + 1;
        }
    }
}