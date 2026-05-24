class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(!set.contains(i))
                set.add(i);
            else return true;
        }
        return false;
    }
}