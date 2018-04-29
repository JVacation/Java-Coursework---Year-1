class Main
{
    public static void main (String args [])
    {
    int c,r,x,longestRow;
    System.out.print("#Enter Size of Diamond:");
    longestRow = BIO.getInt();
    x = longestRow;
    if(x >= 5 && x <= 41){
        if(x%2==0){
        System.out.printf("Side of diamond (%d) must be odd", x);  
      }else{
          for(int row=1 ; row<=longestRow ; ++row)

         {
            int i = (2*row) - 1;
            if(i>longestRow) 
            i = 2*(longestRow-row+1) - 1;
            for(int j=0 ; j<(longestRow-i)/2 ; ++j) 
            System.out.print(".");
            for(int j=0 ; j<i ; ++j){
            if (j == 0 || j == (i -1)) { 
                System.out.print("*");
            }else{
                System.out.print(".");
            }
            }
            for(int j=0 ; j<(longestRow-i)/2 ; ++j) 
            System.out.print(".");
            System.out.println();
        }
    }
    }else{
       System.out.printf("Side of diamond (%d) must be between 5 & 41", x);
    }
  }
}
    
      


