package yeonsu.study.ee;

public class substring {
public static void main(String[] args) {
	
	String str = "고양이세마리";
	
	str.substring(0);
	
//	System.out.println(str.substring(1));
//	System.out.println(str.substring(2,1));
	//System.out.println(str.substring(1,2));
	
	
	str = "대한민국";
	System.out.println(str.substring(1,2));
	str = "대한민국만세";
	System.out.println(str.substring(0,4));
	
}
}
