class Main
{
    public static void main (String args [])
    {
        String str ="";
        String strentry ="";
        String reverse ="";
        System.out.print("#Enter word to calculate if it is a palindrome:");
        strentry = BIO.getString();
        
        
        while(!strentry.equals("END")){
            str = strentry.toLowerCase();
            int length = str.length();
            
            
          for ( int i = length - 1 ; i >= 0 ; i-- ){
                reverse = reverse + str.charAt(i);
           }
           
          if (str.equals(reverse)){
               System.out.printf("%s is a palindrome", strentry);
          }else{
               System.out.printf("%s is not a palindrome", strentry);
           }
          
            if (strentry.equals("END")){
                break;
          } 
          
           str ="";
           reverse ="";
           strentry ="";
       
           System.out.println();
           System.out.print("#Enter word to calculate if it is a palindrome:");
           strentry = BIO.getString();
           str = strentry;
  
           
     
       }
    }
}
