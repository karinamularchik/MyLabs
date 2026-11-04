package org.example.task2;

import java.util.ArrayList;
import java.util.List;

class Programmer {
    private int id;
    private String name;
    private String language;
    private int level;
    private List<Integer> codeReviews;

    public Programmer(int id, String name, String language, int level, List<Integer> codeReviews) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.level = level;
        this.codeReviews = codeReviews != null ? codeReviews : new ArrayList<>();
    }

    public double getAverageReview() {
        if (codeReviews.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int review : codeReviews) {
            sum += review;
        }
        return sum / codeReviews.size();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public List<Integer> getCodeReviews() {
        return codeReviews;
    }

    @Override
    public String toString() {
        return "Programmer{id=" + id + ", name='" + name + "', language='" + language +
                "', level=" + level + ", avgReview=" + String.format("%.2f", getAverageReview()) + "}";
    }
}
