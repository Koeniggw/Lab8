import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField txtGuess;
  JButton btnGuess, btnPlayAgain;
  JLabel lblGuess, lblHighLow, lblLastGuess;
  Random r = new Random();
  int randomInt;

  GuessingGame() {
    randomInt = r.nextInt(100) + 1;

    JFrame f = new JFrame("Guessing Game");
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

  public void actionPerformed(ActionEvent ae) {

    int guess = Integer.parseInt(txtGuess.getText());

    if (ae.getActionCommand().equals("Guess")) {
      lblHighLow.setText("");
      if (guess > randomInt) {
        lblHighLow.setText("Too high!");
      } else if (guess < randomInt) {
        lblHighLow.setText("Too low!");
      } else {
        lblHighLow.setText("You got it!");
      }
      lblLastGuess.setText("Last guess was " + txtGuess.getText());
    }

    if (ae.getActionCommand().equals("Play Again")) {
      Random r = new Random();
      randomInt = r.nextInt(100) + 1;
      lblHighLow.setText("");
      lblLastGuess.setText("");
      lblGuess.setText("Enter your guess:");
      txtGuess.setText("");
    }
  
  else {
      lblHighLow.setText("You pressed Enter. Please press the Game Button.");
    }
    

  }

}
