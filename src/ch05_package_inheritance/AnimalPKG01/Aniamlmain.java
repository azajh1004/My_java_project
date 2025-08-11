package ch05_package_inheritance.AnimalPKG01;

public class Aniamlmain {
    public static void main(String[] args) {
        //타입[] 배열명 = {}
        Animal01[] animal = {
                new GoldFish01("금붕어", 2, "거실 어항", 10, 2),
                new Lion01("라이언", 15, "세렝게티", 10, 4),
                new Eagles01("독수리", 20, "푸른창공", 50, 2),
                new Snake01("뱀", 20, "늪지대", 5,"vinyl")
        };

        for (int i = 0; i < animal.length; i++){
            animal[i].showInfo();
            if (animal[i] instanceof GoldFish01){
                GoldFish01 goldFish = (GoldFish01) animal[i];
                goldFish.swim();
            }else if(animal[i] instanceof Lion01){
                Lion01 lion = (Lion01) animal[i];
                lion.run();
            }else if(animal[i] instanceof Eagles01){
                Eagles01 eagles = (Eagles01) animal[i];
                eagles.fly();
            }
        }
    }
}
