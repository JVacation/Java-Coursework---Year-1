class Main
{
    public static void main (String args [])
    {
        int passingMarks = 40;
        System.out.print("#Enter Students name:");
        String studentname1 = BIO.getString();
        String end = "END";
    if (studentname1.equals(end)){
        System.out.println();
    }else{
    while (true){
        System.out.print("#Enter Students module mark:");
          int mark1 = BIO.getInt(); 
          if (mark1 >= passingMarks) {
              System.out.printf("%s Pass", studentname1);
            }
            else {
              System.out.printf("%s Fail", studentname1);
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
