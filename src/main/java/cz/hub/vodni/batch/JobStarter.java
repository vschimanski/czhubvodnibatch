package cz.hub.vodni.batch;

import java.util.UUID;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JobStarter implements ApplicationRunner {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job jobScheduledOutput;
    
    @Autowired
    private Job temperatureSensorJob;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        
   	 	JobParameters params = new JobParametersBuilder()
             .addString("ID", UUID.randomUUID().toString())
             .addLong("time", System.currentTimeMillis())
             .toJobParameters();
        jobLauncher.run(jobScheduledOutput, params);
        
       //JobParameters jobParameters = new JobParametersBuilder()
         //       .addString("ID", UUID.randomUUID().toString())
           //     .addLong("time", System.currentTimeMillis())
             //   .toJobParameters();
        jobLauncher.run(temperatureSensorJob, params );
    }
}