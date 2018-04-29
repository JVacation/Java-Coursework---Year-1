class Main
{
    public static void main (String args [])
    {
        int firstmark = 70;
        int twoonemark = 60;
        int twotwomark = 50;
        int thirdmark = 40;
        int failmark = 0;
        System.out.print("#Enter Students name:");
        String studentname1 = BIO.getString();
        String end = "END";
    if (studentname1.equals(end)){
        System.out.println();
    }else{
    while (true){
        System.out.print("#Enter Students module mark:");
          int mark1 = BIO.getInt(); 
          if (mark1 >= firstmark) {
              System.out.printf("%s [%d] gains a 1st", studentname1, mark1);
            }
            else {
            if (mark1 >= twoonemark) {
                  System.out.printf("%s [%d] gains a 2.1", studentname1, mark1);
                }
                else{
                    if (mark1 >= twotwomark){
                        System.out.printf("%s [%d] gains a 2.2", studentname1, mark1);
                    }
                    else {
                        if (mark1 >= thirdmark) {
                            System.out.printf("%s [%d] gains a 3rd", studentname1, mark1);
                    }
                    else{
                        System.out.printf("%s [%d] fails", studentname1, mark1);
                    }
                }
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

