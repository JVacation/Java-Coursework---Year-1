class Main
{
    public static void main (String args [])
    {
        int passingMarks = 40;
        System.out.print("#Enter Students name:");
        String studentname1 = BIO.getString();
  
        
       // String END;
        //String terminate = END;
     
        
       
        if (studentname1.equals("END"))
        {
            System.out.println();
        }
        else {      
      {
          System.out.print("#Enter Students module mark:");
          int mark1 = BIO.getInt(); 
          
          System.out.print("#Enter Students name:");
          String studentname2 = BIO.getString();
          
          System.out.print("#Enter Students module mark:");
          int mark2 = BIO.getInt();
          
          System.out.print("#Enter Students name:");
          String studentname3 = BIO.getString();
          
          System.out.print("#Enter Students module mark:");
          int mark3 = BIO.getInt();
          
          System.out.print("#Enter Students name:");
          String studentname4 = BIO.getString();
          
          System.out.print("#Enter Students module mark:");
          int mark4 = BIO.getInt();
          
          if (mark1 >= passingMarks) {
              System.out.printf("%s Pass", studentname1);
              System.out.println();
            }
            else {
              System.out.printf("%s Fail", studentname1);
              System.out.println();
            }  
          if (mark2 >= passingMarks) {
              System.out.printf("%s Pass", studentname2);
              System.out.println();
            }
            else {
              System.out.printf("%s Fail", studentname2);
              System.out.println();
            }  
          if (mark3 >= passingMarks) {
              System.out.printf("%s Pass", studentname3);
              System.out.println();
            }
            else {
              System.out.printf("%s Fail", studentname3);
              System.out.println();
            }
          if (mark4 >= passingMarks) {
              System.out.printf("%s Pass", studentname4);
              System.out.println();
            }
            else {
              System.out.printf("%s Fail", studentname4);
              System.out.println();
            }    
          System.out.println();
          System.out.print("#Enter Students name:");
          studentname1 = BIO.getString();
          
      }
    }
}
}