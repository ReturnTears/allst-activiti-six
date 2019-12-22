package allst.activiti.six.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

/**
 * 测试activiti生成25张表
 * @author YiYa
 * @since 2019-12-22 下午 06:40
 */
public class ActivitiTest {

    @Test
    public void test1() {
        // 创建ProcessEngineConfiguration对象
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        // 创建ProcessEngine对象
        ProcessEngine processEngine = configuration.buildProcessEngine();
        // 输出对象
        System.out.println(processEngine);
    }

}
