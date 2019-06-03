import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Code practice for interview");

        int[] movies_duration = new int[]{90, 85, 75, 60, 120, 150, 125};
        // {90,  85,  75,  60,  120, 150, 125}
        // {130, 135, 155, 160, 100, 70,  95}
        System.out.println(Arrays.toString(movies_duration));
        int flight_duration = 250;
        int duration_limit = 30;

        int[] result  = findPairofMovies(movies_duration, flight_duration, duration_limit);

        System.out.println(Arrays.toString(result));

        //int[] revisedResult = revisedfindPairofMovies(movies_duration, flight_duration, duration_limit);

    }

    public static int[] findPairofMovies(int[] movies_duration, int flight_duration, int duration_limit){
        //ArrayList<Integer> pair_of_movies = new ArrayList<Integer>();
        int[] movie_pair = new int[]{0,0};
        int distance = flight_duration;
        for (int i = 0; i < movies_duration.length; i++){
            for (int j = i + 1; j < movies_duration.length; j++){
                int current_duration  = (flight_duration - duration_limit) - (movies_duration[i]+movies_duration[j]);
                if(current_duration > 0 && current_duration < distance){
                    movie_pair[0] = movies_duration[i];
                    movie_pair[1] = movies_duration[j];
                    distance = current_duration;
                    System.out.println(distance);
                }
            }
        }
        return movie_pair;
    }

    public static int[] revisedfindPairofMovies(int[] movies_duration, int flight_duration, int duration_limit){
        int[] movie_pair = new int[]{0,0};
        int[] potential_movies_duration = new int[movies_duration.length];
        for(int i = 0; i < movies_duration.length; i++){
            potential_movies_duration[i] = flight_duration - duration_limit - movies_duration[i];
        }
        System.out.println(Arrays.toString(potential_movies_duration));
        return movie_pair;
    }

}
