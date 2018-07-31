package embeddollar;

public class Dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(adddollar("NITIN"));
	}
	public static  String adddollar(String str) {
		if(str.length()<=1) {
			return str;
		}
		else {
			return str.charAt(0)+"$"+adddollar(str.substring(1));
		}
	}

}
