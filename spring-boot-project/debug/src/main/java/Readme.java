import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

public class Readme {

    /**
     * 自动装配
     *
     * EnableAutoConfiguration：启动 Spring 应用程序上下文时进行自动配置，它会猜测并配置项目可能需要的 Bean
     * 当不需要数据库自动配置时：@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
     * <br>
     *
     * <ol>
     *     <li> {@link EnableAutoConfiguration}:Spring 应用程序上下文时进行自动配置，它会猜测并配置项目可能需要的 Bean 当不需要数据库自动配置时 </li>
     *     <li> {@link AutoConfigurationImportSelector} </li>
     *     <li> DeferredImportSelector 和 ImportSelector 的区别：前者会在所有的@Configuration 类加载完成之后再加载返回的配置类，而 ImportSelector 是在加载完@Configuration 类之 前先去加载返回的配置类</li>
     * </ol>
     */

    void enableAutoConfiguration() {
    }
}
