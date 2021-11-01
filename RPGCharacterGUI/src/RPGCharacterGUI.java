import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {

    JFrame gameWindow;
    JPanel gamePanel;

    JLabel human;
    JLabel elf;
    JLabel demon;
    JLabel beastMan;

    JTextField name;
    JTextField age;
    JTextField gender;
    JTextField skillLevel;

    JTextField armor;
    JTextField sword;
    JTextField boots;
    JTextField shield;

    JLabel armorLabel;
    JLabel swordLabel;
    JLabel bootsLabel;
    JLabel shieldLabel;

    JLabel nameLabel;
    JLabel ageLabel;
    JLabel genderLabel;
    JLabel skillLevelLabel;


    JButton humanButton;
    JButton elfButton;
    JButton demonButton;
    JButton beastManButton;

    JButton cal;
    JLabel calLabel;

    public RPGCharacterGUI() {
        //game window and stuff
        gameWindow = new JFrame("Game Window");
        gameWindow.setSize(1366, 768);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setLocationRelativeTo(null);

        gamePanel = new JPanel();


        gameWindow.add(gamePanel);
        gameWindow.setVisible(true);

        //input name, age, gender, skill level
        nameLabel = new JLabel("What is ur name?");
        name = new JTextField(5);
        ageLabel = new JLabel("What is ur current age");
        age = new JTextField(5);
        genderLabel = new JLabel("If willing what is your gender?");
        gender = new JTextField(5);
        skillLevelLabel = new JLabel("How good are you at games?");
        skillLevel = new JTextField(5);



        gamePanel.add(ageLabel);
        gamePanel.add(age);
        gamePanel.add(nameLabel);
        gamePanel.add(name);
        gamePanel.add(genderLabel);
        gamePanel.add(gender);
        gamePanel.add(skillLevelLabel);
        gamePanel.add(skillLevel);

        // inputs for armor, boots, shied, sword
        swordLabel = new JLabel("What is the sword stats?");
        sword = new JTextField(5);
        armorLabel = new JLabel("What is the armor stats?");
        armor = new JTextField(5);
        bootsLabel = new JLabel("What is the boot stats?");
        boots = new JTextField(5);
        shieldLabel = new JLabel("What is the shield stats?");
        shield = new JTextField(5);

        gamePanel.add(swordLabel);
        gamePanel.add(sword);
        gamePanel.add(armorLabel);
        gamePanel.add(armor);
        gamePanel.add(bootsLabel);
        gamePanel.add(boots);
        gamePanel.add(shieldLabel);
        gamePanel.add(shield);



        //Human
        human = new JLabel("Health: 100\n Strength: 50\n Speed: 50\n Dex: 100");
        human.setSize(200, 100);
        human.setLocation(0, 0);


        humanButton = new JButton("Human");

        gamePanel.add(humanButton);
        gamePanel.add(human);

        humanButton.addActionListener(new humanButtonListener());

        human.setVisible(false);

        //elf
        elf = new JLabel("Health: 250\n Strength: 25\n Speed: 150\n Dex: 50");
        elf.setSize(100, 100);
        elf.setLocation(100, 100);

        gamePanel.add(elf);

        elfButton = new JButton("Elf");

        gamePanel.add(elfButton);

        elfButton.addActionListener(new elfButtonListener());

        elf.setVisible(false);

        //demon
        demon = new JLabel("Health: 300\n Strength: 200\n Speed: 5\n Dex: 10");
        demon.setSize(200, 100);
        demon.setLocation(1000, 1000);


        demonButton = new JButton("Demon");

        gamePanel.add(demonButton);
        gamePanel.add(demon);

        demonButton.addActionListener(new demonButtonListener());

        demon.setVisible(false);

        //beast man
        beastMan = new JLabel("Health: 150\n Strength: 100\n Speed: 150\n Dex: 100");
        beastMan.setSize(200, 100);
        beastMan.setLocation(1000, 1000);


        beastManButton = new JButton("Beast Man");

        gamePanel.add(beastManButton);
        gamePanel.add(beastMan);

        beastManButton.addActionListener(new beastManButtonListener());

        beastMan.setVisible(false);


        //Cal
        cal = new JButton("Stats");
        cal.setSize(200, 100);

        cal.addActionListener(new calButtonListener());

        calLabel = new JLabel("Your Stats: " );
        calLabel.setVisible(false);

        //get text
         int armorStat = Integer.parseInt(armor.getText());


    }

    private class humanButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            demon.setVisible(false);
            elf.setVisible(false);
            beastMan.setVisible(false);
            human.setVisible(true);
        }
    }

    private class elfButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            beastMan.setVisible(false);
            demon.setVisible(false);
            human.setVisible(false);
            elf.setVisible(true);
        }

    }

    private class demonButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            beastMan.setVisible(false);
            human.setVisible(false);
            elf.setVisible(false);
            demon.setVisible(true);
        }
    }

    private class beastManButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            demon.setVisible(false);
            elf.setVisible(false);
            human.setVisible(false);
            beastMan.setVisible(true);
        }
    }

    private class calButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            if(demon.isVisible()) {

                calLabel = new JLabel("Your stats with armor is: Heath" , 300 + armorStat, "Strength: ", 200 + swordStat, "Speed: ", bootStat + 5, "Dex: ", shieldStat + 100);
                calLabel.setVisible(true);



            }
        }
    }
}
