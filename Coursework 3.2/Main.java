class Main
{
    public static void main (String args [])
    {
        String str ="";
        
        System.out.print("#Enter word to calculate how many vowels:");
        str = BIO.getString();
        
        String chr=" ";
        
        while(!str.equals("END")){ 
            int acharCount = str.length()- str.replaceAll("a","").length();
            int AcharCount = str.length()- str.replaceAll("A","").length();
            int echarCount = str.length()- str.replaceAll("e","").length();
            int EcharCount = str.length()- str.replaceAll("E","").length();
            int icharCount = str.length()- str.replaceAll("i","").length();
            int IcharCount = str.length()- str.replaceAll("I","").length();
            int ocharCount = str.length()- str.replaceAll("o","").length();
            int OcharCount = str.length()- str.replaceAll("O","").length();
            int ucharCount = str.length()- str.replaceAll("u","").length();
            int UcharCount = str.length()- str.replaceAll("U","").length();
            
            int charCount = acharCount + AcharCount + echarCount + EcharCount + icharCount + IcharCount + ocharCount + OcharCount + ucharCount + UcharCount;
        
            System.out.printf("[ %d] vowels in \"%s\"", charCount, str );
            System.out.println();
            System.out.print("#Enter line of text:");
            str = BIO.getString();
            
            if (str.equals("END")){
                break;
        }
       }
    
    }
}
