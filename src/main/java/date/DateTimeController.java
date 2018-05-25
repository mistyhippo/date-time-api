package date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

@RestController
public class DateTimeController {

    @RequestMapping(value = {"/now"}, method = RequestMethod.GET)
    public String getDateTime(){

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
//
//        return dtf.format(now);

        String time = "2050/03/22 34:21:16";

        return time;
    }


}
