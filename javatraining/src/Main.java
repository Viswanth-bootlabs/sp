import java.util.*;
public class Main {
    public static void main(String args[]){
        Stackimlementation stackimlementation = new Stackimlementation();
        Stack<Integer>stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number/n1->push/n2->pop/n3->size/nisempty/n");
        int a = scanner.nextInt();
        do {
            switch (a) {
                case 1:
                    System.out.println("Enter the number to be add");
                    int input = scanner.nextInt();
                    stackimlementation.addStack(stack, input);
                    System.out.println(stack);
                    break;
                case 2:
                    stackimlementation.popStack(stack);
                    System.out.println(stack);
                    break;
                case 3:
                    stackimlementation.sizeStack(stack);
                    break;
                case 4:
                    stackimlementation.isemptyStack(stack);
                    break;
                default:
                    System.out.println("enter 1 to 4");
                    break;
            }
            System.out.println("Enter the number/n1->push/n2->pop/n3->size/nisempty/n");
            a = scanner.nextInt();
        }while(a>0 && a<=4);
    }
}

