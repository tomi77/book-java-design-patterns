package demo;

public class Context {
    public String input;

    public Context(String input) {
        this.input = input;
    }

    public void getBinaryForm(String input) {
        int i = Integer.parseInt(input);
        // integer to its equivalent binary string representation
        String binaryString = Integer.toBinaryString(i);
        System.out.println("Binary equivalent of " + input + " is " + binaryString);
    }

    public void prinitInWords(String input) {
        this.input = input;
        System.out.println("Printing the inputs in words:");

        char c[] = input.toCharArray();
        for (char aC : c) {
            switch (aC) {
                case '1':
                    System.out.println("One ");
                    break;
                case '2':
                    System.out.println("Two ");
                    break;
                case '3':
                    System.out.println("Three ");
                    break;
                case '4':
                    System.out.println("Four ");
                    break;
                case '5':
                    System.out.println("Five ");
                    break;
                case '6':
                    System.out.println("Six ");
                    break;
                case '7':
                    System.out.println("Seven ");
                    break;
                case '8':
                    System.out.println("Eight ");
                    break;
                case '9':
                    System.out.println("Nine ");
                    break;
                case '0':
                    System.out.println("Zero ");
                    break;
                default:
                    System.out.println("* ");
                    break;
            }
        }
    }
}
