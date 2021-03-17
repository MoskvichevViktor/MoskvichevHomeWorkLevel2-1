package leveltwonumberone;
/*Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
прыгать (методы просто выводят информацию о действии в консоль).

Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие
  действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если
        участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
*/

public class Main {

    public static void main(String[] args) {

        Human humanJim = new Human( 2, 1200, "Jim");
        Cat catBarsik = new Cat(1, 20, "Barsik");
        Robot robotAndroid = new Robot( 1, 15, "Android");

        Result[] result = {
                humanJim,
                catBarsik,
                robotAndroid};

        Treadmill treadmill = new Treadmill(1000);
        Wall wall = new Wall( 2);

        Exercise[] exercise = {
                treadmill,
                wall};

        for(Result x : result){
            x.metodjampoverwallresult();
            if(x.getH() >= wall.getpPametr()){
                wall.metodexercize();
                x.metodrunresult();
                if(x.getL() >= treadmill.getpPametr()){
                    treadmill.metodexercize();
                } else System.out.println("Упражнение не выполнено. Выбыл.");
            } else System.out.println("Упражнение не выполнено. Выбыл.");

        }
    }
}
