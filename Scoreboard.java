import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
public class Scoreboard extends JPanel 
{
   //display
   public JLabel scoreLabel;
   double totalScore = 0;
   public Scoreboard() {
      setLayout(new BorderLayout());
      scoreLabel = new JLabel("Score: ");//add scorelater
      scoreLabel.setForeground(new Color(50, 100, 255)) ;
      scoreLabel.setFont(new Font("Sans Serif", Font.BOLD, 20));
      add(scoreLabel);
      add(scoreLabel, BorderLayout.SOUTH);
   }
   
   public JLabel getScoreLabel() {
      return scoreLabel;
   }
   
   public double getScore() {
      return totalScore;
   }
   
   public void update(Display m, JLabel label, boolean first) {
      if (first) {
         totalScore = totalScore + 5000.0;
         totalScore = totalScore + m.getDifference();
         System.out.println("total score, first " + totalScore);
         
      }
      else {
         totalScore = totalScore + m.getDifference();
         System.out.println("total score " + totalScore);     
      }
      totalScore = Math.round(totalScore);
      label.setText("Score: " + totalScore);   
   }
   
}