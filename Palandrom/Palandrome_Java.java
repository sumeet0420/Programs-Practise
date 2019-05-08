public class Palandrom {

    public static boolean isPalandrome_usingForLoop(String word){
        word = word.toLowerCase();
        String reverse = "";
        for(int i = word.length()-1; i>=0 ; i -- )
            reverse + = word.charAt(i);
        return word.equals(reverse);
    }
    
    public static boolean isPalandrome_usingStringBuilder(String word){
        word = word.toLowerCase();
        String reverse = new StringBuilder (word).reverse().toString();
        return word.equals(reverse);
    }   
    
    public static void main(String args[]){
        System.out.println(isPalandrome_usingForLoop("Bob"));
        System.out.println(isPalandrome_usingStringBuilder("Bob"));
    }
}
