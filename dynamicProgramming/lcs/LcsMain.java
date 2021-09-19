package dynamicProgramming.lcs;

import java.util.Arrays;

public class LcsMain {

    static int[][] memory;

    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
//@1- Memorization
//         memory = new int[str1.length()+1][str2.length()+1];
//        for(int[] array : memory){
//            Arrays.fill(array, -1);
//        }
//
//        int fLength = longestCommonStringRecursiveMemorization("ABCDGH", "AEDFHR", str1.length(), str2.length());
//        System.out.println(fLength);
//
//        System.out.println(Arrays.deepToString(memory));
        // @2- Tabulation

        int l = longestCommonStringTabulation(str1, str2);
        System.out.println(l);

    }

    static String longestCommonString(String str1, String str2){

        int n1 = str1.length();
        int n2 = str2.length();
        String result = "";

        for(int i=0; i<n1; i++){
            for(int j=0; j<n2;j++){
                if(str1.charAt(i) == str2.charAt(j))
                    result += str1.charAt(i);
            }
        }
        return result;

    }

    static int longestCommonStringTabulation(String str1, String str2){

        int n = str1.length();
        int m = str2.length();
        int[][] k = new int[n+1][m+1];

        for(int i=0; i<n; i++) k[i][0] = 0;
        for(int i=0; i<m; i++) k[0][m] = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1))
                    k[i][j] = 1 + k[i-1][j-1];
                else
                    k[i][j] = Math.max( k[i][j-1],k[i-1][j]);
            }
        }
        return k[m][n];

    }

    static int longestCommonStringRecursiveMemorization(String str1, String str2, int n1, int n2) {

        if(memory[n1][n2] != -1) return memory[n1][n2];

        if(n1==0 || n2==0)
            memory[n1][n2] = 0;
        else if(str1.charAt(n1-1) == str2.charAt(n2-1))
            memory[n1][n2] = 1 + longestCommonStringRecursiveMemorization(str1, str2, n1-1, n2-1);
        else
            memory[n1][n2] = Math.max(longestCommonStringRecursiveMemorization(str1, str2, n1-1, n2),
                    longestCommonStringRecursiveMemorization(str1, str2, n1, n2-1));

        return memory[n1][n2];

    }
}
