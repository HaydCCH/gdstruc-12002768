package com.gdstruc.midterm;

import java.util.Objects;

public class card {



    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof card)) return false;
        card pLayer = (card) o;
        return id == pLayer.id && level == pLayer.level && name.equals(pLayer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }

    public card(int id, String name) {
        this.id = id;
        this.name = name;

    }

    private String name;
    private int level;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "linklist{" +
                "id=" + id +
                ", name='" + name + '\''  +
                '}';
    }
}


