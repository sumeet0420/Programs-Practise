public class CountOccurrence{

    public static int countOccurrence(String word, String find){
        int count = 0;
        int inc = find.length()-1;
        while(word.indexOf(find) != -1){
            count++;
            int index = word.indexOf(find);
            word = word.substring(index+inc);
        }
        return count;
    }
    public static void main(String args[]){
    System.out.println(countOccurrence("ABCBCBAABCB","BCB"));
    }
}
