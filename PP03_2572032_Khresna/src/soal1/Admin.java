
// Khresna Mulia Putra 2572032
package soal1;

public class Admin {
    private Cinema cinema;

    public Admin(Cinema cinema) {
        this.cinema = cinema;
    }
    public void addFilm(Film film){
        if(cinema.getFilms().size()<cinema.getNumberOfStudio()){
            cinema.getFilms().add(film);
        } else{
            System.out.println("STudio Full!");
        }
    }
    public void viewAllFilm(){
        if(cinema.getFilms().isEmpty()){
            System.out.println("nofilm");
        } else{
            int i=1;
            for(Film film: cinema.getFilms()){
                System.out.println(i+". "+ film.getTitle()+ " with durations "+ film.getDuration());
                i++;
            }
        }
    }
    public void viewLongestFilm() {
        Film longest = cinema.getLongestFilm();
        if (longest == null) {
            System.out.println("NoFilm");
        } else {
            System.out.println("Longest Film");
            System.out.println("Title: " + longest.getTitle());
            System.out.println("Duration: " + longest.getDuration());
        }
    }
    public void viewShortestFilm(){
        Film shortest=cinema.getShortestFilm();
        if (shortest==null){
            System.out.println("No fLim");
        }else{
            System.out.println("shortest Film");
            System.out.println("Title: " + shortest.getTitle());
            System.out.println("Duration: " + shortest.getDuration());
        }
    }




}

