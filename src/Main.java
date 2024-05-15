import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String orWord ="Primo";
        String reversed = ReversedWord (orWord);
        System.out.println("Original word: "+ orWord);
        System.out.println("Reversed word; "+ reversed);

    }

    public static String ReversedWord(String word){ //void does not return with out void returns
        Stack <Character> StackOfChar = new Stack <>();
        for(int i =0;i<word.length();i++ ){
            StackOfChar.push(word.charAt(i));

        }
        String reversed ="";
        while (!StackOfChar.isEmpty()){
            reversed +=StackOfChar.pop();
        }
        return reversed;
    }

}