package java8_3.chap11.stack_queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx1_1 {

    static Stack stack = new Stack();
    static Stack goForward = new Stack();


    public static void main(String[] args) {

        try {
            goURL("1. 다음");
            goURL("2. 네이버");
            goURL("3. 구글");

            goBack();
            goBack();
            goBack();

            goForwardPage();
        } catch (EmptyStackException e) {
            goForwardPage();

            System.out.println(e.getMessage());
        }

    }

    private static void goForwardPage() {
        if (!goForward.empty()) {
            stack.push(goForward.pop());
        }
        System.out.println();
        System.out.println("goForwardPage()");
        System.out.println("stack = " + stack);
        System.out.println("goForward = " + goForward);

    }

    private static void goBack() throws EmptyStackException {
        if(stack.empty()) {
            throw new IllegalArgumentException("더이상 뒤로 갈 수 없습니다.");

        }

        goForward.push(stack.pop());
        System.out.println("goBack()");
        System.out.println("stack = " + stack);
        System.out.println("goForward = " + goForward);
    }

    private static void goURL(String url) {
        stack.push(url);
        if (goForward.isEmpty()) {
            goForward.clear();
        }
        System.out.println("stack = " + stack);
        System.out.println("goForward = " + goForward);
    }
}
