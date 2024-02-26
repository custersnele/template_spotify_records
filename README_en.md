## 2023 spotify top 50

### Introduction
Given is a dataset that will sound like music to the ears, the top 50 of Spotify from 2023 (top_50_2023.csv). 
In this assignment, you read the data. Then, you will perform operations using streams and lambda expressions.

### Learning Objectives:
- File I/O
- ArrayList
- Streams and lambda expressions
- Writing unit tests

### Problem Statement
The CSV file consists of 50 lines with the same structure, the first line of the file contains the column names:

     artist_name;track_name;is_explicit;album_release_date;genres;danceability;valence;energy;loudness;acousticness;instrumentalness;liveness;speechiness;key;tempo;mode;duration_ms;time_signature;popularity

| Field              | Description                                                                              | 
|--------------------|------------------------------------------------------------------------------------------|
| track_name         | The track name                                                                           |
| artist_name        | The artist name                                                                          |
| is_explicit        | Indicates whether the track contains explicit content                                    |
| album_release_date | The date when the track was released                                                     |
| genres             | A list of genres associated with the track's artist(s)                                   |
| danceability       | A measure from 0.0 to 1.0 indicating how suitable a track is for dancing                 |
| valence            | A measure from 0.0 to 1.0 describing the musical positiveness conveyed by a track        |
| energy             | A measure from 0.0 to 1.0 that represents a perceptual measure of intensity and activity |
| loudness           | The overall loudness of a track in decibels (dB)                                         |
| acousticness       | A measure from 0.0 to 1.0 indicating the likelihood of the track being acoustic          |
| instrumentalness           | Predicts whether a track contains no vocals                                              |
| liveness | Detects the presence of an audience in the recording                                     | 
| speechiness | Detects the presence of spoken words in a track                                          |
| key | The key the track is in |
| tempo | The overall estimated tempo of a track in beats per minute (BPM) |
| mode | The modality of the track |
| duration_ms | The length of the track in milliseconds |
| time_signature | An estimated overall time signature of a track |
| popularity | A score between 0 and 100, with 100 being the most popular |

### Provided
Class SpotifyRecord.

### Task 1

Complete the helper class SpotifyRecordMapper with the static method 
mapDataToSpotifyRecord to transform the data of a single 
Spotify record from the file into a SpotifyRecord object. 
If an error occurs while reading a record, then throw an 
unchecked InvalidSpotifyRecordException. 
Write unit tests to check if the method works correctly.

### Task 2

Complete the SpotifyReader class. Implement the loadSpotifyRecords 
method, taking into account the following guidelines:

- Use the static method mapDataToSpotifyRecord in the SpotifyRecordMapper class to transform the data from a Spotify record in the file into a SpotifyRecord object.
- All SpotifyRecord objects are stored in a List that is returned as a result.
- The read method of the SpotifyReader class takes the Path to the file to be read as an argument.
- If calling the SpotifyRecordMapper throws an exception (e.g. due to missing or invalid data), ensure that the SpotifyReader prints the error message with System.err.println(). 
The SpotifyReader should continue reading the remaining SpotifyRecords.

### Task 3
In the SpotifyApp class, complete the methods below. 
Use the Streaming API and lambda expression for each method (except getNumberOfSpotifyRecords).
You can test your implementation with the help of the SpotifyAppTest class.
You may not make changes to the top_50_2023.csv file and the SpotifyAppTest test class.
In the constructor of the SpotifyApp class, first use the SpotifyReader to read the file top_50_2023.csv.
The read SpotifyRecords are assigned to an instance variable of the SpotifyApp class.

1. **int getNumberOfSpotifyRecords()**

   Return the number of Spotify records in the list. (Do not use a stream!)

2. **List<String> getTop5ArtistsWithHighestPopularity()**

   Return a list with the names of the artists from the 5 most popular Spotify records. (You may assume that these are 5 different names.)

3. **int getNumberOfUniqueArtists()**

   How many unique artist names are there in the list?

4. **List<SpotifyRecord> getSpotifyRecordsByArtist(String artistName)**

   For the given artist, retrieve all SpotifyRecords from the list.

5. **SpotifyRecord getMostDanceableSpotifyRecord()**

   Which SpotifyRecord has the highest value for danceability?

6. **String getDanceableGenres()**

   Return the different genres with a danceability greater than or equal to 0.8 in a String. 
   The names of the genres should be separated by a comma and the string should not contain duplicates.

7. **int getMaxDuration()**

   What is the longest duration of a SpotifyRecord?

8. **int getAverageLength()**
   What is the average duration of a SpotifyRecord?

9. **Genre getMostPopularGenre()**
   Give the most common genre. In other words, which genre has the most SpotifyRecords?

10. **int getNumberOfReleases(Month month)**
    Provide the number of SpotifyRecords that were released in the specified month.


You can test the methods using the test class SpotifyAppTest.

### Task 4

Finally, implement the method saveToFile in the SpotifyApp class. 
The saveToFile method has 2 parameters: a list of SpotifyRecords and a path.

In the SpotifyAppRunner class, use the saveToFile method to write the SpotifyRecords of Taylor Swift (see the records variable) to the file taylor.txt in the resources folder.


### Task 5


The main program is provided, but the functionality to write the titles of Taylor Swift's records to the file is missing. Add this functionality.

### Output
When you run the main program in the SpotifyAppRunner class, you should get the following output.

```
Error parsing spotify record [Tom Odell;Another Love;True;2013-06-24;['pop'];0.445;0.131;0.537;0.04;4;122.769;0;244360;4;72]
Error parsing spotify record [SZA;Snooze;True;2022-12-09;['pop', 'r&b', 'rap'];0.559;0.392;verkeerde;data;0.141;0.0;0.11;0.132;5;143.008;1;201800;4;93]
** Number of spotify records: 50
** Number of unique artists: 41
** Songs by Taylor Swift saved to file.
** Top 5 artists: 
Taylor Swift
Arctic Monkeys
Harry Styles
The Weeknd
Olivia Rodrigo
** Most popular genre: POP
** Danceable genres: REGGAETON,POP,HIP_HOP,DANCE_POP,K_POP
** Max duration: 272373
** Average duration: 200458.1
** Number of releases in April: 5
** Most danceable: 
SpotifyRecord{trackName='Me Porto Bonito', artistName='Bad Bunny', popularity=89}
 ```
