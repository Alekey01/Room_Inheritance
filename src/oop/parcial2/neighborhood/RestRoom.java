package oop.parcial2.neighborhood;

public class RestRoom extends Room{
    private boolean showerCabin;

    public RestRoom(int width, int height, String color, boolean showerCabin) {
        super(width, height, color);
        this.showerCabin = showerCabin;
    }

    public boolean isShowerCabin() {
        return showerCabin;
    }
}
