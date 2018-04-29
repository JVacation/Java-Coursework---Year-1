class Main
{
    public static void main (String args [])
    {
        System.out.print("#Enter Students name:");
        String studentname1 = BIO.getString();
        String end = "END";
    if (studentname1.equals(end)){
        System.out.println();
    }else{
    while (true){
        System.out.print("#Enter Students coursework mark:");
        int cmark = BIO.getInt();
        System.out.print("#Enter Students exam mark:");
        int emark = BIO.getInt();
        double omark = (cmark + emark);
        double totalmark = 200;
        float percentage = (float)((omark*100)/totalmark);
        if (percentage >= 40) {
            if (cmark >= 30){
                if (emark >= 30){
                    System.out.printf("%s [%d,%d] %6.1f Pass", studentname1, cmark, emark, percentage);
                }
            }
         }else{
             System.out.printf("%s [%d,%d] %6.1f Fail", studentname1, cmark, emark, percentage);
            }
         if (percentage >= 40){
               if (cmark < 30) {
               System.out.printf("%s [%d,%d] %6.1f Fail [Threshold]", studentname1, cmark, emark, percentage);
           }
           if ( emark < 30){
               System.out.printf("%s [%d,%d] %6.1f Fail [Threshold]", studentname1, cmark, emark, percentage);
            }
        } 
        System.out.println();
           System.out.print("#Enter Students name:");
           studentname1 = BIO.getString();
        if (studentname1.equals(end)){
             break;
        }
  }
 }
}
}

