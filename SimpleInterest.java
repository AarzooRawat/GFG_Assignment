public abstract class SimpleInterest {
    public abstract void hello();
    public double calInters(String BankName, double p, double t)
    {
        double r= getInters(BankName);
       double result= (p*r*t)/100;
       return result;
    }
    public double getInters(String bnk){
        switch(bnk.toUpperCase()) {
            case "SBI": return 7.5;
            case "CANARA": return 5.5;
            case "YES": return 2.4;
            case "KOTAK": return 6.0;
            case "PNB": return 3.3;
            default: return 1.0;
 
        }
    }
 
 }