import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JButton;


public class ClassicHangmanQwerty extends javax.swing.JFrame {
int count=1;
int count2=9;
String org,s1,hist1,hist2;
int score=0;
boolean permit = true;
String x = "";
char x2;
char y;
String name="";
String password="";
String username="";
String concise_database1="First Blood-Rocky-Aviator-Inception-Shrek Forever After-Tangled-Despicable Me-Angels And Demons-The Hangover-Sherlock Holmes-Quantum Of Solace-The Simpsons Movie-Batman Begins-You Only Live Twice-The Incredibles-Octopussy-Meet The Fockers-Bruce Almighty-The Last Samurai-The Matrix Revolutions-Signs-Minority Report-The Mummy Returns-Hannibal-Catch Me If You Can-Quantum Of Solace-The Perfect Storm-The Sixth Sense-Rear Window-Godzilla-Saving Private Ryan-Twister-Living Daylights-The Nutty Professor-Jerry Maguire-Waterworld-Jumanji-Forrest Gump-The Flintstones-Schindlers List-The Firm-Cliffhanger-Philadelphia-Stolen-Basic Instinct-Bram Stokers Dracula-The Grey-The Addams Family-Scary Movie-The Grown Ups-Cocktail-Fiddler On The Roof-A Beautiful Mind-Beverly Hills Cop-Good Morning Vietnam-Live And Let Die-Leathal Weapon-The Village-The Departed-Blood Diamond-Shooter-Out Of Africa-The Edge-Sie Hard-Runaway Bride-Big-c!";
String concise_database2="Vertigo-The Shawshank Redemption-Behind Enemy Lines-Birds-Psycho-From Russia With Love-Diamonds Are Forever-The Abyss-Goldfinger-Skyfall-Gandhi-Ben Hur-The Prestige-Sturday Night Fever-Licence To Kill-Avatar-The Poltergeist-A View To A Kill-The First Knight-For Your Eyes Only-Enemy Of The State-The Rock-Moonraker-The Pink Panther-Bad Boys-Titanic-Shutter Island-Contact-The Rocketeer-Cowboys and Aliens-Starsky And Hutch-Black Swan-Unbreakable-c!";
String concise_database3="Afghanistan-Albania-Algeria-American Samoa-Andorra-Angola-Argentina-Australia-Austria-Azerbaijan-Bahamas-Bangladesh-Belgium-Bermuda-Bolivia-Bhutan-Brazil-Bulgaria-Canada-Chile-China-Costa Rica-Cuba-Cambodia-Cyprus-Czech Republic-Denmark-Djibouti-Dominica-Egypt-Ecuador-Ethiopia-Fiji-France-Finland-Germany-Grenada-Ghana-Georgia-Greece-Greenland-Honduras-Hungary-Iceland-India-Indonesia-Iran-Iraq-Ireland-Israel-Italy-Jamaica-Japan-Jordan-Kazakstan-Kenya-Kuwait-Laos-Liberia-Lebanon-Luxembourg-Madagascar-Malaysia-Maldives-Mexico-Mozambique-Myanmar-Namibia-Nepal-Netherlands-Newzealand-Nigeria-Norway-Oman-Pakistan-Panama-Paraguay-Peru-Philippines-Poland-Portugal-Qatar-Queensland-Romania-Russia-Sanmarino-Saudi Arabia-Senegal-Slovakia-South Africa-Singapore-Spain-Sri Lanka-Sudan-Sweden-Switzerland-Syria-Taiwan-Tanzania-Thailand-Turkey-Turkmenistan-United Arab Emirates-Uganda-United States-Uruguay-Uzbekistan-Vietnam-Venezuela-West Indies-Yemen-Yugoslavia-Zambia-Zimbabwe-c!";
   
public ClassicHangmanQwerty() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        iUnderstand = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TakeTheChallenge = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        New = new javax.swing.JButton();
        Rules = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        Highscores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jFrame1.setMinimumSize(new java.awt.Dimension(915, 510));
        jFrame1.getContentPane().setLayout(null);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("The Rules...");
        jFrame1.getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 60, 150, 33);

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to Classic Hangman!\n\nHangman is a popular game among students in various schools and colleges.\n\nThe aim of this game is to guess the name of the given movie/country which is present \nin the form of dashes.\n\nPlayers have to start by clicking 'Take The Challenge!'\nA series of blank spaces appear.\nNext, the player has to click on the desired button in the SmartPad. \n(Note: In this version, we have enabled the keyboard to function as a SmartPad too so \nthe keyboard can be used as well.)\nIf the letter entered is present in the name,it will be shown, giving the player\na better idea of name of the movie/country.\nIf not, one chance will be reduced (out of a total nine), and the player will then be one \nstep closer to being hanged.\nPlayers have to guess the name before they run out of these 9 \nchances.\n\nIf the player does so, then he/she can play another round.\nIf the player gives 9 wrong answers, the game will end. \nThe score will increase each time the player guesses the name correctly.\n\nThe score increases by 10 minus the number of wrong answers given each time the whole\nname has been guessed.\n\nEnjoy! \n\n");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        jFrame1.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 100, 700, 260);

        iUnderstand.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        iUnderstand.setForeground(new java.awt.Color(255, 255, 0));
        iUnderstand.setMnemonic('u');
        iUnderstand.setText("iUnderstand");
        iUnderstand.setContentAreaFilled(false);
        iUnderstand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iUnderstandActionPerformed(evt);
            }
        });
        iUnderstand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        jFrame1.getContentPane().add(iUnderstand);
        iUnderstand.setBounds(650, 370, 170, 38);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb5.png"))); // NOI18N
        jFrame1.getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 7, 930, 463);

        jFrame2.setMinimumSize(new java.awt.Dimension(920, 510));
        jFrame2.getContentPane().setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36));
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("The Hall of Fame");
        jFrame2.getContentPane().add(jLabel17);
        jLabel17.setBounds(310, 60, 258, 48);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24));
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Go Back");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton3);
        jButton3.setBounds(720, 380, 160, 50);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crown2.PNG"))); // NOI18N
        jFrame2.getContentPane().add(jLabel18);
        jLabel18.setBounds(380, 120, 200, 120);

        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 0, 28));
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("jLabel19");
        jFrame2.getContentPane().add(jLabel19);
        jLabel19.setBounds(400, 220, 250, 80);

        jLabel20.setFont(new java.awt.Font("Tempus Sans ITC", 0, 33));
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("jLabel20");
        jFrame2.getContentPane().add(jLabel20);
        jLabel20.setBounds(390, 230, 180, 130);

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 0, 26));
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText("jLabel21");
        jFrame2.getContentPane().add(jLabel21);
        jLabel21.setBounds(170, 280, 190, 50);

        jLabel22.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30));
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setText("jLabel22");
        jFrame2.getContentPane().add(jLabel22);
        jLabel22.setBounds(160, 310, 130, 50);

        jLabel23.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24));
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText("jLabel23");
        jFrame2.getContentPane().add(jLabel23);
        jLabel23.setBounds(620, 290, 200, 70);

        jLabel24.setFont(new java.awt.Font("Tempus Sans ITC", 0, 28));
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("jLabel24");
        jFrame2.getContentPane().add(jLabel24);
        jLabel24.setBounds(610, 320, 110, 60);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb5.png"))); // NOI18N
        jFrame2.getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 10, 980, 460);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(915, 510));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Classic Hangman 4.0™");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 50, 501, 50);

        TakeTheChallenge.setBackground(new java.awt.Color(204, 204, 204));
        TakeTheChallenge.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36));
        TakeTheChallenge.setForeground(new java.awt.Color(255, 255, 0));
        TakeTheChallenge.setMnemonic('t');
        TakeTheChallenge.setText("Take the Challenge!");
        TakeTheChallenge.setBorder(null);
        TakeTheChallenge.setContentAreaFilled(false);
        TakeTheChallenge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeTheChallengeActionPerformed(evt);
            }
        });
        TakeTheChallenge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(TakeTheChallenge);
        TakeTheChallenge.setBounds(290, 170, 330, 40);
        TakeTheChallenge.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24));
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 140, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16));
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Wrong Answers Left:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 310, 170, 22);
        jLabel5.setVisible(false);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16));
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("9");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 310, 30, 22);
        jLabel6.setVisible(false);

        Exit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        Exit.setForeground(new java.awt.Color(255, 255, 0));
        Exit.setMnemonic('e');
        Exit.setText("Exit");
        Exit.setBorder(null);
        Exit.setContentAreaFilled(false);
        Exit.setFocusable(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(720, 370, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Score:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 330, 80, 25);
        jLabel7.setVisible(false);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16));
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("0");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 330, 40, 22);
        jLabel8.setVisible(false);

        New.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        New.setForeground(new java.awt.Color(255, 255, 0));
        New.setMnemonic('n');
        New.setText("New");
        New.setBorder(null);
        New.setContentAreaFilled(false);
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        New.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(New);
        New.setBounds(630, 370, 90, 30);
        New.setVisible(false);

        Rules.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36));
        Rules.setForeground(new java.awt.Color(255, 255, 0));
        Rules.setMnemonic('r');
        Rules.setText("Rules");
        Rules.setBorder(null);
        Rules.setContentAreaFilled(false);
        Rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesActionPerformed(evt);
            }
        });
        getContentPane().add(Rules);
        Rules.setBounds(400, 230, 120, 30);
        Rules.setVisible(false);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        jLabel9.setText("Classic Hangman developed by Shreyans Sheth, Anirudh Deshpande & Abhishek Rao");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 420, 550, 30);

        jButton8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("a");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(620, 120, 50, 30);
        jButton8.setVisible(false);

        jButton9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("b");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(670, 120, 50, 30);
        jButton9.setVisible(false);

        jButton10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("c");
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(720, 120, 50, 30);
        jButton10.setVisible(false);

        jButton11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("d");
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(770, 120, 50, 30);
        jButton11.setVisible(false);

        jButton12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("e");
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(620, 150, 50, 30);
        jButton12.setVisible(false);

        jButton13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("f");
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(670, 150, 50, 30);
        jButton13.setVisible(false);

        jButton14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("g");
        jButton14.setBorder(null);
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(720, 150, 50, 30);
        jButton14.setVisible(false);

        jButton15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("h");
        jButton15.setBorder(null);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(770, 150, 50, 30);
        jButton15.setVisible(false);

        jButton16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("i");
        jButton16.setBorder(null);
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(620, 180, 50, 30);
        jButton16.setVisible(false);

        jButton17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("j");
        jButton17.setBorder(null);
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(670, 180, 50, 30);
        jButton17.setVisible(false);

        jButton18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("k");
        jButton18.setBorder(null);
        jButton18.setContentAreaFilled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(720, 180, 50, 30);
        jButton18.setVisible(false);

        jButton19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("l");
        jButton19.setBorder(null);
        jButton19.setContentAreaFilled(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(770, 180, 50, 30);
        jButton19.setVisible(false);

        jButton20.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("m");
        jButton20.setBorder(null);
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(620, 210, 55, 30);
        jButton20.setVisible(false);

        jButton21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("n");
        jButton21.setBorder(null);
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(670, 210, 50, 30);
        jButton21.setVisible(false);

        jButton22.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("o");
        jButton22.setBorder(null);
        jButton22.setContentAreaFilled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(720, 210, 50, 30);
        jButton22.setVisible(false);

        jButton23.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("p");
        jButton23.setBorder(null);
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(770, 210, 50, 30);
        jButton23.setVisible(false);

        jButton24.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("q");
        jButton24.setBorder(null);
        jButton24.setContentAreaFilled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton24);
        jButton24.setBounds(620, 240, 50, 30);
        jButton24.setVisible(false);

        jButton25.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("r");
        jButton25.setBorder(null);
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton25);
        jButton25.setBounds(670, 240, 50, 30);
        jButton25.setVisible(false);

        jButton26.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("s");
        jButton26.setBorder(null);
        jButton26.setContentAreaFilled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton26);
        jButton26.setBounds(720, 240, 50, 30);
        jButton26.setVisible(false);

        jButton27.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("t");
        jButton27.setBorder(null);
        jButton27.setContentAreaFilled(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton27);
        jButton27.setBounds(770, 240, 50, 30);
        jButton27.setVisible(false);

        jButton28.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("u");
        jButton28.setBorder(null);
        jButton28.setContentAreaFilled(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton28);
        jButton28.setBounds(620, 270, 50, 30);
        jButton28.setVisible(false);

        jButton29.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("v");
        jButton29.setBorder(null);
        jButton29.setContentAreaFilled(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton29);
        jButton29.setBounds(670, 270, 50, 30);
        jButton29.setVisible(false);

        jButton30.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("w");
        jButton30.setBorder(null);
        jButton30.setContentAreaFilled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton30);
        jButton30.setBounds(710, 270, 60, 30);
        jButton30.setVisible(false);

        jButton31.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("x");
        jButton31.setBorder(null);
        jButton31.setContentAreaFilled(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton31);
        jButton31.setBounds(770, 270, 50, 30);
        jButton31.setVisible(false);

        jButton32.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("y");
        jButton32.setBorder(null);
        jButton32.setContentAreaFilled(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton32);
        jButton32.setBounds(670, 300, 50, 30);
        jButton32.setVisible(false);

        jButton33.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("z");
        jButton33.setBorder(null);
        jButton33.setContentAreaFilled(false);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awesome(evt);
            }
        });
        jButton33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton33);
        jButton33.setBounds(720, 300, 50, 30);
        jButton33.setVisible(false);

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 200, 280, 40);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Please Enter Your MYSQL Username and Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 150, 390, 25);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(490, 210, 150, 20);

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16));
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("Username ('root' by default):");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(260, 200, 210, 30);

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16));
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Password ('root' by default):");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(260, 260, 200, 22);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Ok");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 310, 100, 40);

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("MYSQL Prompt");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(370, 120, 180, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(490, 260, 150, 20);

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                awesomer(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 20, 1, 1);

        Highscores.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36));
        Highscores.setForeground(new java.awt.Color(255, 255, 0));
        Highscores.setText("Highscores");
        Highscores.setBorder(null);
        Highscores.setContentAreaFilled(false);
        Highscores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighscoresActionPerformed(evt);
            }
        });
        getContentPane().add(Highscores);
        Highscores.setBounds(10, 370, 250, 40);
        Highscores.setVisible(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 40, 260, 390);
        jLabel2.setVisible(false);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb5.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 1000, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public void generateName() {
        
        jButton8.grabFocus();
        
       jButton8.setFocusable(true);
        jButton9.setFocusable(true);
        jButton10.setFocusable(true);
        jButton11.setFocusable(true);
        jButton12.setFocusable(true);
        jButton13.setFocusable(true); 
        jButton14.setFocusable(true);
        jButton15.setFocusable(true);
        jButton16.setFocusable(true);
        jButton17.setFocusable(true);
        jButton18.setFocusable(true);
        jButton19.setFocusable(true);
        jButton20.setFocusable(true);
        jButton21.setFocusable(true);
        jButton22.setFocusable(true);
        jButton23.setFocusable(true);
        jButton24.setFocusable(true);
        jButton25.setFocusable(true);
        jButton26.setFocusable(true);
        jButton27.setFocusable(true); 
        jButton28.setFocusable(true); 
        jButton29.setFocusable(true); 
        jButton30.setFocusable(true);
        jButton31.setFocusable(true);
        jButton32.setFocusable(true); 
        jButton33.setFocusable(true);
        
        permit = true;
        
jLabel8.setText(""+score);    
jLabel2.setVisible(true);
jLabel4.setVisible(true);
jLabel5.setVisible(true);
jLabel6.setVisible(true);
jLabel7.setVisible(true);
jLabel8.setVisible(true);

jLabel11.setVisible(true);
jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));

