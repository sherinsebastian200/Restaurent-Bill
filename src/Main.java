import java.util.ArrayList;
import java.util.Scanner;

class customer {
    int tea=10;
    int coffee=15;
    int snacks=10;
    int idli=8;
    int dosa=6;
    String name;
    long phoneno;
    int total;
    public customer()
    {

    }

    public customer(String name, long phoneno) {
        this.name = name;
        phoneno = phoneno;
    }

    public void tea(int count) {
        this.tea = this.tea * count;
        System.out.println("total"+this.tea);





    }

    int coffee(int count) {
        this.coffee = this.coffee * count;
        return this.coffee;
    }

    int snacks(int count) {
        this.snacks = this.snacks * count;
        return this.snacks;
    }
    int idli(int count) {
        this.idli = this.idli * count;
        return this.idli;
    }
    int dosa(int count){
        this.dosa = this.dosa*count;
        return this.dosa;

    }
    public int getTea() {
        return tea;

    }

    public int getCoffee() {
        return coffee;
    }

    public int getSnacks() {
        return snacks;
    }

    public int getIdli() {
        return idli;
    }

    public int getDosa() {
        return dosa;
    }
}





public class Main {
    public static void main(String[] args) {
        ArrayList<customer> arr = new ArrayList<customer>();
        while (true) {
            System.out.println("SELECT ITEM \n 1 - Tea \n 2 - coffee \n 3 - snacks \n 14 - idli \n 5 - dosa \n 6- Generate bill \n 7-view trasactions\n 8-Exit");
            Scanner sc = new Scanner(System.in);
            customer c = new customer();

            int n = sc.nextInt();
            switch (n) {

                case 1:
                    //System.out.println("Enter the quantities");
                    System.out.println("enter the count");
                    int q=sc.nextInt();
                    System.out.println("enter name");
                    String name=sc.next();
                    System.out.println("enter phone number");
                    long number=sc.nextLong();
                    c.tea(q);
                    break;
                case 2:
                    System.out.println("enter the count");
                    int a =sc.nextInt();
                    System.out.println("enter name");
                    String name1=sc.next();
                    System.out.println("enter phone number");
                    long number1=sc.nextLong();
                    c.tea(a);
                    break;







            }
        }
    }
}
