import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String name="MahammadSUhel";
		StringBuilder str=new StringBuilder(name);
		System.out.println(str.reverse());
		
		//Using streams
		System.out.println(Arrays.stream(name.split("")).reduce("",(a,b)->b+a).toString());
	}

}