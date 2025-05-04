package cz.hub.vodni.batch.config;

import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@Slf4j
public class BatchConfiguration {
	
	@Bean
	JdbcTransactionManager batchTransactionManager(DataSource dataSource) {
		return new JdbcTransactionManager(dataSource);
	}

        @Bean
	@ConfigurationProperties(prefix = "app.datasource")
	DataSource dataSource() {
		return DataSourceBuilder.create()
				.build();
	}

        
	 @Bean
	 DatabasePopulator databasePopulator(DataSource dataSource) {
	        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
	        populator.setContinueOnError(false);
	        populator.execute(dataSource);
	        return populator;
	    }
}
