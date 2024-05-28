// Написать класс Калькулятор (необобщенный), который содержит
// обобщенные статические методы: sum(), multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа, над которыми должна
// быть произведена операция. Методы должны возвращать результат своей работы.

public class Calculator {

    public static  <S, T extends Number> Double sum(S numberS, T numberT) {
        if (numberS instanceof Number && numberT instanceof Number) {
            return (((Number) numberS).doubleValue() + ((Number) numberT).doubleValue());
        } else {
            System.out.println("Данные введены не корректно.");
            return null;
        }
    }

        public static <S, T extends Number> Number subtruct(S numberS, T numberT) {
            if (numberS instanceof Number && numberT instanceof Number) {
                return (((Number) numberS).doubleValue() - ((Number) numberT).doubleValue());
            } else {
                System.out.println("Данные введены не корректно.");
                return null;
            }
    }

    public static <S, T extends Number> Number multiply(S numberS, T numberT) {
        if (numberS instanceof Number && numberT instanceof Number) {
            return (((Number) numberS).doubleValue() * ((Number) numberT).doubleValue());
        } else {
            System.out.println("Данные введены не корректно.");
            return null;
        }
    }

    public static <S, T extends Number> Number divide(S numberS, T numberT) {

        if (numberT.equals(0)){
            System.out.println("На ноль делить нельзя");
            return null;
        }
        if (numberS instanceof Number && numberT instanceof Number) {
            return (((Number) numberS).doubleValue() / ((Number) numberT).doubleValue());
        } else {
            System.out.println("Данные введены не корректно.");
            return null;
        }
    }

}
