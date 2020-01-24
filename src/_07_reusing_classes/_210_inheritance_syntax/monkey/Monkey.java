package _07_reusing_classes._210_inheritance_syntax.monkey;

//package access class is not available in child class, have to use public access
public class Monkey {
    String story ="";

    //package access class is not available in child class, have to use public access
    public void eat(){
        story += "eat ";}

    //is not visible in child class (child class in other package,
    // since public access is not used
    String go(){return "go";}

    public String getStory() {
        return story;
    }
    public void setStory(String story) {
        this.story = story;
    }
}