package com.ohmin839.jybuben.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.PlatformTransactionManager;

@SpringBootApplication
//@EnableBatchProcessing // not working with this annotation sincce 5.0
public class JybubenBatchApplication {
	@Bean
	public Step firstStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
		return new StepBuilder("step1", jobRepository)
			.tasklet(new Tasklet() {
				@Override
				public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
					System.out.println("step1 executed!!");
					return RepeatStatus.FINISHED;
				}
			}, transactionManager)
			.build();
	}

	@Bean
	public Job firstJob(JobRepository jobRepository, Step step) {
		return new JobBuilder("job1", jobRepository)
			.start(step)
			.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(JybubenBatchApplication.class, args);
	}
}
