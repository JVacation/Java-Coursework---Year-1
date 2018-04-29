class Main {
    public static void main( String args[] )
   {
       System.out.print("#Enter the size of the square:"); 
       int square = BIO.getInt();
        for(int i=0;i<square * square;i++)
        {
                int height = i / square;
                int width = i % square;

                if(height==0 && width < square-1) { System.out.print('*'); }
                else if(width==0) { System.out.print('*'); }
                else if(width==(square-1))  { System.out.println('*'); }
                else if(height==(square-1))  { System.out.print('*'); }
                else { System.out.print('.'); }
    }
 }
}