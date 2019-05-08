package allst.activiti.six.controller;

import allst.activiti.six.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * Test类
 * @author June 2019-05-07 上午 12:20
 * @version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Autowired
    private DataSource dataSource;

    @RequestMapping("1")
    public String test() {
        System.out.println(dataSourceConfig);
        System.out.println(dataSource);
        return "{\"name\":\"JUNNCRIN\"}";
    }
}
