package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n') {
//				System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
