import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {
	static JFrame frame;
	static JPanel panel;
	static JButton pas1,pas2,correct1,correct2,tabu1,tabu2,timeout1,timeout2,start1,start2,waitstart;
	static JLabel que,war1,war2,war3,war4,war5,group1name,group2name,groupstarting,group1score,group2score,pashakký;
	static JTextField g1,g2;
	
	public static String group1,group2;
	public static int wordvalue;
	public static String[] word=Words.Word();
	public static String[][] forbidden=Words.Forbidden();
	public static int group1Score,group2Score;
	public static int secim;
	static Scanner input=new Scanner(System.in);
	static Random randomNum=new Random();
	public static int start;
	public static int group1count,group2count;
	public static int pass;
	
	public static void main(String[] args) {
		
		frame=new JFrame("Tabu");
		frame.setSize(1000, 1000);//frame boyutunu ayarlama
		frame.setVisible(true);//frame gosterme
		frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
		
		panel=new JPanel();
		panel.setSize(500,500);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		group1name=new JLabel("1. Grup isim:");
		group1name.setSize(75,50);
		group1name.setLocation(30,40);
		panel.add(group1name);
		
		group2name=new JLabel("2. Grup isim:");
		group2name.setSize(75,50);
		group2name.setLocation(30,90);
		panel.add(group2name);
		
		g1=new JTextField();
		g1.setSize(100,30);
		g1.setLocation(120,50);
		panel.add(g1);
				
		g2=new JTextField();
		g2.setSize(100,30);
		g2.setLocation(120,100);
		panel.add(g2);
		
		start1=new JButton("Baþla");
		start1.setSize(200, 45);
		start1.setLocation(200,300);
		start1.addActionListener(new Action());
		panel.add(start1);
		
		frame.add(panel);
		frame.repaint();
	}
	
	public static void GameGroup1() {
		frame=new JFrame("Tabu");
		frame.setSize(1000, 1000);//frame boyutunu ayarlama
		frame.setVisible(true);//frame gosterme
		frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
		
		panel=new JPanel();
		panel.setSize(1000,1000);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		wordvalue=randomNum.nextInt(word.length);
		
		groupstarting=new JLabel(group1);
		groupstarting.setSize(75,50);
		groupstarting.setLocation(250,10);
		panel.add(groupstarting);
		
		pashakký=new JLabel("Pas Hakký:"+pass+"/3");
		pashakký.setSize(100,50);
		pashakký.setLocation(250,90);
		panel.add(pashakký);
		
		que=new JLabel(word[wordvalue].toUpperCase());
		que.setSize(75,50);
		que.setLocation(30,40);
		panel.add(que);
		
		war1=new JLabel("-"+forbidden[wordvalue][0]);
		war1.setSize(75,50);
		war1.setLocation(30,60);
		panel.add(war1);
		
		war2=new JLabel("-"+forbidden[wordvalue][1]);
		war2.setSize(75,50);
		war2.setLocation(30,70);
		panel.add(war2);
		
		war3=new JLabel("-"+forbidden[wordvalue][2]);
		war3.setSize(75,50);
		war3.setLocation(30,80);
		panel.add(war3);
		
		war4=new JLabel("-"+forbidden[wordvalue][3]);
		war4.setSize(75,50);
		war4.setLocation(30,90);
		panel.add(war4);
		
		war5=new JLabel("-"+forbidden[wordvalue][4]);
		war5.setSize(75,50);
		war5.setLocation(30,100);
		panel.add(war5);
		
		correct1=new JButton("Doðru");
		correct1.setSize(150,50);
		correct1.setLocation(100,200);
		correct1.addActionListener(new Action());
		panel.add(correct1);
		
		pas1=new JButton("Pas");
		pas1.setSize(150,50);
		pas1.setLocation(250,200);
		pas1.addActionListener(new Action());
		panel.add(pas1);
		
		tabu1=new JButton("Tabu");
		tabu1.setSize(150,50);
		tabu1.setLocation(400,200);
		tabu1.addActionListener(new Action());
		panel.add(tabu1);
		
		timeout1=new JButton("Süre Bitti");
		timeout1.setSize(150,50);
		timeout1.setLocation(550,200);
		timeout1.addActionListener(new Action());
		panel.add(timeout1);
		
		frame.add(panel);
		frame.repaint();
	}
	
public static void GameGroup2() {
	frame=new JFrame("Tabu");
	frame.setSize(1000, 1000);//frame boyutunu ayarlama
	frame.setVisible(true);//frame gosterme
	frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
	
	panel=new JPanel();
	panel.setSize(1000,1000);
	panel.setLocation(0, 0);
	panel.setLayout(null);
	
	wordvalue=randomNum.nextInt(word.length);
	
	groupstarting=new JLabel(group2);
	groupstarting.setSize(75,50);
	groupstarting.setLocation(250,10);
	panel.add(groupstarting);
	
	pashakký=new JLabel("Pas Hakký:"+pass+"/3");
	pashakký.setSize(100,50);
	pashakký.setLocation(250,90);
	panel.add(pashakký);
	
	que=new JLabel(word[wordvalue].toUpperCase());
	que.setSize(75,50);
	que.setLocation(30,40);
	panel.add(que);
	
	war1=new JLabel("-"+forbidden[wordvalue][0]);
	war1.setSize(75,50);
	war1.setLocation(30,60);
	panel.add(war1);
	
	war2=new JLabel("-"+forbidden[wordvalue][1]);
	war2.setSize(75,50);
	war2.setLocation(30,70);
	panel.add(war2);
	
	war3=new JLabel("-"+forbidden[wordvalue][2]);
	war3.setSize(75,50);
	war3.setLocation(30,80);
	panel.add(war3);
	
	war4=new JLabel("-"+forbidden[wordvalue][3]);
	war4.setSize(75,50);
	war4.setLocation(30,90);
	panel.add(war4);
	
	war5=new JLabel("-"+forbidden[wordvalue][4]);
	war5.setSize(75,50);
	war5.setLocation(30,100);
	panel.add(war5);
	
	correct2=new JButton("Doðru");
	correct2.setSize(150,50);
	correct2.setLocation(100,200);
	correct2.addActionListener(new Action());
	panel.add(correct2);
	
	pas2=new JButton("Pas");
	pas2.setSize(150,50);
	pas2.setLocation(250,200);
	pas2.addActionListener(new Action());
	panel.add(pas2);
	
	tabu2=new JButton("Tabu");
	tabu2.setSize(150,50);
	tabu2.setLocation(400,200);
	tabu2.addActionListener(new Action());
	panel.add(tabu2);
	
	timeout2=new JButton("Süre Bitti");
	timeout2.setSize(150,50);
	timeout2.setLocation(550,200);
	timeout2.addActionListener(new Action());
	panel.add(timeout2);
	
	frame.add(panel);
	frame.repaint();
		
	}

static void Wait1() {
	frame=new JFrame("Tabu");
	frame.setSize(1000, 1000);//frame boyutunu ayarlama
	frame.setVisible(true);//frame gosterme
	frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
	
	panel=new JPanel();
	panel.setSize(1000,1000);
	panel.setLocation(0, 0);
	panel.setLayout(null);
	
	group1score=new JLabel(group1+": "+group1Score);
	group1score.setSize(75,50);
	group1score.setLocation(30,90);
	panel.add(group1score);
	
	group2score=new JLabel(group2+": "+group2Score);
	group2score.setSize(75,50);
	group2score.setLocation(30,140);
	panel.add(group2score);

	start1=new JButton("Baþla");
	start1.setSize(150,50);
	start1.setLocation(400,200);
	start1.addActionListener(new Action());
	panel.add(start1);
	
	frame.add(panel);
	frame.repaint();
}

static void Wait2() {
	frame=new JFrame("Tabu");
	frame.setSize(1000, 1000);//frame boyutunu ayarlama
	frame.setVisible(true);//frame gosterme
	frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
	
	panel=new JPanel();
	panel.setSize(1000,1000);
	panel.setLocation(0, 0);
	panel.setLayout(null);
	
	group1score=new JLabel(group1+": "+group1Score);
	group1score.setSize(75,50);
	group1score.setLocation(30,90);
	panel.add(group1score);
	
	group2score=new JLabel(group2+": "+group2Score);
	group2score.setSize(75,50);
	group2score.setLocation(30,140);
	panel.add(group2score);

	start2=new JButton("Baþla");
	start2.setSize(150,50);
	start2.setLocation(400,200);
	start2.addActionListener(new Action());
	panel.add(start2);
	
	frame.add(panel);
	frame.repaint();
}

static class Action implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start1){
			group1=g1.getText();
			group2=g2.getText();
			frame.dispose();
			GameGroup1();
		}
		else if(e.getSource()==start2){
			frame.dispose();
			GameGroup2();
		}
		else if(e.getSource()==correct1) {
			frame.dispose();
			group1Score++;
			GameGroup1();
		}
		else if(e.getSource()==pas1) {
			if(pass==3) {
				
			}else {
				frame.dispose();
				pass++;
				GameGroup1();
			}
		}
		else if(e.getSource()==tabu1) {
			frame.dispose();
			if(group1Score!=0) {
				group1Score--;
			}
			GameGroup1();
		}
		else if(e.getSource()==correct2) {
			frame.dispose();
			group2Score++;
			GameGroup2();
		}
		else if(e.getSource()==pas2) {
			if(pass==3) {
				
			}else {
				frame.dispose();
				pass++;
				GameGroup2();
			}
		}
		else if(e.getSource()==tabu2) {
			frame.dispose();
			if(group2Score!=0) {
				group2Score--;
			}
			GameGroup2();
		}
		else if(e.getSource()==timeout1) {
			frame.dispose();
			pass=0;
			Wait2();
		}
		else if(e.getSource()==timeout2) {
			frame.dispose();
			pass=0;
			Wait1();
		}
	}
	}

}
