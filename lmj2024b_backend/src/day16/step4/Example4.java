package day16.step4;

class Car {
    Tire tire;
    public void run(){  this.tire.roll();    } // 클래스 Car 안에 .tire , run(); -> .tire안에있는 roll 작동
}
class Tire {
    public void roll(){
        System.out.println("일반 타이어가 회전합니다."); // 클래스 Tire 안에 roll -> 일반타이어 회전합니다.
    }
}
class HankookTire extends Tire {
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다."); // 클래스 HankookTire -> Tire 클래스의 상속 -> roll이 일반 -> 한국 으로 변경
    }
}
class KumhoTire extends Tire { // 클래스 KumhoTire -> Tire 클래스의 상속 -> roll이 일반 -> 금호 으로 변경
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}

public class Example4 {
    public static void main(String[] args) {

        Car myCar = new Car(); // my car는 클래스 Car
        // myCar.run();
        Car yourCar = new Car(); // your car 는 클래스 Car
        yourCar.tire = new Tire(); // your car -> Car -> .tire안에 클래스 Tire가 들어옴
        yourCar.run(); // your car.run 은 그러므로 your car -> Car -> run -> this(Tire).tire.roll -> 일반타이어가 회전합니다

        myCar.tire = new Tire(); // my car.tire -> Car -> .tire안에 클래스 Tire가 들어옴
        myCar.run(); // my car.run 은 그러므로 my car -> Car -> run -> this(Tire).tire.roll -> 일반타이어가 회전합니다 

        myCar.tire = new HankookTire(); // my.car.tire 가 HankookTire로 바뀜
        myCar.run(); // this(HankookTire).tire.roll -> 한국타이어가 회전합니다.

        myCar.tire = new KumhoTire(); // my mar.tire 가 KumhoTire로 바뀜
        myCar.run(); // this(KumhoTire).tire.roll -> 금호타이어가 회전합니다.
        yourCar.run(); // 바뀐게 없으므로 위에 그대로 일반타이어가 회전합니다

        System.out.println( myCar.tire instanceof  KumhoTire  ); // myCar안에 tire에는 KumhoTire가 있나. 있으므로 true
        if( myCar.tire instanceof Tire ){ // myCar안에 tire안에 Tire가 있으면
            myCar.tire = new HankookTire();  // myCar안에 .tire안에 HankookTire 로 바뀜
        }
        myCar.run(); // 한국타이어가 회전합니다.
    }
}