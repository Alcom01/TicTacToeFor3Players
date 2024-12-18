import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe implements ActionListener{
	JFrame frame;
	JTextField playerTurnField;
	JButton[] button = new JButton[16];
	JButton reset;
	JTextField  counterX,counterO,counterY;
	JPanel counterPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	int counterx = 0;
	int countery = 0;
	int countero = 0;
	
	boolean player1_turn = true;
	boolean player2_turn = false;
	
	
	
	TicTacToe(){
		frame = new JFrame("Tic Tac Toe");
	    frame.setLayout(new BorderLayout());
	    
	    ImageIcon icon = new ImageIcon("ttc.png");
	    frame.setIconImage(icon.getImage());
	   
	   
		
		playerTurnField = new JTextField("X Turn");
		playerTurnField.setSize(250,250);
		playerTurnField.setBackground(Color.GRAY);
		playerTurnField.setFont(new Font("Algerian",Font.BOLD,25));
		playerTurnField.setEditable(false);
		playerTurnField.setHorizontalAlignment(JTextField.CENTER);
		
		counterX = new JTextField("X:");
		counterX.setForeground(Color.blue);
		counterX.setFont( new Font("Algerian",Font.BOLD,12));
		counterX.setEditable(false);
		counterY = new JTextField("Y:");
		counterY.setFont( new Font("Algerian",Font.BOLD,12));
		counterY.setForeground(Color.red);
		counterY.setEditable(false);
		counterO = new JTextField("O:");
		counterO.setForeground(Color.green);
		counterO.setFont( new Font("Algerian",Font.BOLD,12));
		counterO.setEditable(false);
		
		counterPanel = new JPanel();
		
		counterPanel.setLayout(new GridLayout(1,3));
		counterPanel.add(counterX);
		counterPanel.add(counterY);
		counterPanel.add(counterO);
		
		
		
		frame.add(counterPanel,BorderLayout.AFTER_LINE_ENDS);
		frame.add(playerTurnField,BorderLayout.NORTH);
		
		reset = new JButton("RESET");
		reset.addActionListener(this);
		reset.setFocusable(false);
		reset.setBackground(Color.red);
		reset.setFont(new Font("Algerian",Font.BOLD,25));
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4));
		
		for(int i = 0 ;  i <16; i ++) {
            button[i] = new JButton();
            button[i].setBackground(Color.black);
			button[i].addActionListener(this);
			button[i].setFont(new Font("Algerian",Font.BOLD,50));
			button[i].setFocusable(false);
			buttonPanel.add(button[i]);
		}
		frame.add(reset,BorderLayout.AFTER_LAST_LINE);
		frame.add(buttonPanel);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public void check() {
		// x Wins
		if(
				button[0].getText() == "X" &&
				button[1].getText() == "X" &&  
				button[2].getText() == "X" && 
				button[3].getText() == "X") {
			xWins(0,1,2,3);
			
		}
		if(
				button[4].getText() == "X" &&
				button[5].getText() == "X" &&  
				button[6].getText() == "X" && 
				button[7].getText() == "X"){
			xWins(4,5,6,7);
			
		}
		if(
				button[8].getText() == "X" &&
				button[9].getText() == "X" &&  
				button[10].getText() == "X" && 
				button[11].getText() == "X") {
			xWins(8,9,10,11);
			
		}
		if(
				button[12].getText() == "X" &&
				button[13].getText() == "X" &&  
				button[14].getText() == "X" && 
				button[15].getText() == "X") {
			xWins(12,13,14,15);
			
		}
		if(
				button[0].getText() == "X" &&
				button[4].getText() == "X" &&  
				button[8].getText() == "X" && 
				button[12].getText() == "X") {
			xWins(0,4,8,12);
			
		}
		if(
				button[1].getText() == "X" &&
				button[5].getText() == "X" &&  
				button[9].getText() == "X" && 
				button[13].getText() == "X") {
			xWins(1,5,9,13);
			
		}
		if(
				button[2].getText() == "X" &&
				button[6].getText() == "X" &&  
				button[10].getText() == "X" && 
				button[14].getText() == "X") {
			xWins(2,6,10,14);
			
		}
		if(
				button[3].getText() == "X" &&
				button[7].getText() == "X" &&  
				button[11].getText() == "X" && 
				button[15].getText() == "X") {
			xWins(3,7,11,15);
			
		}
		if(
				button[0].getText() == "X" &&
				button[5].getText() == "X" &&  
				button[10].getText() == "X" && 
				button[15].getText() == "X") {
			xWins(0,5,10,15);
			
		}
		if(
				button[3].getText() == "X" &&
				button[6].getText() == "X" &&  
				button[10].getText() == "X" && 
				button[13].getText() == "X") {
			xWins(3,6,10,13);
			
		}
		if(
				button[3].getText() == "X" &&
				button[6].getText() == "X" &&  
				button[9].getText() == "X" && 
				button[12].getText() == "X") {
			xWins(3,6,9,12);
			
		}
		
		
		
		
		// o Wins  -------------------
		if(
				button[0].getText() == "O" &&
				button[1].getText() == "O" &&  
				button[2].getText() == "O" && 
				button[3].getText() == "O") {
			oWins(0,1,2,3);
			
		}
		if(
				button[4].getText() == "O" &&
				button[5].getText() == "O" &&  
				button[6].getText() == "O" && 
				button[7].getText() == "O"){
			oWins(4,5,6,7);
			
		}
		if(
				button[8].getText() == "O" &&
				button[9].getText() == "O" &&  
				button[10].getText() == "O" && 
				button[11].getText() == "O") {
			oWins(8,9,10,11);
			
		}
		if(
				button[12].getText() == "O" &&
				button[13].getText() == "O" &&  
				button[14].getText() == "O" && 
				button[15].getText() == "O") {
			oWins(12,13,14,15);
			
		}
		if(
				button[0].getText() == "O" &&
				button[4].getText() == "O" &&  
				button[8].getText() == "O" && 
				button[12].getText() == "O") {
			oWins(0,4,8,12);
			
		}
		if(
				button[1].getText() == "O" &&
				button[5].getText() == "O" &&  
				button[9].getText() == "O" && 
				button[13].getText() == "O") {
			oWins(1,5,9,13);
			
		}
		if(
				button[2].getText() == "O" &&
				button[6].getText() == "O" &&  
				button[10].getText() == "O" && 
				button[14].getText() == "O") {
			oWins(2,6,10,14);
			
		}
		if(
				button[3].getText() == "O" &&
				button[7].getText() == "O" &&  
				button[11].getText() == "O" && 
				button[15].getText() == "O") {
			oWins(3,7,11,15);
			
		}
		if(
				button[0].getText() == "O" &&
				button[5].getText() == "O" &&  
				button[10].getText() == "O" && 
				button[15].getText() == "O") {
			oWins(0,5,10,15);
			
		}
		if(
				button[3].getText() == "O" &&
				button[6].getText() == "O" &&  
				button[10].getText() == "O" && 
				button[13].getText() == "O") {
			oWins(3,6,10,13);
			
		}
		if(
				button[3].getText() == "O" &&
				button[6].getText() == "O" &&  
				button[9].getText() == "O" && 
				button[12].getText() == "O") {
			oWins(3,6,9,12);
			
		}
		
		// y Wins ------------------
		if(
				button[0].getText() == "Y" &&
				button[1].getText() == "Y" &&  
				button[2].getText() == "Y" && 
				button[3].getText() == "Y") {
			yWins(0,1,2,3);
			
		}
		if(
				button[4].getText() == "Y" &&
				button[5].getText() == "Y" &&  
				button[6].getText() == "Y" && 
				button[7].getText() == "Y"){
			yWins(4,5,6,7);
			
		}
		if(
				button[8].getText() == "Y" &&
				button[9].getText() == "Y" &&  
				button[10].getText() == "Y" && 
				button[11].getText() == "Y") {
			yWins(8,9,10,11);
			
		}
		if(
				button[12].getText() == "Y" &&
				button[13].getText() == "Y" &&  
				button[14].getText() == "Y" && 
				button[15].getText() == "Y") {
			yWins(12,13,14,15);
			
		}
		if(
				button[0].getText() == "Y" &&
				button[4].getText() == "Y" &&  
				button[8].getText() == "Y" && 
				button[12].getText() == "Y") {
			yWins(0,4,8,12);
			
		}
		if(
				button[1].getText() == "Y" &&
				button[5].getText() == "Y" &&  
				button[9].getText() == "Y" && 
				button[13].getText() == "Y") {
			yWins(1,5,9,13);
			
		}
		if(
				button[2].getText() == "Y" &&
				button[6].getText() == "Y" &&  
				button[10].getText() == "Y" && 
				button[14].getText() == "Y") {
			yWins(2,6,10,14);
			
		}
		if(
				button[3].getText() == "Y" &&
				button[7].getText() == "Y" &&  
				button[11].getText() == "Y" && 
				button[15].getText() == "Y") {
			yWins(3,7,11,15);
			
		}
		if(
				button[0].getText() == "Y" &&
				button[5].getText() == "Y" &&  
				button[10].getText() == "Y" && 
				button[15].getText() == "Y") {
			yWins(0,5,10,15);
			
		}
		if(
				button[3].getText() == "Y" &&
				button[6].getText() == "Y" &&  
				button[10].getText() == "Y" && 
				button[13].getText() == "Y") {
			yWins(3,6,10,13);
			
		}
		if(
				button[3].getText() == "Y" &&
				button[6].getText() == "Y" &&  
				button[9].getText() == "Y" && 
				button[12].getText() == "Y") {
			yWins(3,6,9,12);
			
		}
		
		
	}
	
	public void counter() {
		
		if(playerTurnField.getText().equals("X WINS !!")) {
			counterx++;
			
			counterX.setText("X:"+String.valueOf(counterx));
		}
		 if(playerTurnField.getText().equals("Y WINS !!")) {
			countery++;
			counterY.setText("Y:"+String.valueOf(countery));
		} if(playerTurnField.getText().equals("O WINS !!")) {
			countero++;
			counterO.setText("O:"+String.valueOf(countero));
		}
		
	}
	
	
	public void xWins(int a, int b , int c,int d) {
        button[a].setBackground(Color.blue);
        button[b].setBackground(Color.blue);
        button[c].setBackground(Color.blue);
        button[d].setBackground(Color.blue);
		for(int i = 0; i < 16; i++) {
			button[i].setEnabled(false);
			}
		playerTurnField.setText("X WINS !!");
		counter();
		
		
	}
   public void oWins(int a , int b, int c,int d) {
	   button[a].setBackground(Color.green);
       button[b].setBackground(Color.green);
       button[c].setBackground(Color.green);
       button[d].setBackground(Color.green);
		for(int i = 0; i < 16; i++) {
			button[i].setEnabled(false);
			}
		playerTurnField.setText("O WINS !!");
		counter();
		
	}
   public void yWins(int a , int b, int c, int d) {
	   button[a].setBackground(Color.red);
       button[b].setBackground(Color.red);
       button[c].setBackground(Color.red);
       button[d].setBackground(Color.red);
		for(int i = 0; i < 16; i++) {
			button[i].setEnabled(false);
			}
		playerTurnField.setText("Y WINS !!");
		counter();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0 ; i < 16; i ++) {
			if( e.getSource() == button[i]){
				if(player1_turn) {
					if(button[i].getText()== "") {
						button[i].setForeground(new Color(0,0,255));
						button[i].setText("X");
						player1_turn = false;
						player2_turn = true;
						playerTurnField.setText("O Turn");
						check();
						}
					 }
				
				else if(player2_turn) {
					    if(button[i].getText()== ""){
						button[i].setForeground(new Color(0,255,0));
						button[i].setText("O");
						player2_turn = false ;
						playerTurnField.setText("Y Turn");
						check();
						}
					}
				else {
					if(button[i].getText()== ""){
						button[i].setForeground(new Color(255,0,0));
						button[i].setText("Y");
						player1_turn = true ;
						playerTurnField.setText("X Turn");
						check();
						}
					}
				}
			
	         
			}
		     if(e.getSource() == reset) {
	       	    playerTurnField.setText("X Turn");
	       	     for(int i = 0; i <16; i++) {
	       	    	 button[i].setBackground(Color.black);
	       	    	 button[i].setText("");
	       	    	 button[i].setEnabled(true);
	       		  }
	       	     
	       	     player1_turn = true;
        }
		
         }
		
		}
		
		
	
	


