package model;

public class NonItemObject {
    private boolean dangerous = false;

}

class Door extends NonItemObject {
    boolean locked = false;
    boolean open = false;
    String id = "";

    // Constructor
    public Door(boolean locked, boolean open, String id) {
        this.locked = locked;
        this.open = open;
        this.id = id;
    }

    public void unlock(Key key){
        if (key.getId() == this.id){
            locked = false;
        } else {
            System.out.println("cannot unlock this door with this key");
        }
    }
}
