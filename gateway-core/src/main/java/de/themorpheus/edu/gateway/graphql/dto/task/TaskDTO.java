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
public class TaskDTO {

	@Min(0)
	private int taskId;
	@NotNull @NotEmpty @NotBlank
	private String task;
	@NotNull @NotEmpty @NotBlank
	private String description;
	@NotNull @NotEmpty @NotBlank
	private String language;
	@NotNull
	private UserDTO author;
	@Min(0)
	private int necessaryPoints;
	@NotNull
	private boolean verified;
	@NotNull
	private TaskTypeDTO taskType;
	@NotNull
	private LectureDTO lecture;
	@NotNull
	private DifficultyDTO difficulty;

}
