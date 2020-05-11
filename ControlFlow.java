import java.util.*;
public class ControlFlow {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        // Get random numbers
        Random rand = new Random();
        int upper = 50;
        int randomOne = rand.nextInt(upper);
        int randomTwo = rand.nextInt(upper);
        int randomThree = rand.nextInt(upper);

        // Call print functions
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        // Start the survey
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name + " !");
        System.out.println("Would you like to continue the survey? Q to Quit ");
        String response = input.next(); 
        if ((response != "Q") || (response != "q")){ 
            System.out.println("Enter the name of your favorite pet: ");
            String petName = input.next();
            System.out.println("What is the age of your favorite pet? ");
            int petAge = input.nextInt();
            System.out.println("Enter your lucky number: ");
            int luckyNumber = input.nextInt();
            System.out.println("What is the jersey number of your favorite quarterback? ");
            int qbNumber = input.nextInt();
            System.out.println("Enter the two digit model year of your vehicle? ");
            int year = input.nextInt();
            System.out.println("What is the first name of your favorite actor/actress? ");
            String actorName = input.next();
            System.out.println("");

            // Set the lottery numbers
            int lotteryOne = qbNumber + petAge + luckyNumber;
            if(lotteryOne > 65){
                do{
                lotteryOne = lotteryOne - 40;
                } while(lotteryOne > 65);
            }

            int lotteryTwo = year + luckyNumber;
            if(lotteryTwo > 65){
                do{
                lotteryTwo = lotteryTwo - 40;
                } while(lotteryTwo > 65);
            }

            int lotteryThree = randomThree - randomTwo;
            if(lotteryThree > 65){
                lotteryThree = lotteryThree - 40;
            }
            int lotteryFour = 42;

            int lotteryFive = petAge + year;
            if(lotteryFive > 65){
                do{
                lotteryFive = lotteryFive - 40;
                } while(lotteryFive > 65);
            }

            System.out.print("Lottery numbers: " + lotteryOne +", "+ lotteryTwo + ", " + lotteryThree + ", " + lotteryFour + ", " + lotteryFive);
            System.out.println("");

            // Get the magic ball number
            int magic = luckyNumber * randomOne;
            if(magic > 75){
                do{
                    magic = magic -75;
                } while(magic > 75);
            } 
            System.out.println("Magic Ball: " + magic);
        
        } else {
            System.out.println("Please return later to continue the survey.");
        }
    
        input.close();
    }    
    

}