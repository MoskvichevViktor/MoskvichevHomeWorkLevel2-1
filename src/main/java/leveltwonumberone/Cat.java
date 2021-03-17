package leveltwonumberone;

public class Cat implements Result {
    private int  h;
    private  int l;
    private  String name;

    public Cat(int h, int l, String name) {
        this.h = h;
        this.l = l;
        this.name = name;
    }

    @Override
    public void metodrunresult() {
        System.out.println(name + " пробежал " + l + " метров");
    }

    @Override
    public void metodjampoverwallresult() {

        System.out.println(name + " прыгнул " + h + " метров");
    }

    @Override
    public int getL(){
        return l;
    }

    @Override
    public int getH(){
        return h;
    }
}

