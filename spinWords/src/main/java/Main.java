/**
 * Write a function that takes in a string of one or more words,
 * and returns the same string, but with all five or more letter words reversed
 * (Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */

public class Main {
    public static void main(String[] args) {

        String result = spinWords("Welcome");
        System.out.println(result);
    }


    public static String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder(); //StringBuilder - представляет последовательность символов
        String[] splitSentence = sentence.split(" "); //split - возвращает массив строк, вычисленных путем разделения данной строки вокруг данного регулярного выражения

        //цикл по массиву строк, разделенных по пробелу
        for (String word : splitSentence) {
            if (word.length() > 4) {
                sb.append(new StringBuilder(word).reverse().toString() + " "); //append-конкатенация строк
            } else {
                sb.append(word + " ");
            }
        }
        return sb.toString().trim();
    }



     /*   public static String spinWords(String sentence) {
            char[] c = sentence.toCharArray();
            int length = c.length-1;
            for(int i =0; i <= length; i++){
                System.out.println(c[i]);
            }
            for(int i = 0; i < length/2; i++) {
                char temp = c[length-i];
                c[length-i] = c[i];
                c[i] = temp;
            }
            String swappedString = new String(c);
            return swappedString;
        } */

}
