package be.pxl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Genre {
	DANCE_POP("dance pop"),
	POP,
	K_POP("k-pop"),
	RNB("r&b"),
	RAP,
	MUSICA_MEXICANA("musica mexicana"),
	AFROBEATS,
	REGGAETON,
	ROCK("rock", "garage rock", "modern rock", "piano rock"),
	COUNTRY,
	HIP_HOP("hip hop", "trap");

	private final List<String> displayNames;

	Genre(String... displayNames) {
		this.displayNames = Arrays.asList(displayNames);
	}

	Genre() {
		this.displayNames = Collections.singletonList(name().toLowerCase());
	}

	public static Genre findByDisplayName(String displayName) {
		// TODO: implement using a stream
		return null;
	}
}
