import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {
        
    @BeforeAll
    static void beforeAll(){
        System.out.println("Запуск beforeAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("----Запуск beforeEach");
    }

    @Test
    void firstTest(){
        System.out.println("Запуск! Here is firstTest");
    }

    @Test
    void secondTest(){
        System.out.println("Запуск! Here is secondTest");
    }
}
