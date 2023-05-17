
public class Main {
	public static int strStr(String haystack, String needle) {
        int i=0, j=0;
        while(i<haystack.length()-needle.length()+1){
            if(haystack.charAt(i) == needle.charAt(0)){
                while(j < needle.length()){
                    if(haystack.charAt(i) == needle.charAt(j)){
                        i++; j++;
                    }
                }
                if(j == needle.length()){
                    return i-j;
                }
                else {
                	return -1;
                }
                
            }
            i++;
        }   
        return -1;     
    }
	public static void main(String[] args) {
	    int ans = strStr("leetcode", "leeto");
		System.out.println(ans);
	}
}
