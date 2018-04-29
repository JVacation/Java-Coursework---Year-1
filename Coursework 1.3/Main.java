public class Main {
    public static void main(String args[]) {
        System.out.print("#Enter Student Name:");
        String studentName = BIO.getString();

        while (!studentName.equals("END")) {
            System.out.print (" #Enter Mark: ");
            int mark = BIO.getInt();
            int coursework = BIO.getInt();
            double overallMark  = ((double) coursework + (double) mark )/2;
            String status = "";
            if (mark> 30 & coursework >30 & overallMark >= 40){
                status = "Pass";
            }else if (mark>30 ^ coursework >30 & overallMark >= 40){
                status="Fail [Threshold]";
            }else{ 
                status = "Fail";
            }


            System.out.print( studentName + " [" + coursework + "," + mark + "] " + overallMark + " " + status );



            System.out.print(" #Enter studentName ");
            studentName = BIO.getString();
        }
    }
}