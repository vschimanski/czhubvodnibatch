package cz.hub.vodni.batch.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@Slf4j
public class JobsConfig {
    	@Bean
        public Job jobScheduledOutput(JobRepository jobRepository, Step stepScheduledOutput) {
            return new JobBuilder("jobScheduledOutput", jobRepository)
                    .start(stepScheduledOutput)
                    .build();
        }

        @Bean
        public Step stepScheduledOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
            return new StepBuilder("stepScheduledOutput", jobRepository)
                            .allowStartIfComplete(true)
                    .tasklet((StepContribution contribution, ChunkContext chunkContext) -> {
                        log.info("BATCH run ::: JobScheduledOutput! :::");
                        return RepeatStatus.FINISHED;
                    }, transactionManager).build();
        }
        
        @Bean
        public Job jobScheduledOutput2(JobRepository jobRepository, Step stepScheduledOutput2) {
            return new JobBuilder("jobScheduledOutput2", jobRepository)
                    .start(stepScheduledOutput2)
                    .build();
        }

        @Bean
        public Step stepScheduledOutput2(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
            return new StepBuilder("stepScheduledOutput2", jobRepository)
                            .allowStartIfComplete(true)
                    .tasklet((StepContribution contribution, ChunkContext chunkContext) -> {
                        log.info("BATCH run ::: JobScheduledOutput2! :::");
                        return RepeatStatus.FINISHED;
                    }, transactionManager).build();
        }
}