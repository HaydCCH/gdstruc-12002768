package com.gdstruc.module4;

import java.util.Objects;

public class PLayer {



    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PLayer)) return false;
        PLayer pLayer = (PLayer) o;
        return id == pLayer.id && level == pLayer.level && name.equals(pLayer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }

    public PLayer(int id, String name, int level) {
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
