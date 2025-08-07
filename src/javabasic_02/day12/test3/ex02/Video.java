package javabasic_02.day12.test3.ex02;

public class Video extends Content{
    private String genre;

    Video(String title, String genre){
        super(title);
        this.genre = genre;
    }

    public void totalPrice(){
        if(this.genre.equals("new")){
            this.setPrice(2000);
        } else if (this.genre.equals("comic")) {
            this.setPrice(1500);
        } else if (this.genre.equals("child")) {
            this.setPrice(1000);
        } else {
            this.setPrice(500);
        }
    }
}
