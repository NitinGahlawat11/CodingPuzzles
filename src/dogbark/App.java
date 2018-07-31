package dogbark;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(dogTrouble(true,5));
System.out.println(dogTrouble(true,15));
System.out.println(dogTrouble(false,5));
System.out.println(dogTrouble(true,22));
	}
public static boolean dogTrouble(boolean barking,int hour) {
if(barking==true&&hour<7) {
	return true;
}
else if(barking==true&&hour>20) {
	return true;
}
else {
	return false;
}
}
}