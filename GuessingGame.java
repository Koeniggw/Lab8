import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField txtGuess;
  JButton btnGuess, btnPlayAgain;
 // JButton btnPlayAgain;
  JLabel lblGuess,lblHighLow,lblLastGuess;
 // JLabel lblHighLow;
  //JLabel lblLastGuess;
  Random r = new Random();
  int randomInt;


GuessingGame(){
randomInt = r.nextInt(100) + 1;

JFrame f= new JFrame("Guessing Game");
f.setLayout(new FlowLayout());
f.setSize(240, 120);

txtGuess = new JTextField(10);
txtGuess.setActionCommand("myTF");

btnGuess = new JButton("Guess");
btnPlayAgain = new JButton("Play Again");

txtGuess.addActionListener(this);
btnGuess.addActionListener(this);
btnPlayAgain.addActionListener(this);

lblGuess = new JLabel("Enter your guess:");
lblHighLow = new JLabel("");
lblLastGuess = new JLabel("");

f.add(lblGuess);
f.add(txtGuess);
f.add(btnGuess);
f.add(lblHighLow);
f.add(lblLastGuess);
f.add(btnPlayAgain);
f.setVisible(true);

}



public void actionPerformed(ActionEvent ae){

int guess = Integer.parseInt(btnGuess.getText());

if(e.getSource()== btnGuess){
  
}


}
}
