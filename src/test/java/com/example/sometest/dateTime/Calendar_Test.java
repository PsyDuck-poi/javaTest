package date_t;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Test {
    @Test
    public void test(String[] args) {
        Date d=new Date();
        Calendar c=Calendar.getInstance();
        SimpleDateFormat ft=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        c.set(2022,03,21,16,03,22);
        System.out.println(c);
        System.out.println(d.toString());

    }
}
