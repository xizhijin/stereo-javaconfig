package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnableJavaConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public MediaPlayer mediaPlayer(/*CompactDisc compactDisc*/) {
    return new CDPlayer(/*compactDisc*/compactDisc());
  }

}
