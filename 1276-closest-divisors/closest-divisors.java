class Solution {
    public int[] closestDivisors(int num) {
        int numOne = num + 1;
        int numTwo = num + 2;

        for (int temp = (int) Math.sqrt(numTwo); temp > 0; temp--) {
           
            if (numOne % temp == 0) {
                return new int[]{temp, numOne / temp};
            } 

            
            if (numTwo % temp == 0) {
                return new int[]{temp, numTwo / temp};
            }
        }

        return new int[]{};
    }
}