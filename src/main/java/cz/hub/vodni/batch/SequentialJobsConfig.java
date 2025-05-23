package cz.hub.vodni.batch;
/*
import java.security.SecureRandom;
import java.util.UUID;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequentialJobsConfig {
    @Autowired
    private Job jobScheduledOutput;

    @Autowired
    private Job temperatureSensorJob;

    @Autowired
    private JobLauncher jobLauncher;

    public void runJobsSequentially() {
        JobParameters jobParameters = new JobParametersBuilder().addString("ID", RandomUtil.unique())
          .toJobParameters();

        JobParameters jobParameters2 = new JobParametersBuilder().addString("ID", RandomUtil.unique())
          .toJobParameters();

        // Run jobs one after another
        try {
            jobLauncher.run(jobScheduledOutput, jobParameters);
            jobLauncher.run(temperatureSensorJob, jobParameters2);
        } catch (Exception e) {
            // handle exception
            e.printStackTrace();
        }
    }
    
}

class RandomUtil {

    private static volatile SecureRandom numberGenerator = null;
    private static final long MSB = 0x8000000000000000L;

    public static String unique() {
        SecureRandom ng = numberGenerator;
        if (ng == null) {
            numberGenerator = ng = new SecureRandom();
        }

        return Long.toHexString(MSB | ng.nextLong()) + Long.toHexString(MSB | ng.nextLong());
    }   
}
*/