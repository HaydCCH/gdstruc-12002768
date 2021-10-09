package com.gdstruc.module2;

import java.util.Objects;

public class linklist {

    private int id;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof linklist)) return false;
        linklist linklist = (linklist) o;
        return id == linklist.id && level == linklist.level && name.equals(linklist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }

    public linklist(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level= level;
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
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
