import java.util.Scanner;
public class costCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price;

        String line;

        double shippingCharge=0;

        while(true){

            try{

                System.out.print("Enter price of an item : ");

                line = sc.nextLine();

                price = Double.parseDouble(line);

                if(price>=100){

                    shippingCharge = 0;

                }else{

                    shippingCharge = price*2/100;

                }

                System.out.println("Your shipping charge is : "+shippingCharge);

                System.out.println("Your total cost is : "+(price+shippingCharge));

                break;

            }catch(Exception e){

                System.out.println("Please enter valid price value!!!");

            }

        }

        sc.close();

    }
}
