package config.mixing.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 클래스를 명시했음으로 없어도 상관없음
@Configuration
@Import({DVDConfig.class,DVDPlayerConfig.class})
public class VideoSystemConfig01 {
	
}
