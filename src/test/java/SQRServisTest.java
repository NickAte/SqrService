import org.junit.jupiter.api.Test;
import ru.netology.javaqa.SQR.services.SQRService;

public class SQRServisTest {

    @Test
    public void testSqr() {

        SQRService service = new SQRService();
        int sqr = service.calcSqr(200, 300);
        System.out.println(sqr);
    }

    @Test
    public void testSqr2() {

        SQRService service = new SQRService();
        int sqr = service.calcSqr(300, 500);
        System.out.println(sqr);
    }

    @Test
    public void testSqr3() {

        SQRService service = new SQRService();
        int sqr = service.calcSqr(500, 1000);
        System.out.println(sqr);
    }
}


