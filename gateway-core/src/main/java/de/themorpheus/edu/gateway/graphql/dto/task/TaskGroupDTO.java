package de.themorpheus.edu.gateway.graphql.dto.task;

import de.themorpheus.edu.gateway.graphql.dto.user.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskGroupDTO {

	@Min(1)
	private int taskGroupId;
	@NotNull @NotBlank @NotEmpty
	private String nameKey;
	@NotNull @NotBlank @NotEmpty
	private String language;
	@NotNull
	private LectureDTO lecture;
	@NotNull
	private DifficultyDTO difficulty;
	@NotNull
	private TaskDTO[] tasks;
	@NotNull
	private UserDTO author;

}