TakeTheChallenge.setVisible(false);
Rules.setVisible(false);
Highscores.setVisible(true);
New.setVisible(true);

               
       jLabel4.setVisible(true);
       jLabel11.setVisible(true);
       
       jButton8.setVisible(true);
       jButton9.setVisible(true);
       jButton10.setVisible(true);
       jButton11.setVisible(true);
       jButton12.setVisible(true);
       jButton13.setVisible(true);
       jButton14.setVisible(true);
       jButton15.setVisible(true);
       jButton16.setVisible(true);
       jButton17.setVisible(true);
       jButton18.setVisible(true);
       jButton19.setVisible(true);
       jButton20.setVisible(true);
       jButton21.setVisible(true);
       jButton22.setVisible(true);
       jButton23.setVisible(true);
       jButton24.setVisible(true);
       jButton25.setVisible(true);
       jButton26.setVisible(true);
       jButton27.setVisible(true);
       jButton28.setVisible(true);
       jButton29.setVisible(true);
       jButton30.setVisible(true);
       jButton31.setVisible(true);
       jButton32.setVisible(true);
       jButton33.setVisible(true);
       
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
       jButton10.setEnabled(true);
       jButton11.setEnabled(true);
       jButton12.setEnabled(true);
       jButton13.setEnabled(true);
       jButton14.setEnabled(true);
       jButton15.setEnabled(true);
       jButton16.setEnabled(true);
       jButton17.setEnabled(true);
       jButton18.setEnabled(true);
       jButton19.setEnabled(true);
       jButton20.setEnabled(true);
       jButton21.setEnabled(true);
       jButton22.setEnabled(true);
       jButton23.setEnabled(true);
       jButton24.setEnabled(true);
       jButton25.setEnabled(true);
       jButton26.setEnabled(true);
       jButton27.setEnabled(true);
       jButton28.setEnabled(true);
       jButton29.setEnabled(true);
       jButton30.setEnabled(true);
       jButton31.setEnabled(true);
       jButton32.setEnabled(true);
       jButton33.setEnabled(true);


       jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png")));
       count=1;
       count2=9;
       jLabel6.setText("9");
        try
 {
 Class.forName("java.sql.DriverManager");
 Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Classic_Hangman",username,password);
 Statement stmt=(Statement)con.createStatement();
 int n=((int)((Math.random())*214))+1;
 String query="select movie from hangman where no="+n+";";
 if (n>100)
 {
     jLabel4.setText("Country");
 }
 else
 {jLabel4.setText("Movie");
 }
 ResultSet rs=stmt.executeQuery(query);
 rs.next();
 org=rs.getString("movie");
 
 s1="";
 hist1="";
 hist2="";
 for(int i=0;i<org.length();i++)
 { if(org.charAt(i)!=' ')
 {
     hist1=hist1+"-";
 }
    else
 {
     hist1=hist1+" ";
 }
 }
 hist2=hist1;
 jLabel11.setText(hist2);
 }
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(null,e);
 }
   }   
            
    private void TakeTheChallengeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeTheChallengeActionPerformed
       generateName();
       jButton8.grabFocus();
    }//GEN-LAST:event_TakeTheChallengeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
     int exit;
        exit = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?");
        if (exit == JOptionPane.YES_OPTION)
            System.exit(0);
            
    }//GEN-LAST:event_ExitActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
     int newgame;
        if(count2==0)
        {
         score=0;
         generateName();
         jButton8.grabFocus();
        }
     else
        {
        newgame = JOptionPane.showConfirmDialog(null,"Are you sure you want to start a new game?" + "\n" + " Your score will be deleted.");
        if (newgame == JOptionPane.YES_OPTION)
           { 
            score=0;
            generateName();
            jButton8.grabFocus();
           }
        }
    }//GEN-LAST:event_NewActionPerformed

    private void checkHighScore(){
         try
 {
 Class.forName("java.sql.DriverManager");
 Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Classic_Hangman",username,password);
 Statement stmt=(Statement)con.createStatement();
 
 String query1 = "select no,name,sscore from highscore;";
 ResultSet rs = stmt.executeQuery(query1);
 rs.next();
 int frankerscore=Integer.parseInt(rs.getString("sscore"));
 String frankername=rs.getString("name");
 rs.next();
 int srankerscore=Integer.parseInt(rs.getString("sscore"));
 String srankername=rs.getString("name");
 rs.next();
 int trankerscore=Integer.parseInt(rs.getString("sscore"));
 String trankername=rs.getString("name");
 boolean rank_attained= false;
 if(score>trankerscore)
 {
     rank_attained=true;
 }
 if(rank_attained==true){
     JOptionPane.showMessageDialog(null, "You have made a new High Score!");
    
 name = JOptionPane.showInputDialog(null,"Please Enter Your Name If You Want To:");
 stmt.execute("delete from highscore;");
 if(score>=frankerscore)
 {
     trankerscore=srankerscore;
     trankername=srankername;
     srankerscore=frankerscore;
     srankername=frankername;
     frankerscore=score;
     frankername=name;
 }
 else
 {
 if(score>=srankerscore)
 {
     trankerscore=srankerscore;
     trankername=srankername;
     srankerscore=score;
     srankername=name;
 }
 else
 {
 if(score>trankerscore)
 {
     trankerscore=score;
     trankername=name;
 }
 }
 }
 
 stmt.execute("delete from highscore;");
 stmt.executeUpdate("insert into highscore values('1','"+frankername+"',"+frankerscore+",'"+frankerscore+"');");
 stmt.executeUpdate("insert into highscore values('2','"+srankername+"',"+srankerscore+",'"+srankerscore+"');");
 stmt.executeUpdate("insert into highscore values('3','"+trankername+"',"+trankerscore+",'"+trankerscore+"');");
 JOptionPane.showMessageDialog(null,"Congratulations "+name+"!");
 }
 }
  catch(Exception e)
  {
       JOptionPane.showMessageDialog(null,e);
  }
    }
    
    
    

    
    private void RulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RulesActionPerformed
   jFrame1.setVisible(true);
    }//GEN-LAST:event_RulesActionPerformed

    private void iUnderstandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iUnderstandActionPerformed
   jFrame1.setVisible(false);
    }//GEN-LAST:event_iUnderstandActionPerformed

    private void awesome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awesome
     x = evt.getActionCommand();
