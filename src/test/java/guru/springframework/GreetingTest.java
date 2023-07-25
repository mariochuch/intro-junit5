package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
     Greeting greeting;

     @BeforeAll
     public static void beforeClass(){
         System.out.println("Before - I am only called Once!!!");
     }

    @BeforeEach
    void setUp(){
        System.out.println("In Before Each ...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Mariusz"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach ......");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After - I am only called Once!!!");
    }
}