package Interfaces;

public abstract class Paper {
    private String kind;
    private String popularity;

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
}
