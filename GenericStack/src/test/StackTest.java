package test;
import model.Robots;
import model.Stack;
import model.Cat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> stack1;
    private Stack<String> stack2;
    private Stack<Cat> stack3;
    private Stack<Character> stack4;

    private Stack<Robots> stack5;

    @BeforeEach
    void init(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        stack3 = new Stack<>();
        stack4 = new Stack<>();
        stack5 = new Stack<>();
    }

    @Test
    void isEmptyTest1() {
        int num1 = 10;
        int num2 = 20;
        stack1.push(num1);
        stack1.push(num2);
        assertFalse(stack1.isEmpty());//Should be false
    }
    @Test
    void isEmptyTest2() {
        int num1 = 10;
        int num2 = 20;
        stack1.push(num1);
        stack1.push(num2);
        stack1.pop();
        assertFalse(stack1.isEmpty());//Should be false
        stack1.pop();
        assertTrue(stack1.isEmpty()); //Should be True
    }
    @Test
    void isEmptyTest3() {
        Cat cat1 = new Cat("Michi1", "Persian");
        Cat cat2 = new Cat("Michi2", "Persian");
        Cat cat3 = new Cat("Michi3", "Persian");

        stack3.push(cat1);
        stack3.push(cat2);
        stack3.push(cat3);
        assertFalse(stack3.isEmpty());

        while(!stack3.isEmpty()){
            stack3.pop();
        }
        assertTrue(stack3.isEmpty());
    }

    @Test
    void topTest1() {
        int num = 5;
        int num2 = 7;

        stack1.push(num);
        stack1.push(num2);
        int numExpected = stack1.top();

        assertNotEquals( numExpected, num);
    }
    @Test
    void topTest2() { //Peek
        //Creo Escenario
        char element1 = 'a';
        char element2 = 'b';
        char element3 = 'c';
        char element4 = 'd';
        char element5 = 'e';
        char element6 = 'f';
        //act
        stack4.push(element1);
        stack4.push(element2);
        stack4.push(element3);
        stack4.push(element4);
        stack4.push(element5);
        stack4.push(element6);
        //Assert
        assertEquals(element6, stack4.top());
        for (int i = 0; i < 4; i++) {
            stack4.pop();
        }
        assertNotEquals(stack4.top(), element1);
        assertEquals(stack4.top(), element2);

    }
    @Test
    void topTest3() {
        //Inicializar escenario
        Robots bot1 = new Robots('a', 7);
        Robots bot2 = new Robots('b', 10);
        Robots bot3 = new Robots('c', 2);
        //Act
        assertEquals(null, stack5.top());
        stack5.push(bot1);
        stack5.push(bot2);
        stack5.push(bot3);
        assertFalse(stack5.isEmpty());
        assertEquals(bot3, stack5.top());
    }

    @Test
    void pushTest1() {
        //Inicializar escenario
        String car1 = "Mercedes benz";
        String car2 = "BMW X6";
        //act
        assertNotEquals(car1, stack2.top());
        stack2.push(car1);
        //Assert
        assertEquals(car1, stack2.top());

    }
    @Test
    void pushTest2() {
        Cat cat1 = new Cat("Oasis", "criollo");
        Cat cat2 = new Cat("ducho", "persian");
        Cat cat3 = new Cat("Brincolín", "no c");
        Cat cat4 = new Cat("Rabiolo", "greece");

        stack3.push(cat1);
        stack3.push(cat2);
        stack3.push(cat3);
        stack3.push(cat4);

        assertFalse(stack3.isEmpty());
        assertEquals(cat4, stack3.top());
        stack3.pop();
        assertEquals(cat3, stack3.top());
    }
    @Test
    void pushTest3() {
        Robots bot1 = new Robots('d', 15);
        Robots bot2 = new Robots('e', 8);
        Robots bot3 = new Robots('f', 20);
        stack5.push(bot1);
        assertFalse(stack5.isEmpty());
        stack5.push(bot2);
        stack5.push(bot3);
        assertNotEquals(bot1, stack5.top());
    }

    @Test
    void popTest1() {
        //(se crea el escenario)
        int num1 = 01;
        int num2 = 0101;
        int num3 = 1001;
        //Act
        stack1.push(num1);
        stack1.push(num2);
        stack1.push(num3);
        stack1.push(num1);
        //Assert
        while(!stack1.isEmpty()){
           stack1.pop();
        }
        assertTrue(stack1.isEmpty());
    }

    @Test
    void popTest2() {
        char c1 = 'm';
        char c2 = 'i';
        char c3 = 'y';

        stack4.push(c1);
        stack4.push(c2);
        stack4.push(c3);

        assertEquals(c3, stack4.pop());
        assertEquals(c2, stack4.pop());
        assertEquals(c1, stack4.pop());
        assertEquals(null, stack4.top());


    }
    @Test
    void popTest3() {
        String str1 = "Canon";
        String str2 = "Sony";
        String str3 = "Japon";
        int num = 12;

        stack2.push(str1);
        stack2.push(str2);
        stack2.push(str3);
        stack1.push(num);

        assertNotEquals(stack2.pop(), stack1.pop());
        assertEquals(str2, stack2.pop());

    }
}