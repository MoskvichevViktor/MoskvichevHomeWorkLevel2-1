package leveltwonumberone;

public  class Wall implements Exercise {

    private  int wallhight;

    public Wall(int wallhight) {
        this.wallhight = wallhight;
    }

    @Override
    public void metodexercize() {
        System.out.println("Упражнение выполнено успешно!");
    }

    @Override
    public int getpPametr(){
        return wallhight;
    }
}
