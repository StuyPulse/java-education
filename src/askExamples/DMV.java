package askExamples;

import ask.Ask;

public class DMV {
    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        String name = Ask.forString();
        System.out.println("Hello, " + name);
        System.out.println("How old are you?");
        int age = Ask.forInt();

        if (age < 16) {
            System.out.println("Sorry, you're not old enough to drive.");
        } else if (age < 18) {
            System.out.println("You can't drive alone, but you can get a learner's permit!");
        } else {
            System.out.println("Do what you want.");
        }
    }
}
