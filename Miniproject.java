import java.util.Scanner;
class Cab{
    int fare;
    int cd;
    int  d;

    public Cab(){
        fare = 50;

    }

    public Cab(int fare){
       this.fare = fare;
    }

    public Cab(Cab ob) {
        fare = ob.fare;
    }

}

class Ridecab {

    public static void main(String[] args) {
        Cab ob = new Cab();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance of cab from user: ");
        ob.cd =sc.nextInt();
        if(ob.cd > 5){
            Cab ob = new cab(50 + 10 * (cd - 5));
        }
        else{
            Cab ob = new Cab();
            System.out.println("Enter the distance travelled: ")
            ob.d = sc.nextInt();
            ob.fare += 10 * ob.d;
            System.out.println("Total fare: Rs " +ob.fare);

            Cab ob1 = new Cab(ob);
        }

       
       
    }
}
