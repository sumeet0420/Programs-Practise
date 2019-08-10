/******************************************************************************
Write to program to add the numbers presents in a String without using the Characters class. A number is defined as a sequence of digit.
For eg. if your string is "He12l34l1o798aw1", the numbers it should add is 
12 + 34 + 1 + 798 + 1 = 846

*******************************************************************************/

public class SumOfDigits
{
	public static void main(String[] args) {
		String x = "He12l34l1o798aw1";
		int sum = 0;
		for(int i=0;i<x.length();i++){
		    String out = "";
		    while(i<x.length()&&isDigit(String.valueOf(x.charAt(i)))){
		    out = out + String.valueOf(x.charAt(i));
		    i++;
		    }
		    if(isDigit(out)){
		    sum+=Integer.parseInt(out);
		    }
		    
		}
		System.out.println(sum);
	}
	
	public static boolean isDigit(String x){
	    boolean flag = false;
	    try{
		    int y = Integer.parseInt(x);
		    flag = true;
		    } catch (Exception e){
		    } 
		    return flag;
	}
}
