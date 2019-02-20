package exercise;
import java.util.List;
import java.util.ArrayList;
public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() ==0){
            return 0;
        }
        int max = 1;
        int i = 0;//重复元素的 最后一个的下标
        int j=0;//不重复元素的下标
        char addChar = ' ';
        List list = new ArrayList();
        list.add(s.charAt(0));
        //遍历String
        for(int k=1;k<s.length();k++){
            //新添加的元素不重复则添加，j指针向前
        	addChar = s.charAt(k);
            if(!list.contains(s.charAt(k))){
                list.add(s.charAt(k));
                j=k;
                if((j-i+1)>max){
                max = j-i+1;
                }
                //重复则i的指针向后移动
            }else{
                list.add(s.charAt(k));
                i=list.lastIndexOf(s.charAt(k));
                if((j-i+1)>max){
                max = j-i+1;
                }
            }
        }
        return max;
    }
}
