package lavender;

public class SplitExample {

	public static void main(String[] args) {
		String str="hi hello all  welcome people";
		 String[] words=str.split(" ");
		 for(String s:words){
			 System.out.println(s);
		 }
System.out.println(str);

	}

}
