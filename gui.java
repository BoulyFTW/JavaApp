//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.plaf.PanelUI;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class gui {
    public static void main(String args[]) 
    {
        //THE FRAME ITSELF
        JFrame F = new JFrame("Employee's account selection");
        F.setSize(1300,500);
        F.setVisible(true);
        F.setDefaultCloseOperation(F.EXIT_ON_CLOSE);

        //THE PANEL
        JPanel P = new JPanel();
        P.setLayout(null);
        F.add(P);
        
        //THE EXIT BUTTON
        Button Exit = new Button("EXIT");
        Exit.setBounds(20,10,100,40);
        P.add(Exit);
        //TELLS THE EXIT BUTTON TO CLOSE THE APP WHEN PRESSED
        Exit.addActionListener(e -> System.exit(0));

        //Welcome LABEL
        Label Welcome = new Label("Hello and welcome to pizza hot employee's panel selection, please login to one of these 2 accounts or signup: ");
        Welcome.setBounds(20,50,1200,40);
        Welcome.setFont(new Font("Arial", Font.PLAIN, 20));
        P.add(Welcome);

        //SIGNUP BUTTON
        Button Signup = new Button("Signup");
        Signup.setBounds(20, 100, 100, 40);
        P.add(Signup);

        //A METHOD THAT INCLUDES THE WHOLE SIGNUP PAGE AND MAKES THE SIGNUP BUTTON FUNCTION
        Signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //SIGNUP FRAME
                JFrame SignupF = new JFrame("Signup Page");
                SignupF.setSize(1000,500);
                SignupF.setVisible(true);
                SignupF.setDefaultCloseOperation(SignupF.EXIT_ON_CLOSE);

                F.dispose();

                //THE PANEL FOR THE SIGNUP PAGE
                JPanel SUP = new JPanel();
                SUP.setLayout(null);
                SignupF.add(SUP);

                //BACK BUTTON
                Button back3 = new Button("Back");
                back3.setBounds(20, 20, 40, 40);;
                SUP.add(back3);

                //METHOD THAT MAKES THE BACK BUTTON FUNCTION
                back3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        F.setVisible(true);
                        SignupF.dispose();
                    }
                });

                //LABEL FOR INFO ASK
                Label info3 = new Label("Sign Up");
                info3.setFont(new Font("Arial", Font.PLAIN, 15));
                info3.setBounds(450, 20, 300, 40);
                SUP.add(info3);
                
                //NAME LABEL RIGHT BESIDE THE NAME TEXTFIELD
                Label NName = new Label("Name: ");
                NName.setFont(new Font("Arial", Font.PLAIN, 13));
                NName.setBounds(280, 80, 100, 40);
                SUP.add(NName);

                TextField Name = new TextField();
                Name.setBounds(380, 80, 200, 40);
                SUP.add(Name);

                //BD LABEL RIGHT BESIDE THE BIRTHDAY DROP DOWN BUTTONS
                Label BD = new Label("BirthDay: ");
                BD.setFont(new Font("Arial", Font.PLAIN, 13));
                BD.setBounds(280, 140, 60, 20);
                SUP.add(BD);

                //A DROP DOWN BUTTON FOR THE MONTH
                String[] choices = { "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug", "Sep","Oct","Nov","Dec"};
                JComboBox<String> BDM = new JComboBox<String>(choices);
                BDM.setBounds(380, 140, 60, 20);
                BDM.setVisible(true);
                SUP.add(BDM);

                //A DROP DOWN BUTTON FOR THE DAY OF THE MONTH
                String[] choices1 = { "1","2", "3","4", "5", "6", "7", "8","9","10","11","12","13","14","15","16","17","18","19","20","21"
                ,"22", "23", "24", "25","26","27","28","29","30","31"};
                JComboBox<String> BDD = new JComboBox<String>(choices1);
                BDD.setBounds(450, 140, 60, 20);
                BDD.setVisible(true);
                SUP.add(BDD);

                //A DROP DOWN BUTTON FOR THE YEAR
                String[] choices2 = { "1990","1991", "1992","1993", "1994", "1995", "1996", "1997","1998","1999","2000","2001","2002",
                "2003","2004","2005","2006","2007","2008","2009","2010","2011", "2012", "2013", "1014","2015","2016","2017","2018"
                ,"2019","2020","2021","2022","2023"};
                JComboBox<String> BDY = new JComboBox<String>(choices2);
                BDY.setBounds(520, 140, 60, 20);
                BDY.setVisible(true);
                SUP.add(BDY);

                //EMAIL LABEL RIGHT BESIDE THE EMAIL TEXTFIELD
                Label Email3 = new Label("New Email: ");
                Email3.setFont(new Font("Arial", Font.PLAIN, 13));
                Email3.setBounds(280, 180, 100, 40);
                SUP.add(Email3);

                //EMAIL TEXTFIELD FOR CARMEN LOGIN PAGE
                TextField emailTF3 = new TextField();
                emailTF3.setBounds(380, 180, 200, 40);
                SUP.add(emailTF3);

                //PASSWORD LABEL RIGHT BESIDE THE PASSWORD TEXTFIELD
                Label pass3 = new Label("New Password: ");
                pass3.setBounds(260,230,100,40);
                SUP.add(pass3);

                //PASS TEXTFIELD FOR CARMEN LOGIN PAGE
                TextField passTF3 = new TextField();
                passTF3.setBounds(380, 230, 200, 40);
                SUP.add(passTF3);

                //THE LOGIN BUTTON FOR CARMEN LOGIN PAGE
                Button SignupBtn = new Button("Sign Up");
                SignupBtn.setBounds(425,300,100,30);
                SUP.add(SignupBtn);

                

                SignupBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(Name.getText().equals("") || pass3.getText().equals("") || Email3.getText().equals(""))
                        {
                            JFrame Error = new JFrame("ERROR");
                            Error.setSize(500,200);
                            Error.setVisible(true);

                            JPanel EP = new JPanel();
                            EP.setLayout(null);
                            Error.add(EP);

                            Label EL = new Label("NOT ENOUGH INFO WAS GIVEN");
                            EL.setFont(new Font("Arial", Font.PLAIN, 15));
                            EL.setBounds(120, 10, 500, 100);
                            EP.add(EL);
                        }
                        else
                        {
                            SignupF.dispose();
                            F.setVisible(true);

                            Label NU = new Label(Name.getText());
                            NU.setFont(new Font("Arial", Font.PLAIN, 15));
                            NU.setBounds(20, 260, 80, 30);
                            P.add(NU);
                        }
                    }
                });
            }
        });

        //Carmen's acc and its login button and remove button
        Label CarmensAcc = new Label("Carmen");
        CarmensAcc.setBounds(20,160,80,30);
        CarmensAcc.setFont(new Font("Arial", Font.PLAIN, 15));
        P.add(CarmensAcc);                                                                                                            

        Button login1 = new Button("Login");
        login1.setBounds(100,160,50,30);
        P.add(login1);

        login1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //CARMENS ACCOUNT LOGIN FRAME
                JFrame CarmenLogin = new JFrame("Carmen's Login Page");
                CarmenLogin.setSize(1000,500);
                CarmenLogin.setVisible(true);
                CarmenLogin.setDefaultCloseOperation(CarmenLogin.EXIT_ON_CLOSE);

                F.dispose();

                //THE PANEL FOR CARMENS ACC
                JPanel PFCL = new JPanel();
                PFCL.setLayout(null);
                CarmenLogin.add(PFCL);

                //BACK BUTTON
                Button back1 = new Button("Back");
                back1.setBounds(20, 20, 40, 40);;
                PFCL.add(back1);

                //METHOD THAT MAKES THE BACK BUTTON FUNCTION
                back1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        F.setVisible(true);
                        CarmenLogin.dispose();
                    }
                });

                //LABEL FOR INFO ASK
                Label info1 = new Label("Enter The Email and The Password");
                info1.setFont(new Font("Arial", Font.PLAIN, 15));
                info1.setBounds(350, 130, 300, 40);
                PFCL.add(info1);
                
                //EMAIL LABEL RIGHT BESIDE THE EMAIL TEXTFIELD
                Label Email1 = new Label("Email: ");
                Email1.setFont(new Font("Arial", Font.PLAIN, 13));
                Email1.setBounds(320, 180, 40, 40);
                PFCL.add(Email1);

                //EMAIL TEXTFIELD FOR CARMEN LOGIN PAGE
                TextField emailTF1 = new TextField();
                emailTF1.setBounds(380, 180, 200, 40);
                PFCL.add(emailTF1);

                //PASSWORD LABEL RIGHT BESIDE THE PASSWORD TEXTFIELD
                Label pass1 = new Label("Password: ");
                pass1.setBounds(300,230,80,40);
                PFCL.add(pass1);

                //PASS TEXTFIELD FOR CARMEN LOGIN PAGE
                TextField passTF1 = new TextField();
                passTF1.setBounds(380, 230, 200, 40);
                PFCL.add(passTF1);

                //THE LOGIN BUTTON FOR CARMEN LOGIN PAGE
                Button LoginBtn1 = new Button("Login");
                LoginBtn1.setBounds(425,300,100,30);
                PFCL.add(LoginBtn1);

                //A METHOD TO MAKE THE LOGIN BUTTON FUNCTION
                LoginBtn1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(emailTF1.getText().equals("Carmen@gmail.com") && passTF1.getText().equals("Carmen123"))
                        {
                            CarmenLogin.dispose();
                            JFrame admin1 = new JFrame("Admin");
                            admin1.setSize(1000,500);
                            admin1.setVisible(true);
                            admin1.setDefaultCloseOperation(admin1.EXIT_ON_CLOSE);

                            JPanel adminP1 = new JPanel();
                            adminP1.setLayout(null);
                            admin1.add(adminP1);
                        }
                    }
                });
            }
         });

        //THE REMOVE BUTTON
        Button remove1 = new Button("Remove");
        remove1.setBounds(160,160,70,30);
        P.add(remove1);

        //A METHOD THAT MAKES THE REMOVE BUTTON FUNCTIKON
        remove1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //THE WARNING FRAME
                JFrame warningFrame1 = new JFrame("WARNING");
                warningFrame1.setSize(500,200);
                warningFrame1.setVisible(true);

                //THE WARNING PANEL
                JPanel warningPanel1 = new JPanel();
                warningPanel1.setLayout(null);
                warningFrame1.add(warningPanel1);
                
                //THE WARNING PANEL
                Label warning1 = new Label("Are You Sure That You Want To Remove This Account?");
                warning1.setBounds(70, 20, 400,20);
                warningPanel1.add(warning1);

                //THE YES BUTTON
                Button yes1 = new Button("Yes");
                yes1.setBounds(100, 80, 70, 20);
                warningPanel1.add(yes1);

                //A METHOD TO MAKE THE YES BUTTON FUNCTION
                yes1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CarmensAcc.setVisible(false);
                        login1.setVisible(false);
                        remove1.setVisible(false);
                        warningFrame1.dispose();
                        Label removedLabel1 = new Label("This Account Has Been Removed.");
                        removedLabel1.setBounds(20,160,220,30);
                        P.add(removedLabel1);
                    }
                });

                Button no1 = new Button("No");
                no1.setBounds(300,80,70,20);
                warningPanel1.add(no1);
                
                no1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        warningFrame1.dispose();
                    }
                });
            }
        });


        //Sharbel's acc and its login button and remove button
        Label SharbelAcc = new Label("Sharbel");
        SharbelAcc.setBounds(20,210,80,30);
        SharbelAcc.setFont(new Font("Arial", Font.PLAIN, 15));
        P.add(SharbelAcc);

        Button login2 = new Button("Login");
        login2.setBounds(100,210,50,30);
        P.add(login2);

        login2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //SHARBELS ACCOUNT LOGIN FRAME
                JFrame SharbelLogin = new JFrame("Sharbel's Login Page");
                SharbelLogin.setSize(1000,500);
                SharbelLogin.setVisible(true);
                SharbelLogin.setDefaultCloseOperation(SharbelLogin.EXIT_ON_CLOSE);

                F.dispose();

                //THE PANEL FOR CARMENS ACC
                JPanel PFSL = new JPanel();
                PFSL.setLayout(null);
                SharbelLogin.add(PFSL);

                Button back2 = new Button("Back");
                back2.setBounds(20, 20, 40, 40);;
                PFSL.add(back2);

                back2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        F.setVisible(true);
                        SharbelLogin.dispose();
                    }
                });

                //LABEL FOR INFO ASK
                Label info2 = new Label("Enter The Email and The Password");
                info2.setFont(new Font("Arial", Font.PLAIN, 15));
                info2.setBounds(350, 130, 300, 40);
                PFSL.add(info2);
                
                //EMAIL LABEL RIGHT BESIDE THE EMAIL TEXTFIELD
                Label Email2 = new Label("Email: ");
                Email2.setFont(new Font("Arial", Font.PLAIN, 13));
                Email2.setBounds(320, 180, 40, 40);
                PFSL.add(Email2);

                //EMAIL TEXTFIELD FOR CARMEN LOGIN PAGE
                TextField emailTF2 = new TextField();
                emailTF2.setBounds(380, 180, 200, 40);
                PFSL.add(emailTF2);

                //PASSWORD LABEL RIGHT BESIDE THE PASSWORD TEXTFIELD
                Label pass1 = new Label("Password: ");
                pass1.setBounds(300,230,80,40);
                PFSL.add(pass1);

                //PASS TEXTFIELD FOR CARMEN LOGIN PAGE
                TextField passTF2 = new TextField();
                passTF2.setBounds(380, 230, 200, 40);
                PFSL.add(passTF2);

                //THE LOGIN BUTTON FOR CARMEN LOGIN PAGE
                Button LoginBtn2 = new Button("Login");
                LoginBtn2.setBounds(425,300,100,30);
                PFSL.add(LoginBtn2);

                LoginBtn2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(emailTF2.getText().equals("Sharbel@gmail.com") && passTF2.getText().equals("Sharbel123"))
                        {
                            SharbelLogin.dispose();
                            JFrame admin2 = new JFrame("Admin");
                            admin2.setSize(1000,500);
                            admin2.setVisible(true);
                            admin2.setDefaultCloseOperation(admin2.EXIT_ON_CLOSE);

                            JPanel adminP1 = new JPanel();
                            adminP1.setLayout(null);
                            admin2.add(adminP1);
                        }
                    }
                });
            }
         });

        Button remove2 = new Button("Remove");
        remove2.setBounds(160,210,70,30);
        P.add(remove2);

        remove2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //THE WARNING FRAME
                JFrame warningFrame2 = new JFrame("WARNING");
                warningFrame2.setSize(500,200);
                warningFrame2.setVisible(true);

                //THE WARNING PANEL
                JPanel warningPanel2 = new JPanel();
                warningPanel2.setLayout(null);
                warningFrame2.add(warningPanel2);
                
                //THE WARNING PANEL
                Label warning2 = new Label("Are You Sure That You Want To Remove This Account?");
                warning2.setBounds(70, 20, 400,20);
                warningPanel2.add(warning2);

                //THE YES BUTTON
                Button yes2 = new Button("Yes");
                yes2.setBounds(100, 80, 70, 20);
                warningPanel2.add(yes2);

                yes2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SharbelAcc.setVisible(false);
                        login2.setVisible(false);
                        remove2.setVisible(false);
                        warningFrame2.dispose();
                        Label removedLabel2 = new Label("This Account Has Been Removed.");
                        removedLabel2.setBounds(20,210,300,30);
                        P.add(removedLabel2);
                    }
                });

                Button no2 = new Button("No");
                no2.setBounds(300,80,70,20);
                warningPanel2.add(no2);
                
                no2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        warningFrame2.dispose();
                    }
                });
            }
        });
    }
}
