package sort;
/*
 * ��������
 * */
public class QuickSort {

	public static void main(String[] args) {
		int[] num = {6,8,5,10,2,12};
		int first = 0;
		int last = num.length-1;
		quickSortUse(num,first,last);
		for(int i = 0;i<num.length;i++) {
			System.out.print(num[i]+".");			
		}
	}
	public static void quickSortUse(int[] num,int first,int last) {
		int left = first;
		int right = last;
		int temp=num[left];
		if(left>=right) {	//��������ֻ��1��Ԫ�ص����
			return;
		}
		while(left<right) {
			while(right>left&&num[right]>=temp) {
				right--;
			}
			num[left]=num[right];
			
			while(left<right&&num[left]<=temp) {
				left++;
			}
			num[right] = num[left];
		}
		
		num[left] = temp;
		quickSortUse(num, first, left-1);
		quickSortUse(num, right+1, last);
		/*int i=first,j=last,temp;  //(1)��ʼ��i��j    
	    if(first>=last) 
	     return ;
	    temp=num[i];                //(2)�Ե�һ������Ϊ�Ƚ�ֵ,���浽temp�� 
	    while(i<j)
	    {    
	      while(j>i&&num[j]>=temp)  //(3)j--,��Сֵ 
	      j--;
	      num[i]= num[j];             //����Сֵ,��s[i]�� 
	       
	      while(i<j&&num[i]<=temp)  //(4)i++,�Ҵ�ֵ 
	      i++;
	      num[j]=num[i];
	     
	    }
	    num[i]=temp;             //(5)���Ƚ�ֵ����s[i]�� 
*/	        
	  /*(6)��ֳ��������� s[0,i-1]��s[i+1,n-1]�ֿ�ʼ���� */
	 /* quickSortUse(num,first,i-1);         //��
	  quickSortUse(num,i+1,last);        //��     
*/	}
	
}
