package date_t;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sql_Timestamp_Test {
    @Test
    public void test(String[] args) throws InterruptedException {
        while(true){
            System.out.println(new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
        }
    }
}
