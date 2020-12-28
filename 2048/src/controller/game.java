package controller;

public abstract class game {
    public abstract int[][] getPan();
    public abstract void setScore(int score);
    public abstract String getState();
    public abstract int getScore();
    public abstract boolean isOver();
    public abstract int isEmpty();
    public abstract void random();
    public abstract void kiri(int X, int Y) ;
    public abstract void bawah(int X, int Y);
    public abstract void kanan(int X, int Y);
    public abstract void atas(int X, int Y);
    public abstract boolean kondisi();   
    public abstract boolean win();
    public abstract void play(int direction);
}
