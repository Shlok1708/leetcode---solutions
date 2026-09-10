class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> shlok = new HashSet<>();
        for(int num : nums1){
            shlok.add(num);
        }
        Set<Integer>alok = new HashSet<>();
        for(int num : nums2){
            alok.add(num);
        }
        shlok.retainAll(alok);
        int sa[] = new int[shlok.size()];
        int kalu = 0;
        for(int num : shlok){
            sa[kalu++] = num;
        }
        return sa;
    }
}