import java.util.HashMap;

/** author : Mohamed Elmaghraby **/

public class WordCount {

	public static void main(String[] args) {

     // data source that will be matched to count the words
    
    String src = "Combined with the below initiative or implemented separately, "
	+ "developing self-service access and reporting to your data is something that can free up your IT and analytics staff. "
        + "Your organization will be much more efficient if any member of the team can build and run a report rather than waiting for a custom report to be created and executed for them. This type of project might feel a bit like ‘dashboards’ but it should be much more than "
        + "that – your people should be able to get into the data, see the data and manipulate the data and then build a report or visualization based on those manipulations. Of course, you need a good data governance process in place to ensure that the right people can see the right data";
		
    // seperate data or tokens using whiteSpace \\s
    
    String[] Words = src.split(" ");
    
    // preparing the counting process
    
    HashMap<String, Integer> map = new HashMap<String, Integer>();

		int i = 0;
		while (i < Words.length) {
			if (!map.containsKey(Words[i])) {
				map.put(Words[i], 1);

			} else {
				int oldKey = map.get(Words[i]);
				map.replace(Words[i], oldKey, ++oldKey);

			}

			i++;
		}
    
    // display data as a wordcount app 
		
    map.forEach((key, value) -> System.out.println("(" + key + " , " + value + ")"));

	}

}
