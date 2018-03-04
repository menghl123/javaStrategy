package templateStrategy;

public abstract class CookTemplate {
    public void cook() {
        this.preCook();
        this.cooking();
        this.afterCook();
    }

    protected abstract void preCook();

    protected abstract void cooking();

    protected abstract void afterCook();
}
