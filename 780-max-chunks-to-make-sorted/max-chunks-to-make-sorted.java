class Solution {
    public int maxChunksToSorted(int[] A) {
       int N = A.length;
        int max = -1;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            if(A[i] > max){
                max = A[i];
            }
            set.add(A[i]);
            if(set.size() == max+1){
                count++;
            }
        }
        return count;
    }
}