((JButton)(evt.getSource())).setVisible(false);
((JButton)(evt.getSource())).setEnabled(false);
        y = x.charAt(0);
        x2= (x.toUpperCase()).charAt(0);
          if (permit==true)
    {
        try
{
 s1="";
boolean flag=false;
for(int i=0;i<org.length();i++)
{
    if((org.charAt(i)==y)||(org.charAt(i)==x2))
    {   flag=true;
        s1=s1+org.charAt(i);
    }
    else
    {
        s1=s1+"-";
    }
}
hist2=hist1;
hist1="";
for(int i=0;i<org.length();i++)
{
    if(hist2.charAt(i)!='-')
    {
        hist1=hist1+hist2.charAt(i);
    }
    else
    {
    
    if(s1.charAt(i)!='-')
    {
        hist1=hist1+s1.charAt(i);
    }
    else
    {
        hist1=hist1+"-";
    }

    }
}
    
jLabel11.setText(hist1);
if(flag==false)
{ count=count+1;
count2=count2-1;
jLabel6.setText(""+count2);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+count+".png")));
if(count==10)
{
    JOptionPane.showMessageDialog(null,"You lose! Better luck next time! >:D");
    
    permit = false;
    
    jLabel11.setFont(new java.awt.Font("Cooper Black", 1, 28));
    jLabel11.setText(org);
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jLabel7.setVisible(false);
    jLabel8.setVisible(false);
    
       jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/y-u-no-guy.jpg")));
       JOptionPane.showMessageDialog(null,"Your final score: "+score);
       jLabel2.setVisible(false);
       jLabel4.setVisible(false);
       
    New.setEnabled(true);
    
    permit = false;
    
   checkHighScore();
   
 
     
}
}
if(hist1.equals(org))
{
    JOptionPane.showMessageDialog(null,"Congrats! :D");
    jLabel4.setVisible(false);
    jLabel11.setVisible(false);
    
    int wrongs=9-(Integer.parseInt(jLabel6.getText()));
    score=score+(10-wrongs);
    jLabel8.setText(""+score);
    if(Integer.parseInt(jLabel6.getText())==9)
    {   jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/obama.jpg")));
        JOptionPane.showMessageDialog(null,"Whoa!!!You didn't give a single wrong answer!");
        
        jLabel4.setVisible(false);
        jLabel11.setVisible(false);
    }
    
    permit =false;
    
    generateName(); 
    jButton8.grabFocus();
}
}
        
