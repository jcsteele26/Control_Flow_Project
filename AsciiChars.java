import org.graalvm.compiler.nodes.java.LoweredAtomicReadAndWriteNode;

public class AsciiChars {

    public static void printNumbers()
    {
        int[] number = {0,1,2,3,4,5,6,7,8,9};
        for(int item : number){
            System.out.print(item + " ");
        }
        System.out.println(" "); 
    }

    public static void printLowerCase()
    {
        char[] lower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char item : lower){
            System.out.print(item + " ");
        }
        System.out.println(" ");
    }

    public static void printUpperCase()
    {
        char[] upper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(char item : upper){
            System.out.print(item + " ");
        }
        System.out.println(" ");    
    }

    
}