package begin;

/*
  mian��������
  �ο���http://blog.51cto.com/lavasoft/53263
  1.����JVM���������JavaӦ�ó����ʱ�����Ȼ����main����������ʱ��ʵ���������Ķ���
  	����ͨ������ֱ�ӵ��ã��������Ϊpublic static��
  2.JVM��main����ֵ�����ƣ������з���ֵ����˷���ֵ����Ϊ��void
  3.java�淶�й̶�main�����и������������������ΪString[]
 */
public class HelloWorld {
	int a;
	static { 
        System.out.println("mainǰ��Ĵ����"); 
    } 
	public static void main(String args[]) {
		System.out.println("HelloWorld");
		int a = 5;//����һ��������
        int b = 5;
        int c = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("���������ǰ׺�����a="+a+",x="+x);
        System.out.println("�����������׺�����b="+b+",y="+y);
        int k = 2+c++;
        System.out.println("�����������׺�����c="+c+",k="+k);
	}
	static { 
        System.out.println("main����Ĵ����"); 
    } 
	
}
