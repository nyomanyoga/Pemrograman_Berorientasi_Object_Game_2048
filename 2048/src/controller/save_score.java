package controller;
import java.sql.*;
import javax.swing.JOptionPane;

public class save_score {
    private String username;
    private int score;
    private String state;
    
    public save_score(String username, int score, String state){
        this.username = username;
        this.score = score;
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    public String getState() {
        return state;
    }
    
    public void save(){
        try{
            Connection con = new database().getConnection();
            Statement st = con.createStatement();
            String sql = "insert into score values ('"+username+"','"+ score+"','"+state+"');";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Saved Score");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed" + ex);
        }
    }
}
