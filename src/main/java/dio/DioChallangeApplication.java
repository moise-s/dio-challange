package dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;

@EnableFeignClients
@SpringBootApplication
public class DioChallangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioChallangeApplication.class, args);
	}

	// @GetMapping("/")
	// public String index() {
	// return "Hello World";
	// }

}
