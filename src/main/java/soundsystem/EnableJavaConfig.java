package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnableJavaConfig {
  
  @Bean
  public SgtPeppers sgtPeppers() {
    return new SgtPeppers();
  }
  
  @Bean
  public CDPlayer cdPlayer(SgtPeppers sgtPeppers) {
    return new CDPlayer(sgtPeppers/*sgtPeppers()*/);//¹¹ÔìÆ÷×¢Èë
  }

}
