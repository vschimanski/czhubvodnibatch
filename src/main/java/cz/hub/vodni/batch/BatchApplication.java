package cz.hub.vodni.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;
import java.util.UUID;

@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BatchApplication.class, args);
		
	}

	/*
	@Bean
    CommandLineRunner runjobScheduledOutput(JobLauncher jobLauncher, Job jobScheduledOutput) {
    	 JobParameters params = new JobParametersBuilder()
                 .addString("ID", UUID.randomUUID().toString())
                 .addLocalDateTime("currentTime", LocalDateTime.now())
                 .toJobParameters();
      return (args) -> 
    	  jobLauncher.run(jobScheduledOutput, params);
    }
	
    @Bean
    CommandLineRunner runtemperatureSensorJob(JobLauncher jobLauncher, Job temperatureSensorJob) {
    	 JobParameters params = new JobParametersBuilder()
                 .addString("ID", UUID.randomUUID().toString())
                 .addLocalDateTime("currentTime", LocalDateTime.now())
                 .toJobParameters();
      return (args) -> 
    	  jobLauncher.run(temperatureSensorJob, params);
    }
*/    
}

