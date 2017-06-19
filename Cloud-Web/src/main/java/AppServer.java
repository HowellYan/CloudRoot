import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by HowellYang on 19/6/17 PM2:27.
 * E-Mail:th15817161961@gmail.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppServer {
    public static void main(String[] args) {
        SpringApplication.run(AppServer.class, args);
    }
}
