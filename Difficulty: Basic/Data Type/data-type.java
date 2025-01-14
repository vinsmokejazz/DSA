//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
       switch(str.toLowerCase()){
           case "character":
               return 1;
        case "integer":
            return 4;
            
            case "long":
                return 8;
                
                case "float" :
                    return 4;
                    
                    case "double":
                        return 8;
                        
                        default:
                        return -1;
       }
    }
}

