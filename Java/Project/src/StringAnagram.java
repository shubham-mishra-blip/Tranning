import java.util.*;


public class StringAnagram {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String choice;

        do
            {


        System.out.println("1. Convert String into Anagrams.");
        System.out.println("2. Check Weather given String is Anagram or not.");
        System.out.println("3. Exit.");
        System.out.printf("Enter your Choice:  ");
        int choic = scan.nextInt();


        switch (choic) {
            case 1:
                ConvertAnagram();
                break;
            case 2:
                CheckAnagram();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Error");
                break;
        }
                System.out.println("Do you want to continue(y for YES and n for NO)");
        choice = scan.next();
                System.out.println("\n\n\n\n\n");
    }while (choice.equals("y")|| choice.equals("Y"));
    }

    static void CheckAnagram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String");;
        String m2 = sc.nextLine();
        System.out.println("Enter Any String");;
        String m3 = sc.nextLine();
        char[] word1 = m2.toLowerCase().toCharArray();
        char[] word2 = m3.toLowerCase().toCharArray();

        boolean b1 = true;
        if (word1.length != word2.length){
            b1 = false;
        }
        else{
            Arrays.sort(word1);
            Arrays.sort(word2);
            b1 = Arrays.equals(word1,word2);
        }
        if (b1){
            System.out.println(m2+" and "+m3+" is Anagram String");
        }
        else{
            System.out.println(m2+" and "+m3+" is not Anagram String");
        }
        return;
    }

    static void ConvertAnagram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String");;
        StringBuffer m1 = new StringBuffer();
        m1.append(sc.nextLine());
        StringBuffer sn = m1.reverse();
        System.out.println(sn);


    }
}
