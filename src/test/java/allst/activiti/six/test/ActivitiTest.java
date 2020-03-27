package allst.activiti.six.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
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
        // 第二个参数对应xml文件中bean的id
       // ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml", "processEngineConfiguration");
        // 创建ProcessEngine对象
        ProcessEngine processEngine = configuration.buildProcessEngine();
        // 输出对象
        System.out.println(processEngine);
    }

    /**
     * 创建ProcessEngine的方式2
     * 要求:
     *  1、activiti的配置文件名称必须为:activiti.cfg.xml
     *  2、id为processEngineConfiguration的bean的名称只能为这个
     */
    @Test
    public void test2() {
        // 该方式也可以生成对应的表
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(processEngine);
    }

}
