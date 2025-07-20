package cz.hub.vodni.batch;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static Logger log = Logger.getLogger(ScheduledTasks.class.getName());

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// @Scheduled(fixedRate = 5000)
	// public void reportCurrentTime() {
	// log.info("The time is now : " + dateFormat.format(new Date()));
	// }

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job jobScheduledOutput;

	@Autowired
	private Job temperatureSensorJob;

	@Scheduled(cron = "0 */2 * * * *")

	public void scheduleMyBatchJob() throws JobParametersInvalidException, JobExecutionAlreadyRunningException,
			JobRestartException, JobInstanceAlreadyCompleteException {

		JobParameters params = new JobParametersBuilder().addString("ID", UUID.randomUUID().toString())
				.addLong("time", System.currentTimeMillis()).toJobParameters();
		jobLauncher.run(jobScheduledOutput, params);
		jobLauncher.run(temperatureSensorJob, params);
	}
}