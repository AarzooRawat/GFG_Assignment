import java.util.Scanner;

class Main extends SimpleInterest{
    @Override
    public void hello() {
        System.out.println("Take Bank Name: SBI, KOTAK,PNB, CANARA, YES ");
    }
    public static void main(String[] args) {
        Main obj= new Main();
        obj.hello();
        System.out.println("BankName, Amount, Time in Months");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter BankName:");
        String BankName=sc.nextLine();
        System.out.println("Enter Amount:");
        double p=sc.nextDouble();
        System.out.println("Enter Time:");
        double t= sc.nextDouble();
        t= t/12;
        double SI= obj.calInters(BankName, p, t);
        System.out.println("Interest Rate for your chosen Bank:" + SI);
        main(args);
        sc.close();

    }
}