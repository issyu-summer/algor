/**
 * @author summer
 * @see <a href=""></a><br/>
 */
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0){
            return false;
        }
        int i=0,j=matrix[0].length-1;
        int tmp=target+1;boolean exist=false;
        while(i<matrix.length&&j>=0&&(tmp=matrix[i][j])!=target){
            if(target<tmp){
                j--;
            }else{
                i++;
            }
        }
        return tmp==target;
    }

    public static void main(String[] args) {
        int[][] ar = new int[1][1];
        ar[0][0]=-5;
        System.out.println(new Solution().findNumberIn2DArray(ar,-10));
    }
}
