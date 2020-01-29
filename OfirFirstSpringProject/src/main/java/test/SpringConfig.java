package test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Tell Spring that this is the configuration file.
@ComponentScan("beans") // Tell Spring where to look for components.

public class SpringConfig {

}
