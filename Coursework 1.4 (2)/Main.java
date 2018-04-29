class Main{
    public static void main( String args[] )
 {
     int rows, i, j;
  
     System.out.print("#Enter number of rows in square pattern");
     rows = BIO.getInt();
      for(i = 0; i < rows; i++){
         for(j = 0; j < rows; j++){
               System.out.print("");
         }
         System.out.print("\n");
       } 
}
}