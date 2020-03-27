import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfIntegersInString {

	public static void main(String[] args) {
		String x = "rt043vf543po90lp765pop1000";
		Matcher matcher = Pattern.compile("(\\d+)").matcher(x);
		int sum = 0;
		while (matcher.find()) {
			System.out.println(matcher.group());
			sum += Integer.parseInt(matcher.group());
		}
		System.out.println(sum);
	}
}