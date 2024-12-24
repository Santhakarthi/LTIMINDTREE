
public class Elipses {
public static String concat(String...n) {
	String sum=" ";
	for(String name:n) {
		sum=sum+name;
	}
	return sum;
}


public static void main(String[] args) {
	System.out.println("sum of three name:"+concat("karthi","hari","vasu"));
}
}
