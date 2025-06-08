public class Car{
    int speed;
    String model;
    public Car(String m, int s) {
        model = m;
        speed = s;
    }
        public void drive(){
            System.out.println(model + " driving at " + speed + " km/h");
        }
        public static void main(String[] args) {
            Car car = new Car("Suzuki", 60);
            car.drive();
        }
    }
