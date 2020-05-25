package de.themorpheus.edu.gateway;

import de.themorpheus.edu.backend.task.api.DifficultyApi;
import de.themorpheus.edu.backend.task.api.LectureApi;
import de.themorpheus.edu.backend.task.api.ModuleApi;
import de.themorpheus.edu.backend.task.api.SubjectApi;
import de.themorpheus.edu.backend.task.api.TaskApi;
import de.themorpheus.edu.backend.task.api.TaskGroupApi;
import de.themorpheus.edu.backend.task.api.TaskTypeApi;
import de.themorpheus.edu.backend.task.invoker.ApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskApiConfiguration {

	@Bean
	public TaskApi taskApi() {
		return new TaskApi(apiClient());
	}

	@Bean
	public TaskGroupApi taskGroupApi() {
		return new TaskGroupApi(apiClient());
	}

	@Bean
	public TaskTypeApi taskTypeApi() {
		return new TaskTypeApi(apiClient());
	}

	@Bean
	public LectureApi lectureApi() {
		return new LectureApi(apiClient());
	}

	@Bean
	public ModuleApi moduleApi() {
		return new ModuleApi(apiClient());
	}

	@Bean
	public SubjectApi subjectApi() {
		return new SubjectApi(apiClient());
	}

	@Bean
	public DifficultyApi difficultyApi() {
		return new DifficultyApi(apiClient());
	}

	@Bean
	public ApiClient apiClient() {
		return new ApiClient();
	}

}
