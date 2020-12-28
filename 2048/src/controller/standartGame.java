package controller;
import java.util.*;

public class standartGame extends game{
    private int[][] pan = new int[4][4];
    private static int score = 0;
    private String state = "STANDART";

    public standartGame() {
    }
    
    public String getState(){
        return this.state;
    }
    
    public int[][] getPan() {
        return pan;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public boolean isOver(){
        return isEmpty() == 0 && !kondisi();
    }
    
    public int isEmpty(){
        int penampung=0;
        for (int x=0; x<4; x++) {
            for (int y=0; y<4; y++) {
                if (pan[x][y]==0) {
                    penampung++;
                }
            }
        }
        return penampung;
    }
    
    public void random(){
        if (isEmpty() != 0){
            Random rand = new Random();
            int kolom = rand.nextInt(4);
            int baris = rand.nextInt(4);
            int isi = ((rand.nextInt(2))+1)*2;           
            if(pan[kolom][baris]!=0) {
                random();
            }
            else {
                pan[kolom][baris]=isi;
            }
        }
    }
    
    public void kiri(int X, int Y) {
        if(!kondisi()){
            
        }
        
        for (X=0; X<4; X++) {
            for (Y=1; Y<4; Y++)  {
                if(pan[X][Y]==pan[X][Y-1]){ 
                    pan[X][Y-1]=pan[X][Y-1]*2;
                    score+=pan[X][Y-1]; 
                    pan[X][Y]=0;
                }
                else if (pan[X][Y-1]==0){
                    pan[X][Y-1]=pan[X][Y];
                    pan[X][Y]=0;
                    kiri(X, Y-1);
                }
            }
        }
    }
    
    public void bawah(int X, int Y) {
        for (X=0; X<3; X++) {
            for (Y=3; Y>=0; Y--) {
                if(pan[X][Y]==pan[X+1][Y]) {
                    pan[X+1][Y]=pan[X+1][Y]*2;
                    score+=pan[X+1][Y];
                    pan[X][Y]=0;
                }
                else if (pan[X+1][Y]==0) {
                    pan[X+1][Y]=pan[X][Y];
                    pan[X][Y]=0;
                    bawah(X+1, Y);
                }
            }
        }   
    }
    
    public void kanan(int X, int Y) {
        for (X=0; X<4; X++) {
            for (Y=2; Y>=0; Y--) {
                if(pan[X][Y]==pan[X][Y+1]) {
                    pan[X][Y+1]=pan[X][Y+1]*2;
                    score+=pan[X][Y+1];
                    pan[X][Y]=0;
                } 
                else if (pan[X][Y+1]==0) {
                    pan[X][Y+1]=pan[X][Y];
                    pan[X][Y]=0;
                    kanan(X, Y+1);
                }
            }
        }
    }

    public void atas(int X, int Y) {
        for (X=1; X<4; X++) {
            for (Y=0; Y<4; Y++) {
                if(pan[X][Y]==pan[X-1][Y]) {
                    pan[X-1][Y]=pan[X-1][Y]*2;
                    score+=pan[X-1][Y];
                    pan[X][Y]=0;
                } 
                else if (pan[X-1][Y]==0) {
                    pan[X-1][Y]=pan[X][Y];
                    pan[X][Y]=0;
                    atas(X-1, Y);
                }    
            }
        }   
    }

    public boolean kondisi(){
            for (int x=0; x<4; x++) {
                for (int y=0; y<3; y++) {
                    if (pan[x][y] == pan[x][y+1] && pan[x][y] != 0){
                        return true;
                    }
                }
            }
            for (int x=0; x<3; x++) {
                for (int y=0; y<4; y++) {
                    if (pan[x][y] == pan[x+1][y] && pan[x][y] != 0){
                        return true;
                    }
                }
            }
        
            return false;
    }
    
    public void play(int direction){
        int x = 0, y = 0;
        switch(direction) {
            case 1 : atas(x,y); break;
            case 2 : bawah(x,y); break;
            case 3 : kiri(x, y); break;
            case 4 : kanan(x, y); break;
            default : System.out.println("Input Salah");
	}
        
        random();
        
    }

    @Override
    public boolean win() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
