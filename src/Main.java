import java.util.ArrayList;
import java.util.Scanner;

class customer {
    int tea;
    int coffee;
    int snacks;
    int idli;
    int dosa;
    String name;
    long phoneno;

    public customer(String name, long phoneno) {
        this.name = name;
        phoneno = phoneno;
    }

    int tea(int count) {
        this.tea = this.tea * count;
        return this.tea;


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





}
public class Main {
    public static void main(String[] args) {
        ArrayList<customer> arr = new ArrayList<customer>();
        while (true) {
            System.out.println("SELECT ITEM \n 1 - Tea \n 2 - coffee \n 3 - snacks \n 14 - idli \n 5 - dosa \n 6- Generate bill \n 7-view trasactions\n 8-Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            switch (n) {

            }
        }
    }
}
