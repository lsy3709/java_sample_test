package ch15_stream.inputstream_1025;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		 		
		try (FileInputStream fis = new FileInputStream("input.txt")){
			// input.txt 내용안에 있는 부분을 바이트 단위로 읽어서 해당 객체에 들어 있음.  
			
			byte[] bs = new byte[10];
			int i;
			while ( (i = fis.read(bs)) != -1){
				/*for(byte b : bs){
					System.out.print((char)b);
				}*/
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "바이트 읽음." );
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}