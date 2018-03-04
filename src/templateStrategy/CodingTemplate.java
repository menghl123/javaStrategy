package templateStrategy;

public interface CodingTemplate {
    default void cook() {
        this.preCook();
        this.cooking();
        this.afterCook();
    }

    void preCook();

    void cooking();

    void afterCook();
}
