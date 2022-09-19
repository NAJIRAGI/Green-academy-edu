package chapter11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Strchk {
	public static void main(String[] args) {
		String str1 = "Abc";
		String str2 = "Abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		
		
		System.out.println(str1 == str2); // 주소값끼리 비교하므로 true
		System.out.println(str3 == str4); // 주소값끼지 비교하므로 false
		System.out.println(str1.equals(str2)); // String에 equals를 사용 시 변수가 가지고 있는 "" 안에 내용을 비교 하므로 true
		System.out.println(str3.equals(str4)); // String에 equals를 사용 시 변수가 가지고 있는 "" 안에 내용을 비교 하므로 true
		
		System.out.println();
		System.out.println();
		
		String str5 = "Abc";
		
		System.out.println(str5.toLowerCase()); // 문자열 소문자로만
		System.out.println(str5.toUpperCase()); // 문자열 대문자로만
		
		System.out.println();
		System.out.println();
		
		String str6 = "     Abc    ";
		System.out.println(str6.trim()); // 문자열 공백 부분 제거.
		
		System.out.println();
		System.out.println();
		
		String str = "Java Programming";
		
		System.out.println(str); // 문자열 Java Programming 출력
		byte[] bytes = str.getBytes();  // 위 문자열을 바이트 타입으로 변환
		
		for(byte b:bytes) {
			System.out.print(b); // 바이트타입 출력
			System.out.print(",");
		}
	
		String str_1 = new String(bytes); // 바이트 타입을 다시 문자열로 변환
		System.out.println(str_1); // 문자열 Java Programming 출력
		System.out.println();
		System.out.println();
		
		int i = 100;
		String str7 = i + ""; // 문자열에 int 값 대입
		String str8 = String.valueOf(i); // 문자열에 int 값 대입
		
		int j = Integer.parseInt("100"); // int에 문자열값 대입
		long k = Long.parseLong("100"); // long에 문자열값 대입
		System.out.println("str7 : " + str7);
		System.out.println("str8 : " + str8);
		System.out.println("j : " + j);
		System.out.println("k : " + k);
		
		
		System.out.println();
		System.out.println();
		
		
		String str9 = "Java";
		String str10 = "Programming";
		
		String str11 = str9.concat(str10); // 문자열 합치기
		String str12 = str9+str10; // 문자열 합치기
		System.out.println(str11);
		System.out.println(str12);
	
		System.out.println();
		System.out.println();
		
		Date now = new Date();
		String now1 = now.toString();
		System.out.println(now1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now2 = sdf.format(now);
		System.out.println(now2);
		

		System.out.println();
		System.out.println();
		
		Calendar nows = Calendar.getInstance();
		int y = nows.get(Calendar.YEAR);
		int M = nows.get(Calendar.MONTH);
		int d = nows.get(Calendar.DAY_OF_MONTH);
		int w = nows.get(Calendar.DAY_OF_WEEK);
		int a = nows.get(Calendar.AM_PM);
		int h = nows.get(Calendar.HOUR);
		int m = nows.get(Calendar.MINUTE);
		int s = nows.get(Calendar.SECOND);
		
		System.out.println("년 : " + y);
		System.out.println("월 : " + M);
		System.out.println("일 : " + d);
		System.out.println("주 : " + w);
		System.out.println("오전 오후 : " + a);
		System.out.println("시 : " + h);
		System.out.println("분 : " + m);
		System.out.println("초 : " + s);
	}

}
