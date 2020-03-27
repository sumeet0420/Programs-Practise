import java.util.stream.Stream;

public class MaxIntegerFromString {

	public static void main(String[] args) {
	String x = "132549";
	System.out.println(Stream.of(x.split("")).mapToInt(Integer::parseInt).max().getAsInt());
	}

}
