class Main
{
    public static void main (String args [])
    {
        String str ="";
        System.out.print("#Enter line of text:");
        str = BIO.getString();
        String chr=" ";
        
        while(!str.equals("END")){ 
            int charCount = str.length()- str.replaceAll(" ","").length();
        
            System.out.printf("[ %d] spaces in \"%s\"", charCount, str );
            System.out.println();
            System.out.print("#Enter line of text:");
            str = BIO.getString();
       }
    
    }
}
