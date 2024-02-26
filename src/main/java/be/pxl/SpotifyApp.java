package be.pxl;

import java.nio.file.Path;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class SpotifyApp {

	private List<SpotifyRecord> spotifyRecords;

	public SpotifyApp() {
		// TODO: read data from file top50spotify2019.csv and assign to spotifyRecores
	}

	// 1. get the number of spotify records in the list (no stream!)
	public int getNumberOfSpotifyRecords() {
		return 0;
	}

	// 2. get artist name of top 5 spotify records with highest popularity
	public List<String> getTop5ArtistsWithHighestPopularity() {
		return new ArrayList<>();
	}

	// 3. get number of unique artists
	public long getNumberOfUniqueArtists() {
		return 0;
	}

	// 4. all spotify records by artist
	public List<SpotifyRecord> getSpotifyRecordsByArtist(String artistName) {
		return new ArrayList<>();
	}

	// 5. get most danceable spotify record
	public SpotifyRecord getMostDanceableSpotifyRecord() {
		return null;
	}

	// 6. return a string with the names of all genres with a spotify record with danceability > 80.
	// The names must be separated by a comma and doubles are not allowed.
	public String getDanceableGenres() {
		return null;
	}

	// 7. get max duration of all spotify records
	public int getMaxDuration() {
		return 0;
	}

	// 8. get average duration of all spotify records
	public double getAverageDuration() {
		return 0;
	}

	// 9. get most popular genre (the genre with the most spotify records)
	public Genre getMostPopularGenre() {
		return null;
	}

	// 10. get the number of spotify records released in the given month
	public int getNumberOfReleases(Month month) {
		return 0;
	}

	public void saveToFile(List<SpotifyRecord> list, Path filename) {
		// TODO: implement this method
	}

}
