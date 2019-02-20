package exercise;

public class ReverseInteger {
	public static int reverse(int x) {
		Integer num = x;
        String str = num.toString();
        int sum =0;
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.charAt(0));
        System.out.println(str);
        
        if(str.charAt(0) == '-') {
        	for(int i=str.length()-1;i>0;i--) {
        		int k = str.charAt(i)-'0';
        	if(sum+(k*Math.pow(10, i-1))<Math.pow(2, 31)) {
         	   sum += (k*Math.pow(10, i-1));
        		}else {
        			return 0;
        		}
            }
        	if(-sum>Math.pow(-2, 31)) {
       		 sum = -sum;
       	 }else {
       		 return 0;
       	 }
        }else {
        	for(int i=str.length()-1;i>=0;i--) {
        		int k = str.charAt(i)-'0';
        		if(sum+(k*Math.pow(10, i))<Math.pow(2, 31)) {
              	   sum += (k*Math.pow(10, i));
             		}else {
             			return 0;
             		}
            }
        }
       return sum;
    }
	public static void main(String[] args) {
		int x=-123;
		System.out.println(Math.pow(2, 31));
		System.out.println(Math.pow(-2, 31));
		System.out.println(reverse(x));
	}
}
//官方題解
//取得整數的每一位其實不需要String字符串。
class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            res = res * 10 + pop;
        }
        return res;
    }
}
