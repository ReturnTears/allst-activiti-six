package allst.activiti.six;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SptingBoot项目的启动类
 * @author June
 */
@SpringBootApplication(exclude = {
		org.activiti.spring.boot.SecurityAutoConfiguration.class
})
public class AllstActivitiSixApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllstActivitiSixApplication.class, args);
	}

}
