/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/generate-grey-code-sequences/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*Returns an array of all n-bit gray codes sequence.
You are required to complete below method. */
class Solution {
    ArrayList<String> generateCode(int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        
        if (n == 1) {
            ans.add("0");
            ans.add("1");
            return ans;
        }
        
        ArrayList<String> prev = generateCode(n - 1);
        
        // Prefix 0 to the previous Gray codes
        for (String s : prev) {
            ans.add("0" + s);
        }
        
        // Prefix 1 to the reversed previous Gray codes
        for (int i = prev.size() - 1; i >= 0; i--) {
            ans.add("1" + prev.get(i));
        }
        
        return ans;
        
    }
}
