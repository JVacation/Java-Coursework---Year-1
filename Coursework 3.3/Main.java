class Main
{
    public static void main (String args [])
    {
    String wordentry ="";
    String word ="";
    System.out.print( "#Please enter a word:" );
    wordentry = BIO.getString();
    
    

    while(!wordentry.equals("END")){
       
        Boolean inOrder = true;

        while (inOrder ) {
       word = wordentry;
       word = word.toLowerCase();
       char previous = word.charAt(0);
       for (int x = 0; x < word.length() && inOrder ; x++) {
        inOrder = word.charAt(x) >= previous;
        previous = word.charAt(x);
      }

      if (inOrder ) {
        System.out.print(wordentry + "   letters in ascending order" + "\n");
      } else if (!inOrder ) {
        System.out.print(wordentry + "   letters not in ascending order" + "\n");
      }
        wordentry ="";
        word = "";
        System.out.print("#Please enter a word : ");
        wordentry = BIO.getString();
        if (wordentry.equals("END")){
            break;
      }
  }
 }
}
}
