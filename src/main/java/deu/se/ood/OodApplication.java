package deu.se.ood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class OodApplication {

	public static void main(String[] args) {
		SpringApplication.run(OodApplication.class, args);
	}

}
