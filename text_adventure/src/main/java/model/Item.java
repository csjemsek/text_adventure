package model;

public class Item {
    boolean held = false;
}

class Key extends Item {
    private String id = "abc";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void unlock(Door door){


    }
}