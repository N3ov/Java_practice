import java.io.Console;
// using command open file
public class InputString{
	// �Ѧ��ܼ� ���� ����
	public static void main(String args[]){
			Console console = System.console();
			// �Ѧ��ܼ�
			String str1, str2 ;
			
		System.out.println("please input first String:");
		str1 = console.readLine();
		System.out.println("please input second String:");
		str2 = console.readLine();
		
		System.out.println("Input String:");
		System.out.println(str1);
		System.out.println(str2);
		
	}
	
}