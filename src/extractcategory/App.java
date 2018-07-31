package extractcategory;
public class App {

	public static void main(String[] args) {
	
		String str="We have a large inventory of thingw in our warehouse falling in"
				+"the category:apparael and the slighlty more"
				+"in demand category:makeup along with the category:furniture and...";
		
		 
//display value of each category
//output should be as
//apparael
//makeup
//furniture
		
displayCat(str);
	}
	
	
public static void displayCat(String string) {
	int i=0;

while(true) {
	int first=string.indexOf("category",i);
	if(first==-1)break;
	int start= first+9;
	int end= string.indexOf(" ", start);
	System.out.println(string.substring(start, end));

i=end+1;
}
}
}

