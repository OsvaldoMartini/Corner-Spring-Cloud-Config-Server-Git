package ch.corner.profilers.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer 
public class ProfilerConfigServerGit {

	public static void main(String[] args) {
		SpringApplication.run(ProfilerConfigServerGit.class, args);
	}
}
