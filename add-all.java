

import java.util.PriorityQueue;

public class Kata {
    public static int addAll(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
        }

        int totalCost = 0;
        while (minHeap.size() > 1) {
            int firstNum = minHeap.poll();
            int secondNum = minHeap.poll();
            int cost = firstNum + secondNum;
            totalCost += cost;
            minHeap.offer(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int minCost = addAll(nums);
        System.out.println("Minimum total cost of addition: " + minCost);
    }
}
