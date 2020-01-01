package structural.adapter;

public class BloodOrange implements Orange{
    @Override
    public String getVariety() {
        return "Variety: Blood Orange";
    }

    @Override
    public void eat() {
        System.out.println("Orange gets enjoyed");
    }

    @Override
    public void peel() {
        System.out.println("Orange gets peeled");
    }

    @Override
    public void juice() {
        System.out.println("Orange gets juiced");
    }
}
