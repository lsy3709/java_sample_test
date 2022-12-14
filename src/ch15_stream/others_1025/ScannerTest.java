package ch15_stream.others_1025;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름:");
		// 문자열 읽기.
		String name = scanner.nextLine();
		System.out.println("직업:");
		String job = scanner.nextLine();
		System.out.println("사번:");
		int num = scanner.nextInt();
				
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}
}