catch(Exception e)
{
    
}
    }        
       
    }//GEN-LAST:event_awesome
     
    private void awesomer(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_awesomer
   char r = evt.getKeyChar();
    if(r==' '){
        jButton8.setFocusable(false);
        jButton9.setFocusable(false);
        jButton10.setFocusable(false);
        jButton11.setFocusable(false);
        jButton12.setFocusable(false);
        jButton13.setFocusable(false); 
        jButton14.setFocusable(false);
        jButton15.setFocusable(false);
        jButton16.setFocusable(false);
        jButton17.setFocusable(false);
        jButton18.setFocusable(false);
        jButton19.setFocusable(false);
        jButton20.setFocusable(false);
        jButton21.setFocusable(false);
        jButton22.setFocusable(false);
        jButton23.setFocusable(false);
        jButton24.setFocusable(false);
        jButton25.setFocusable(false);
        jButton26.setFocusable(false);
        jButton27.setFocusable(false); 
        jButton28.setFocusable(false); 
        jButton29.setFocusable(false); 
        jButton30.setFocusable(false);
        jButton31.setFocusable(false);
        jButton32.setFocusable(false); 
        jButton33.setFocusable(false);          
    }
    else{
        jButton8.setFocusable(true);
        jButton9.setFocusable(true);
        jButton10.setFocusable(true);
        jButton11.setFocusable(true);
        jButton12.setFocusable(true);
        jButton13.setFocusable(true); 
        jButton14.setFocusable(true);
        jButton15.setFocusable(true);
        jButton16.setFocusable(true);
        jButton17.setFocusable(true);
        jButton18.setFocusable(true);
        jButton19.setFocusable(true);
        jButton20.setFocusable(true);
        jButton21.setFocusable(true);
        jButton22.setFocusable(true);
        jButton23.setFocusable(true);
        jButton24.setFocusable(true);
        jButton25.setFocusable(true);
        jButton26.setFocusable(true);
        jButton27.setFocusable(true); 
        jButton28.setFocusable(true); 
        jButton29.setFocusable(true); 
        jButton30.setFocusable(true);
        jButton31.setFocusable(true);
        jButton32.setFocusable(true); 
        jButton33.setFocusable(true);
    }
         if(r=='a'||r=='A'){jButton8.doClick();}
    else if(r=='b'||r=='B'){jButton9.doClick();}
    else if(r=='c'||r=='C'){jButton10.doClick();}
    else if(r=='d'||r=='D'){jButton11.doClick();}
    else if(r=='e'||r=='E'){jButton12.doClick();}
    else if(r=='f'||r=='F'){jButton13.doClick();}
    else if(r=='g'||r=='G'){jButton14.doClick();}
    else if(r=='h'||r=='H'){jButton15.doClick();}
    else if(r=='i'||r=='I'){jButton16.doClick();}
    else if(r=='j'||r=='J'){jButton17.doClick();}
    else if(r=='k'||r=='K'){jButton18.doClick();}
    else if(r=='l'||r=='L'){jButton19.doClick();}
    else if(r=='m'||r=='M'){jButton20.doClick();}
    else if(r=='n'||r=='N'){jButton21.doClick();}
    else if(r=='o'||r=='O'){jButton22.doClick();}
    else if(r=='p'||r=='P'){jButton23.doClick();}
    else if(r=='q'||r=='Q'){jButton24.doClick();}
    else if(r=='r'||r=='R'){jButton25.doClick();}
    else if(r=='s'||r=='S'){jButton26.doClick();}
    else if(r=='t'||r=='T'){jButton27.doClick();}
    else if(r=='u'||r=='U'){jButton28.doClick();}
    else if(r=='v'||r=='V'){jButton29.doClick();}
    else if(r=='w'||r=='W'){jButton30.doClick();}
    else if(r=='x'||r=='X'){jButton31.doClick();}
    else if(r=='y'||r=='Y'){jButton32.doClick();}
    else if(r=='z'||r=='Z'){jButton33.doClick();}
    else if(r==' '){jButton2.doClick();}                      
   
    }//GEN-LAST:event_awesomer
   
    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        password=jPasswordField1.getText();
        username=jTextField1.getText();
        boolean check_database=false,user_permission=false;
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/",username,password);
            Statement stmt=(Statement)con.createStatement();
            try
            {
            stmt.execute("create database Classic_Hangman;");
            stmt.execute("use Classic_Hangman;");
            stmt.execute("create table highscore(no varchar(3),name varchar(50),score integer(5),sscore varchar(5));");
            stmt.execute("create table hangman(no int(3),movie varchar(1000));");
            int ask;
            ask = JOptionPane.showConfirmDialog(null,"The Classic Hangman database does not exist. Do you wish to allow the program to create the database in MYSQL?");
            if (ask == JOptionPane.YES_OPTION)
            {
            user_permission=true;
            JOptionPane.showMessageDialog(null,"Classic Hangman shall now create the database. This process usually takes about 10 seconds. Please wait after clicking OK.");
            }
            else
            {
            stmt.execute("drop database classic_hangman;");
            }
            }
            catch(Exception e)
            {
            check_database=true;          
            }
            if((check_database==false)&&(user_permission==true))
            {
            String query3 = "insert into highscore values('1','cpu1',3,'3');";
            stmt.executeUpdate(query3);
            query3="insert into highscore values('2','cpu2',2,'2');";
            stmt.executeUpdate(query3);
            query3="insert into highscore values('3','cpu3',1,'1');";
            stmt.executeUpdate(query3);
            String query;
            String word="";
            int word_count=1;
            for(int i=0;concise_database1.charAt(i)!='!';i++)
            {   if(concise_database1.charAt(i)!='-')
            {
                word=word+concise_database1.charAt(i);
            }
               else
            {
                query="insert into hangman values("+word_count+",'"+word+"');";
                stmt.executeUpdate(query);
                word_count=word_count+1;
                word="";
            }
            }
            word="";
            for(int i=0;concise_database2.charAt(i)!='!';i++)
            {   if(concise_database2.charAt(i)!='-')
            {
                word=word+concise_database2.charAt(i);
            }
               else
            {
                query="insert into hangman values("+word_count+",'"+word+"');";
                stmt.executeUpdate(query);
                word_count=word_count+1;
                word="";
            }
            }
            word="";
            for(int i=0;concise_database3.charAt(i)!='!';i++)
            {   if(concise_database3.charAt(i)!='-')
            {
                word=word+concise_database3.charAt(i);
            }
               else
            {
                query="insert into hangman values("+word_count+",'"+word+"');";
                stmt.executeUpdate(query);
                word_count=word_count+1;
                word="";
            }
            }
            check_database=true;
            JOptionPane.showMessageDialog(null,"Congratulations! Classic Hangman has successfully created the database.");
            }
    }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null,"The username or password you have entered is incorrect. Please check them. Also,do check for any spaces you may have left accidentally.");
        }
        if(check_database==true)
        {
        jLabel12.setVisible(false);
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jPasswordField1.setVisible(false);
        jLabel15.setVisible(false);
        jLabel14.setVisible(false);
        jButton1.setVisible(false);
        TakeTheChallenge.setVisible(true);
        Highscores.setVisible(true);
        Exit.setVisible(true);
        Rules.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
   
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Exit.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void HighscoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighscoresActionPerformed
    jFrame2.setVisible(true);
    try
    {
    Class.forName("java.sql.DriverManager");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Classic_hangman",username,password);
    Statement stmt=(Statement)con.createStatement();
    String highestscorersquery="select name,sscore from highscore;";
    ResultSet rs=stmt.executeQuery(highestscorersquery);
    rs.next();
    String frankername=rs.getString("name");
    String frankerscore=rs.getString("sscore");
    jLabel19.setText(""+frankername);
    jLabel20.setText(""+frankerscore);
    rs.next();
    String srankername=rs.getString("name");
    String srankerscore=rs.getString("sscore");
    jLabel21.setText(""+srankername);
    jLabel22.setText(""+srankerscore);
    rs.next();
    String trankername=rs.getString("name");
    String trankerscore=rs.getString("sscore");
    jLabel23.setText(""+trankername);
    jLabel24.setText(""+trankerscore);
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_HighscoresActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jFrame2.setVisible(false);
    New.grabFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassicHangmanQwerty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassicHangmanQwerty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassicHangmanQwerty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassicHangmanQwerty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
              ClassicHangmanQwerty input=  new ClassicHangmanQwerty();
            input.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Highscores;
    private javax.swing.JButton New;
    private javax.swing.JButton Rules;
    private javax.swing.JButton TakeTheChallenge;
    private javax.swing.JButton iUnderstand;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
