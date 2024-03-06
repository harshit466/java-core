package com.learning.core.day3;
import java.util.ArrayList;
import java.util.List;
public class D03P05 {
	  public static void main(String[] args) {
	        String nums = "123";
	        int k = 2;
	        List<String> combinations = findCombinations(nums, k);
	        for (String combination : combinations) {
	            System.out.print(combination +",");
	        }
	    }

	    public static List<String> findCombinations(String nums, int k) {
	        List<String> combinations = new ArrayList<>();
	        backtrack(nums, k, 0, new StringBuilder(), combinations);
	        return combinations;
	    }

	    private static void backtrack(String nums, int k, int start, StringBuilder path, List<String> combinations) {
	        if (path.length() == k) {
	            combinations.add(path.toString());
	            return;
	        }
	        for (int i = start; i < nums.length(); i++) {
	            path.append(nums.charAt(i));
	            backtrack(nums, k, i + 1, path, combinations);
	            path.setLength(path.length() - 1);
	        }
	    }
}
