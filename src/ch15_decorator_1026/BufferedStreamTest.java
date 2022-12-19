package ch15_decorator_1026;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;
		
		// 결론은 , 버퍼라는 공간에 담아서 파일의 입출력 한다. 
		// 사용하는 형식을 잘 보시면 됩니다. 
		// 기반 스트림으로 읽어서, 다시 보조 스트림에 담아서 작업하는 부분.
		try(FileInputStream fis = new FileInputStream("output3.txt");
				FileOutputStream fos = new FileOutputStream("copy5.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ���� �ϴ� �� " + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	}
}
