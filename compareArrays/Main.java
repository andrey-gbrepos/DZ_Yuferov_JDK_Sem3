// Напишите обобщенный метод compareArrays(), который принимает два массива и 
// возвращает true, если они одинаковые, и false в противном случае. Массивы 
// могут быть любого типа данных, но должны  иметь одинаковую длину и содержать 
// элементы одного типа по парно по индексам.

public class Main {

    public static void main(String[] args){

        Cat cat1 = new Cat(); Cat cat2 = new Cat(); Cat cat3 = new Cat();
        Dog dog1 = new Dog(); Dog dog2 = new Dog(); Dog dog3 = new Dog();

        Number[] num1 = {23, 12.3F, 34.06, 18};
        Number[] num2 = {15, 56.98F, 34.38, 90};
        Number[] num3 = {15, 56.98F, 34.38, 90, 13};

        Program  program = new Program<>();

        Animals[] anim1 = {cat2, dog3, dog1, cat1, cat3};
        Animals[] anim2 = {cat3, dog2, dog3, cat2, cat1};
        Animals[] anim3 = {cat3, dog2, dog3, cat2, dog1};

        System.out.println("Тест 1");
        if (program.compareArrays(num1 , num2)) {
            System.out.println("Массивы " + num1+ " " + num2 + " равны");
        } else {
            System.out.println("Массивы " + num1+ " " + num2 + "  не равны по типу данных");
        }
        System.out.println("Тест 2");
        if (program.compareArrays(num2 , num3)) {
            System.out.println("Массивы " + num1+ " " + num2 + " равны");
        } else {
            System.out.println("Массивы " + num1+ " " + num2 + "  не равны по типу данных");
        }
        System.out.println("Тест 3");
        if (program.compareArrays(anim1,anim2)){
            System.out.println("Массивы " + anim1+ " " + anim2 + " равны");
        } else {
            System.out.println("Массивы " + anim1+ " " + anim2 + "  не равны по типу данных");
        }
        System.out.println("Тест 4");
        if (program.compareArrays(anim2,anim3)){
            System.out.println("Массивы " + anim2+ " " + anim3 + " равны");
        } else {
            System.out.println("Массивы " + anim3+ " " + anim3 + "  не равны по типу данных");
        }
    }
}
