package com.learning.core.day3;
import java.util.*;
public class D03P09 {
	public static void main(String[] args) {
        String[] input1 = {"abc", "efg", "cde", "ghi", "ija"};
        String[] input2 = {"Ijk", "kji", "abc", "cba"};

        System.out.println(canFormCircle(input1));
        System.out.println(canFormCircle(input2));
    }

    public static String canFormCircle(String[] strings) {
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        for (String string : strings) {
            char firstChar = string.charAt(0);
            char lastChar = string.charAt(string.length() - 1);
            graph.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(lastChar);
            inDegree.put(lastChar, inDegree.getOrDefault(lastChar, 0) + 1);
        }

        for (String string : strings) {
            if (dfs(string.charAt(0), new HashSet<>(), graph)) {
                return "Yes";
            }
        }

        return "No";
    }

    public static boolean dfs(char node, Set<Character> visited, Map<Character, List<Character>> graph) {
        visited.add(node);
        if (graph.containsKey(node)) {
            for (char neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    if (dfs(neighbor, visited, graph)) {
                        return true;
                    }
                } else if (visited.size() == 1 && neighbor == node) {
                    return true;
                }
            }
        }
        visited.remove(node);
        return false;
    }
}
