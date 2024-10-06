public class Main{

    public static void longestPalindromeSubstring(char s[]) {
        int n = s.length;
        int max = 1; 
        int k = 0;  
 
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
        
            if (isPalindrome(s, i, j)) {
               
                if (j - i + 1 > max) {
                    k = i;
                    max = j - i + 1;
                
                }
            }
        }
    }
    
    System.out.println("The longest palindrome subtring is:");
    for (int i = k; i < (k + max); i++) {
        System.out.print(s[i]);
    }
    }
    
    
    public static boolean isPalindrome(char[] ch, int first, int last) {
        while (first < last) {
            if (ch[first] != ch[last]) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "cbbd";
        String input2 = "babad";
        String input3 = "zzzz";
        char ch1[]=input1.toCharArray();
        char ch2[]=input2.toCharArray();
        char ch3[]=input3.toCharArray();
        longestPalindromeSubstring(ch1);
        System.out.println();
        longestPalindromeSubstring(ch2);
        System.out.println();
        longestPalindromeSubstring(ch3);
        
    }
}
