package a_introduction;

public class ChromeBrowser implements WebDriver1 {

    @Override
    public void get(){
        System.out.println("something");
    }

    @Override
    public void close(){
        System.out.println("something else");
    }

    @Override
    public String findElement(){
        return "Chrome finds element";
    }

}
