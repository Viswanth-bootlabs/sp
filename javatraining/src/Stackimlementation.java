import java.util.Stack;

public  class Stackimlementation implements Stackinterface{

    public void isemptyStack(Stack stack){
        System.out.println("The stack"+stack.empty());
    }

    @Override
    public void sizeStack(Stack stack) {
        System.out.println("The size of stack"+stack.size());
    }

    @Override
    public void addStack(Stack stack, int a) {
        stack.add(a);
        System.out.println("hi");
    }

    @Override
    public void popStack(Stack stack) {
        stack.pop();

    }
}
