// Khresna Mulia Putra 2572032
package soal1;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private Integer numberOfStudio = 10;
    private List<Film> films;

   public Cinema(){
       this.films=new ArrayList<>();
   }

    public List<Film> getFilms() {
        return films;
    }

    public Integer getNumberOfStudio() {
        return numberOfStudio;
    }
    public Film getLongestFilm(){
       if (films.isEmpty()){
           return null;
       } else{
            Film Longest= films.get(0);
            for (Film film: films){
                if (film.getDuration()>Longest.getDuration()){
                    Longest=film;
                }
            }
            return Longest;
       }
    }
    public Film getShortestFilm(){
        if (films.isEmpty()){
            return null;
        } else{
            Film Shortest=films.get(0);
            for (Film film: films){
                if (film.getDuration()<Shortest.getDuration()){
                    Shortest=film;
                }
            }
            return Shortest;
        }
    }
}
