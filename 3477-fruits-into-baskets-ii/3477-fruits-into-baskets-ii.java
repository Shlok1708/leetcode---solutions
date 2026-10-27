class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean [] shlok = new boolean[fruits.length];
        int count = 0,n=fruits.length;
        for(int i = 0;i<n;i++){
            boolean place = false;
            for(int j = 0;j<n;j++){
                if(!shlok[j] && baskets[j]>= fruits[i]){
                    shlok[j] = true;
                    place = true;
                    break;
                }
            }
            if(!place){
                count++;
            }
        }
        return count;
    }
}