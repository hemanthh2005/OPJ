import java.util.*;

public class ac {
    private int acNum;
    private String name;
    private long pn;
    private float balmt;


    public void getinput(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the acc num: ");
        acNum=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name: ");
        name=sc.nextLine();

        System.out.println("Enter the phone num ;");
        pn=sc.nextLong();

        System.out.println("Enter the balance amount: ");
        balmt=sc.nextFloat();
    }
    public void deposit(float amt){
        if(amt>0){
            balmt+=amt;
            System.out.println("succesfully deposit"+ amt);
        } else{
            System.out.println("amount must be positive ");
        }
    }
    public void withdraw(float amt){
        if(amt>0){
            if(balmt>=amt){
                balmt-=amt;
                System.out.println("successfully withdraw"+amt);
                System.out.println("balamt: "+balmt);
            }else{
                System.out.println("amount must be positive");
            }
        }
    }
    public void accdetails(){
        System.out.println("acc details");
        System.out.println("acc num"+acNum);
        System.out.println("name"+name);
        System.out.println("phone num"+pn);
        System.out.println("balance amount"+balmt);
    }

    public static void main(String[] args) {
        ac a=new ac();
        a.getinput();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposite: ");
        float damt=sc.nextFloat();
        a.deposit(damt);

        System.out.println("Enter the amount to be withdraw:");
        float wamt=sc.nextFloat();
        a.withdraw(wamt);

        a.accdetails();
    }
}
