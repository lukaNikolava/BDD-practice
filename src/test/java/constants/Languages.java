package constants;

import lombok.Getter;

@Getter
public enum Languages {

	SPANISH("es");

	private final String value;

	Languages(String value) {
		this.value = value;
	}
}
