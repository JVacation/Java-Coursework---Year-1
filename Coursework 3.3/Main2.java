class Main2
{
    public static void main(String[] args) 
    {
        String wordentry = "";
        String word = "";
        System.out.print("#Enter word: ");
        wordentry = BIO.getString();
        
        while (!wordentry.equals("END")){
            boolean ascend = true;
            while (ascend ) {
                word = wordentry;
                word = word.toLowerCase();
                char previous = word.charAt(0);
            for (int x = 0; x < word.length() && ascend ; x++){
                    ascend = word.charAt(x) >= previous;
                    previous = word.charAt(x);
                }
            
            if (ascend )
            {
                System.out.print(wordentry + " letters in ascending order");
            }
            else if (!ascend )
            {
                System.out.print(wordentry + " letters not in ascending order");

            }
            System.out.println();
            wordentry ="";
            word = "";
            System.out.print("#Enter word: ");
            wordentry = BIO.getString();
            if (wordentry.equals("END")){
                break;
            }
        }
    }
}
}