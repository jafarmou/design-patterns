package behavioral.command;

public class Kirby {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveUp(){
        System.out.println(name + " jumping up!");
    }

    public void moveDown(){
        System.out.println(name + " moving down!");
    }

    public void moveRight(){
        System.out.println(name + " moving right!");
    }

    public void moveLeft(){
        System.out.println(name + " moving left!");
    }
}
