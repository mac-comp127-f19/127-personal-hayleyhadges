package comp127.libraryActivity;

public class Video implements Media {

    private int copies;
    private int totalCopies;
    public Video(){

    }
    @Override
    public String getTitle() {
        return null;
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
}
