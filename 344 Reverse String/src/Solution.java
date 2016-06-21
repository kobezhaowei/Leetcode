/*Write a function that takes a string as input and returns the string reversed.
Example:
Given s = "hello", return "olleh".
*/

/*
 * best solution
 * 
 * 
 * //method 1: use StringBuilder
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    //method 2: use swap method
    public String reverseString(String s){
        if(s == null || s.length() == 0)
            return "";
        char[] cs = s.toCharArray();
        int begin = 0, end = s.length() - 1;
        while(begin <= end){
            char c = cs[begin];
            cs[begin] = cs[end];
            cs[end] = c;
            begin++;
            end--;
        }

        return new String(cs);
    }
 */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution sol = new Solution();
		String input = "lebron";
		String output = sol.reverseString(input);

		System.out.print(output);

	}

	public String reverseString(String s) {

		char[] newOnes = new char[s.length()];
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			newOnes[j++] = s.charAt(i);

		}

		String result = new String(newOnes);
		String resultNew = String.valueOf(newOnes);// char array to string

		return result +"\n"+resultNew; // change to a new line
	}

}
