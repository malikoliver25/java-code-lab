package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("Hello world! This is a text processor.");
}
    /*Slpits a String into an array by tokenizing it.
    *Counts words and prints them 
    * @param text Full string to be split
    */
   public static void countWords(String text) {
       var words = text.split("\\s+");
       int numberOfWords = words.length;

       String message = String.format("The text contains %d words.", numberOfWords);
       System.out.println(message);

         for (String word : words) {
              System.out.println(word);
       }
   }


}