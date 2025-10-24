package ma.emsi.samih.appfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppFeignClientApplication.class, args);
    }

}
