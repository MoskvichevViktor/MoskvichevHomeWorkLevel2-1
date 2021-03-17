package leveltwonumberone;

//Treadmill - беговая дорожка
public  class Treadmill implements Exercise{

    private  int runleight;

    public Treadmill(int runleight) {
        this.runleight = runleight;
    }

    @Override
    public void metodexercize() {
        System.out.println("Упражнение выполнено успешно!");
    }

    @Override
    public int getpPametr(){
        return runleight;
    }
}