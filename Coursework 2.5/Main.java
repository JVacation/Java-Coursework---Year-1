class Main
{
    public static void main (String args [])
    {
        System.out.print("#Enter the amount of money:");
        int amountentry = BIO.getInt();
        double tmp;
        int coincount;
        boolean alreadyExecuted = false;
   while(amountentry > -1000){       
        double amount = amountentry;
        int amountInt = (int) (amount * 100);
        coincount = 0;
        String twohunresult = "";
        String onehunresult = "";
        String fiftyresult = "";
        String twentyresult = "";
        String tenresult = "";
        String fiveresult = "";
        String tworesult = "";
        String oneresult = "";
        if(amount >= 200)
        {
            tmp = (int) amount/200;
            if (tmp > 1.0){
            twohunresult = (int)tmp + "*200p ";
            coincount = coincount + (int)tmp;
        }else{
            twohunresult = "200p ";
            coincount = coincount + 1;
        }
        amount = amount % 200;
    }
        if(amount >= 100)
        {
            tmp = (int) amount/100;
            if (tmp > 1.0){
            onehunresult = (int)tmp + "*100p ";
            coincount = coincount + (int)tmp;
        }else{
            onehunresult = "100p ";
            coincount = coincount + 1;
        }
        amount = amount % 100;
    }    
    if(amount >= 50)
        {
            tmp = (int) amount/50;
            if (tmp > 1.0){
            fiftyresult = (int)tmp + "*50p ";
            coincount = coincount + (int)tmp;
        }else{
            fiftyresult = "50p ";
            coincount = coincount + 1;
        }
        amount = amount % 50;
    }      
    if(amount >= 20)
        {
            tmp = (int) amount/20;
            if (tmp > 1.0){
            twentyresult = (int)tmp + "*20p ";
            coincount = coincount + (int)tmp;
        }else{
            twentyresult = "20p ";
            coincount = coincount + 1;
        }
        amount = amount % 20;
    }
    if(amount >= 10)
        {
            tmp = (int) amount/10;
            if (tmp > 1.0){
            tenresult = (int)tmp + "*10p ";
            coincount = coincount + (int)tmp;
        }else{
            tenresult = "10p ";
            coincount = coincount + 1;
        }
        amount = amount % 10;
    }
    if(amount >= 5)
        {
            tmp = (int) amount/5;
            if (tmp > 1.0){
            fiveresult = (int)tmp + "*5p ";
            coincount = coincount + (int)tmp;
        }else{
            fiveresult = "5p ";
            coincount = coincount + 1;
        }
        amount = amount % 5;
    }
    if(amount >= 2)
        {
            tmp = (int) amount/2;
            if (tmp > 1.0){
            tworesult = (int)tmp + "*2p ";
            coincount = coincount + (int)tmp;
        }else{
            tworesult = "2p ";
            coincount = coincount + 1;
        }
        amount = amount % 2;
    }
    if(amount >= 1)
        {
            tmp = (int) amount/1;
            if (tmp > 1.0){
            oneresult = (int)tmp + "*1p ";
            coincount = coincount + (int)tmp;
        }else{
            oneresult = "1p ";
            coincount = coincount + 1;
        }
        amount = amount % 1;
    }
    String resultout = twohunresult + onehunresult + fiftyresult + twentyresult + tenresult + fiveresult + tworesult + oneresult;
    if(!alreadyExecuted) {    
       System.out.println("Amount Coins");
       alreadyExecuted = true;
    }
    if(amountentry > 500){
       System.out.printf("Invalid amount %dp", amountentry );
    }else if(amountentry <=-1){
       System.out.printf("Invalid amount %dp", amountentry );
    }else if (coincount >1){
       System.out.printf("%dp %d coins %s", amountentry, coincount, resultout );
    }else if(coincount ==1){
     System.out.printf("%dp %d coin %s", amountentry, coincount, resultout );
    }else if(amountentry ==0){
        break;
    }
    System.out.println();
    System.out.print("#Enter the amount of money:");
    amountentry = BIO.getInt();
   }
 }
}