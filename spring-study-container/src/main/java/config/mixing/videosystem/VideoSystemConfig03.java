package config.mixing.videosystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

// 클래스를 명시했음으로 없어도 상관없음
@Configuration
@ImportResource("classpath:config/mixing/videosystem/DVDConfig.xml")
public class VideoSystemConfig03 {
	
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengers") DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
