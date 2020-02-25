import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonListener implements ActionListener
{
    
    public void actionPerformed(ActionEvent e){
        boolean turn = TicTacToeViewer.turn; //get current value of turn
        JButton buttonClicked = (JButton)e.getSource(); //get the particular button clicked
        if(buttonClicked.getText().equals("")){
            if(turn){ //turn = true, it's X's turn
                buttonClicked.setText("X");
                buttonClicked.setBackground(Color.red);
                turn = false;
            }else{ //turn = false, it's O's turn
                buttonClicked.setText("O");
                buttonClicked.setBackground(Color.blue);
                turn = true;
            }
        }
        checkWin(buttonClicked);
        System.out.println(buttonClicked.getBounds().x + ", " + buttonClicked.getBounds().y);
        TicTacToeViewer.turn = turn;
    }
    
    public void checkWin(JButton buttonClicked){
        //add game logic here
    }
    
}