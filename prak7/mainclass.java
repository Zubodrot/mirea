package ru.isbo1016.chumakov.prak7;



import java.util.Stack;

public class mainclass {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        String s1 = "94132";
        String s2 = "78506";
        int a1 = Integer.valueOf(s1);
        int a2 = Integer.valueOf(s2);
        for (int i = 0; i < 5; i++) {
            stack1.push(a1 % 10);
            a1 = a1 / 10;
            stack2.push(a2 % 10);
            a2 = a2 / 10;
        }
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println();
        System.out.println("Колода у 1-го: " + stack1);
        System.out.println("Колода у 2-го: " + stack2);
        System.out.println();
        Game(stack1, stack2);


    }

    public static void Game(Stack stack1, Stack stack2) {
        int count = 0;
        while ((count != 106) && (!stack1.empty()) && (!stack2.empty())) {
            if ((int) stack1.peek() > (int) stack2.peek()) {
                if (((int) stack2.peek() == 0) && (int) stack1.peek() == 9) {
                    Pushit(stack2,(int)stack1.pop());
                    Pushit(stack2,(int)stack2.pop());
                    System.out.println("Колода у 1-го: " + stack1);
                    System.out.println("Колода у 2-го: " + stack2);
                } else {
                    Pushit(stack1,(int)stack1.pop());
                    Pushit(stack1,(int)stack2.pop());
                    System.out.println("Колода у 1-го: " + stack1);
                    System.out.println("Колода у 2-го: " + stack2);
                }


            }
            else {
                if (((int) stack1.peek() == 0) && (int) stack2.peek() == 9) {
                    Pushit(stack1,(int)stack1.pop());
                    Pushit(stack1,(int)stack2.pop());
                    System.out.println("Колода у 1-го: " + stack1);
                    System.out.println("Колода у 2-го: " + stack2);
                } else {
                    Pushit(stack2,(int)stack1.pop());
                    Pushit(stack2,(int)stack2.pop());
                    System.out.println("Колода у 1-го: " + stack1);
                    System.out.println("Колода у 2-го: " + stack2);
                }
            }
            count++;
            System.out.println(count);
        }
        if (stack1.empty()){
            System.out.println("first " + count);
        }

        if (stack2.empty()){
            System.out.println("second " + count);
        }

        if ((!stack1.empty()) && (!stack2.empty())){
            System.out.println("botva");
        }


    }

    public static Stack Pushit(Stack stack, int karta){
        Stack<Integer> stack2 = new Stack<Integer>();
        while (!stack.empty()){
            stack2.push((int)stack.pop());
        }
        stack.push(karta);
        while (!stack2.empty()){
            stack.push((int)stack2.pop());
        }
        return stack;
    }
}
