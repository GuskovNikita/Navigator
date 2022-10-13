
public class Navigator implements  Runnable {
    int Rdistance, Speed, RTime;

    public Navigator(int Distance) {
        this.Rdistance = Distance;
    }

    @Override
    public void run() {
        do {

            //15-30м/с = 60-120км/ч, считаем время за которое машина проедет 1000 метров(1км)
            //30 секунд со скорость 120 км/ч и минуту со скорость 60 км/ч
            Speed = (int) (Math.random() * ((30 - 15) + 1)) + 15;
            Rdistance = Rdistance - (Speed);
            RTime = Rdistance / Speed;

            System.out.println("Текущая скорость " + Speed + " метров в минуту");

            if (RTime > 4) {
                System.out.println("Осталось ехать " + Rdistance + " метров, " + RTime + " секунд");
            }
            else if (RTime == 4 || RTime == 3 || RTime == 2) {
                System.out.println("Осталось ехать " + Rdistance + " метров, " + RTime + " секунды");
            }
            else if (RTime == 1) {
                System.out.println("Осталось ехать " + Rdistance + " метров, " + RTime + " секунду");
            }
            else {
                System.out.println("Осталось ехать меньше секунды");
            }
            System.out.println();

            if (Rdistance < Speed) {
                System.out.println("Вы приехали");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (Rdistance >= Speed);
    }
}