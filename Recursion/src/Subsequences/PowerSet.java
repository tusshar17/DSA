package Subsequences;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    static List<List<Integer>> subsets(int[] nums){

        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), nums, 0);

        return resultList;
    }

    static void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start){

        resultSets.add(new ArrayList<>(tempSet));

        for (int i = start; i < nums.length; i++){

            tempSet.add(nums[i]);

            backtrack(resultSets, tempSet, nums, i+1);

            tempSet.remove(tempSet.size()-1);
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        List<List<Integer>> res = subsets(arr);

        for (int i=0; i<res.size(); i++){
            for (int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j));
            }
            System.out.println();
        }

    }


}
