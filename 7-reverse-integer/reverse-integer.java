import java.util.*;
class Solution{
    public int reverse(int x){
        int ni=0;
        while(x!=0){
            if (ni > Integer.MAX_VALUE / 10 || ni < Integer.MIN_VALUE / 10) {
                return 0;
             }
                int digit = x%10;
                ni=ni*10+digit;
                x= x/10;
        }
        return ni;
    }
}

