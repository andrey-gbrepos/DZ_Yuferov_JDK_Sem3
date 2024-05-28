

public class Program <T extends Object> {

    public boolean compareArrays(T[] array1, T[] array2){
        if (array1.length != array2.length){
            System.out.println("Массивы не равны по длине");
            return  false;
        } else
            for (int i = 0; i < array1.length ; i++) {
                System.out.println(array1[i].getClass().getName() + " "
                                    + array2[i].getClass().getName());
                if ( array1[i].getClass().getName()!= array2[i].getClass().getName())
                    return false;
            }
        return true;
    }
}
