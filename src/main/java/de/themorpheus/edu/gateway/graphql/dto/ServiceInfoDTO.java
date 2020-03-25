package de.themorpheus.edu.gateway.graphql.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceInfoDTO {

	@NotNull @NotEmpty @NotBlank
	private String name;
	@NotNull @NotEmpty @NotBlank
	private String version;
	@NotNull @NotEmpty @NotBlank
	private String commit;
	@Min(0)
	private int buildTime;

}
