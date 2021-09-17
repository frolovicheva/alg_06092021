package lesson3;

public class Main {
    public static void main(String[] args) {

        // Проверка метода Reverse
        System.out.println (reverseExpression ("Hello World!"));
        System.out.println (reverseExpression ("1 2 3 4 5"));

        // Проверка увеличения Capacity в Стеке
        MyStack <Integer> smallStack = new MyStack<> (1);

        System.out.println (smallStack);

        smallStack.push (1);
        smallStack.push (2);
        smallStack.push (3);
        smallStack.push (4);
        smallStack.push (5);


        System.out.println (smallStack);

    }


    public static String reverseExpression (String exp){
        MyStack<Character> stack = new MyStack<>(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            sb.append(stack.pop ());
        }
        return sb.toString();

    }
}
