public class Pair <S, T extends Object> {
    private S first;
    private T second;


    public Pair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s ", "Элементы класса Pair:",
                            "\n", "first = ", first.toString(),
                            "\n", "second = ", second.toString() );
    }
}
