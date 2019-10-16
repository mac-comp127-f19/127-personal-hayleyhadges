package comp127.libraryActivity;

public class Video implements Media {

    private int copies;
    private int totalCopies;
    private String title;
    private String director;

    public Video(String title, String director, int copies, int totalCopies){
        this.title = title;
        this.director = director;
        this.copies = copies;
        this.totalCopies = totalCopies;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean checkOut() {
        if (this.copies > 0) {
            copies--;
            return true;
        } else {
            return false;
        }
    }
        @Override
    public boolean checkIn() {
        if(copies<totalCopies) {
                copies++;
                return true;
            } else {
                return true;
            }
    }

    public String getDirector() {
        return director;
    }


    public String toString(){
        return("Title: " + getTitle() + ", Director: " + getDirector() + ", Number of Copies: " + copies );
    }
}
