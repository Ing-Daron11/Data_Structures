import dataStructures.Person;
import dataStructures.Queue;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

    private Queue<Integer> queue;
    private  Queue<String> queue2;
    private Queue<Person> queue3;

    @BeforeEach
    void init(){
        queue =new Queue<>();
        queue2 = new Queue<>();
        queue3 = new Queue<>();
    }

    /**
     * Objective: Enter a value of type Integer, and we expected that the method enquue it succesfully
     */
    @Test
    void enqueueTest1() {
        //A (Se crea el escenario)
        int num = 5;
        //Actuar (Aquí se llama al método a probar)
        queue.enqueue(num);
        int numExpected = queue.front();
        //Assert (Se evalúa)
        Assert.assertEquals( numExpected, num);
    }

    /**
     * Objective: Valite that we enter not only but any type of object as String
     *  and after that the queue can't be empty
     */
    @Test
    void enqueueTest2() {
        //A (Se crea el escenario)
        String sr1 = "Daron";
        String sr2 = "Juan José";
        String sr3 = "Alexis";
        //Actuar (Aquí se llama al método a probar)
        queue2.enqueue(sr1);
        queue2.enqueue(sr2);
        queue2.enqueue(sr3);
        String srExpected = queue2.front();
        //Assert (Se evalúa)
        Assert.assertEquals(srExpected, sr1);
        Assert.assertFalse(queue2.isEmpty());
    }

    /**
     * Objetive: Validate if the queue is empty, then 3 people enter,
     *  the firts one dequeue but enter again, now front is the second one.
     */
    @Test
    void enqueueTest3(){
        //(Se crea el escenario)
        Person person1 = new Person("Alberto", 35);
        Person person2 = new Person("Adriana", 34);
        Person person3 = new Person("Daron", 18);
        //Actuar
        queue3.enqueue(person1);
        queue3.enqueue(person2);
        queue3.enqueue(person3);
        //Assert
        Assert.assertFalse(queue3.isEmpty());
        Assert.assertEquals(person1, queue3.front());
        queue3.dequeue();
        Assert.assertEquals(person2, queue3.front());
    }

    /**
     * Objective: If the user try to dequeue a queue which is empty,
     * so a null is expected.
     */
    @Test
    void dequeueTest1() {
        //(se crea el escenario)
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        //Act
        queue.enqueue(num1);
        queue.enqueue(num2);
        queue.enqueue(num3);
        Assert.assertFalse(queue.isEmpty());
        //Assert
        while(!queue.isEmpty()){
            queue.dequeue();
        }
        Assert.assertTrue(queue.isEmpty());
        Assert.assertEquals(null, queue.dequeue());
    }

    /**
     * Objective: There's 3 people, the first and second are expected to be dequeued succesfully
     */
    @Test
    void dequeueTest2() {
        //(se crea el escenario)
        Person person1 = new Person("James", 31);
        Person person2 = new Person("Falcao", 38);
        Person person3 = new Person("El 'Pibe' Valderrama", 57);
        //Act
        queue3.enqueue(person1);
        queue3.enqueue(person2);
        queue3.enqueue(person3);
        //Assert
        Person persondequeued1 = queue3.dequeue();
        Person persondequeued2 = queue3.dequeue();
        Assert.assertFalse(queue3.isEmpty());
        Assert.assertEquals(person3, queue3.front());
        Assert.assertEquals(person1,persondequeued1);
        Assert.assertEquals(person2,persondequeued2);
    }

    /**
     * Objective: 3 String enter to the queue, then only 2 are dequeued,
     * so is expected that the first dequeued is diferrent from the String left in the Queue
     */
    @Test
    void dequeueTest3() {
        //(se crea el escenario)
        String name = "Bruno";
        String name2 = "Alfonso";
        String name3 = "Gerardo";
        //Act
        queue2.enqueue(name);
        queue2.enqueue(name2);
        queue2.enqueue(name3);
        //Assert
        String namedequeued1 = queue2.dequeue();
        String namedequeued2 = queue2.dequeue();
        Assert.assertNotEquals(namedequeued1, name3 );
    }

    @Test
    void front1() {
        //A (Se crea el escenario)
        int num = 5;
        int num2 = 7;
        //Actuar (Aquí se llama al método a probar)
        queue.enqueue(num);
        queue.enqueue(num2);
        int numExpected = queue.front();
        //Assert (Se evalúa)
        Assert.assertEquals( numExpected, num);
    }


    @Test
    void front2() {
        //A (Se crea el escenario)
        String name1 = "Daron";
        String name2 = "Camilo";
        String name3 = "Yo";
        //Actuar (Aquí se llama al método a probar)
        queue2.enqueue(name1);
        queue2.enqueue(name2);
        queue2.enqueue(name3);
        queue2.dequeue();
        String nameExpected = queue2.dequeue();
        //Assert (Se evalúa)
        Assert.assertNotEquals( nameExpected, queue2.front());
        Assert.assertEquals(nameExpected, name2);

    }

    @Test
    void front3() {
        //A (Se crea el escenario)
        Person person1 = new Person("Joseph", 19);
        Person person2 = new Person("Jeison", 24);
        //Actuar (Aquí se llama al método a probar)
        queue3.enqueue(person1);
        queue3.enqueue(person2);
        Person personExpected = queue3.dequeue();
        //Assert (Se evalúa)
        Assert.assertEquals( personExpected, person1);
        Assert.assertNotEquals(personExpected, queue3.front()); //La persona que salió es diferente a la que está
    }

    //Verificamos que la cola efectivamente no esté vacía
    @Test
    void isEmptyTest1() {
        //A (Se crea el escenario)
        int num = 5;
        //Actuar (Aquí se llama al método a probar)
        queue.enqueue(num);
        //Assert (Se evalúa)
        Assert.assertFalse(queue.isEmpty());
    }

    //Una vez encolado, lo desencolamos y debería estar vacío
    @Test
    void isEmptyTest2() {
        //A (Se crea el escenario)
        Person person1 = new Person("Rodriguez", 70);
        //Actuar (Aquí se llama al método a probar)
        queue3.enqueue(person1);
        Assert.assertFalse(queue3.isEmpty());
        //Assert (Se evalúa)
        queue3.dequeue();
        Assert.assertTrue(queue3.isEmpty());
    }

    @Test
    void isEmptyTest3() {
        //A (Se crea el escenario)
        String name1 = "Jhon";
        String name2 = "Javier";
        String name3 = "Alexandro";
        String name4 = "Sofía";
        String name5 = "Ximena";
        String name6 = "Gloria";
        //Actuar (Aquí se llama al método a probar)
        queue2.enqueue(name1);
        queue2.enqueue(name2);
        queue2.enqueue(name3);
        queue2.enqueue(name4);
        queue2.enqueue(name5);
        queue2.enqueue(name6);
        String nameExpected = queue2.dequeue();
        //Assert (Se evalúa)
       Assert.assertFalse(queue2.isEmpty());
       while (!queue2.isEmpty()){
           queue2.dequeue();
       }
       Assert.assertTrue(queue2.isEmpty());
    }


}