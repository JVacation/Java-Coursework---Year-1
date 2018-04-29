class Main
{
    public static void main( String args[] )
 {
    System.out.print("#Enter students cw mark: " );
    int courseworkMark = BIO.getInt();
     
    System.out.print("#Enter students exam mark: " );
    int examMark = BIO.getInt();
    
    double mark = (examMark + courseworkMark) / 2.0;
    
    System.out.printf("ex = %d cw = %d mark =%6.1f ", examMark, courseworkMark, mark);
 
 }
}
