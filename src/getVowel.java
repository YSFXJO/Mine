import java.util.Scanner;

public class getVowel {
                                        // program counts how many vowel letter in a sentence
    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        String userIN = scanner.nextLine().toLowerCase();
        while(userIN.isEmpty()){
            System.out.println("Please Enter at least one letter ");
            userIN = scanner.nextLine();
        }
        return userIN;

    }
    public static int CountVowels(String userIn) {
        int count = 0;
        for (int i = 0; i <userIn.length(); i++) {
            char current = userIn.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                count++;
            }

        } return count;

    }
    public static void main(String []args){
        String sentence = getUserInput();
        int count = CountVowels(sentence);
        System.out.println("Your word has "+count +" vowels in the "+sentence+" you entered");
    }

}
