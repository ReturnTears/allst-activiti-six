package allst.activiti.six;

import allst.activiti.six.config.DataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AllstActivitiSixApplicationTests {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Autowired
    private DataSource dataSource;

	@Test
	public void contextLoads() {
        System.out.println(dataSourceConfig);
        System.out.println(dataSource);
        System.out.println( String.format("{\"name\":\"JUNNCRIN\"}"));
	}

}
