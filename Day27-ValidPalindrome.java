class Solution {
    public boolean isChar(char c){
        return ( (c >= 'a' && c <= 'z') || (c>='0' && c <='9')||(c>='A' && c <='Z'));

    }
    public boolean compare(char a, char b){
        char c;
        if(a<b){
            c=a;
            a=b;
            b=c;
        }
        if(a>='a'){
            if(b>='a') return a==b;
            else if(b>='A') return a==b+32;
            return false;
        }
        else if(a>='A'){
            return a==b;
        }
        return a==b;
        
    }
    public boolean isPalindrome(String s) {
        int i = 0 , j = s.length()-1;
        // boolean flag = true;
        while(i<j){
            while(i<j &&!isChar(s.charAt(i)))
                ++i;
            while(i<j && !isChar(s.charAt(j)))
                --j;
            if(!compare(s.charAt(i), s.charAt(j))) {            
                    return false;
            }
            ++i; --j;
        }
        return true;     
    }
    
}