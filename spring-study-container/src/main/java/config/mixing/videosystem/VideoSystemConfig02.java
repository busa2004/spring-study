package config.mixing.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

// 클래스를 명시했음으로 없어도 상관없음
@Configuration
@Import(DVDPlayerConfig.class)
@ImportResource("classpath:config/mixing/videosystem/DVDConfig.xml")
public class VideoSystemConfig02 {
	
}
