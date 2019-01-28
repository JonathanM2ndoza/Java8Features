package lambda.example1;

@FunctionalInterface
public interface Calculator {
    public int operation (int x, int y);

    int hashCode();
    String toString();
    boolean equals(Object obj);
}
