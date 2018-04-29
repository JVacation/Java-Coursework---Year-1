class Main2 {
    public static void main (String args []) {
        int N;
        N = BIO.getInt();
        for (int i=1; i<N; i++){
        double d1, d2, d3;
        d1 = i/3;
        d2 = i/5;
        d3 = i/7;
        if(d1 == 1.0){
            System.out.print("Fizz");
        } else if (d2 == 1.0){
            System.out.print("Buzz");
        } else if (d3 == 1.0){
            System.out.print("Woof");
        } else {
            System.out.print(i);
        }
        System.out.println("");
        }
    }
}