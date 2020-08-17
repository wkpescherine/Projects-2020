import java.awt.*;
import javax.swing.*;

public class CreateNewGames {
    JPanel newGame = new JPanel();
    JPanel selectRace = new JPanel();
    JPanel selectStyle = new JPanel();
    JPanel selectClass = new JPanel();
    JPanel bonusSection = new JPanel();
    JPanel skillsSection = new JPanel();
    JButton start = new JButton("Start Game");
    JButton human = new JButton("Human");
    JButton dwarf = new JButton("Dwarven");
    JButton elven = new JButton("Elven");
    JButton kobold = new JButton("Kobold");
    JButton undead = new JButton("Undead");
    JButton troll = new JButton("Troll");
    JButton ogre = new JButton("Ogre");
    JButton draconic = new JButton("Draconis");
    JButton insane = new JButton("Insane");
    JButton divine = new JButton("Divine");
    JButton elusive = new JButton("Elusive");
    JButton diabolic = new JButton("Diabolical");
    JButton wise = new JButton("Wise");
    JButton warrior = new JButton("Warrior");
    JButton rogue = new JButton("Rogue");
    JButton mage = new JButton("Mage");
    JButton priest = new JButton("Priest");
    JButton necro = new JButton("Necro");
    JButton melee = new JButton("melee");
    JButton magic = new JButton("magic");
    JButton spark = new JButton("spark");
    JButton smite = new JButton("smite");
    JButton sweep = new JButton("sweep");
    JButton lifetap = new JButton("lifetap");
    JButton startNewGame = new JButton("New Game");
    JButton backToMain = new JButton("Back to Main");
    JLabel styleRaceClass = new JLabel(attributes[0]+attributes[1]+attributes[2]);
    JLabel str = new JLabel(strength);
    JLabel dex = new JLabel(dexterity);
    JLabel qui = new JLabel(quickness);
    JLabel iq = new JLabel(intelligence);
    JLabel sta = new JLabel(stamina);
    JLabel spr = new JLabel(spirit);
    JLabel hp = new JLabel(life);
    JLabel pow = new JLabel(power);

    CreateNewGames(){
        newGame.setLayout(new FlowLayout());
        newGame.setPreferredSize(new Dimension(780,580));
        selectStyle.setPreferredSize(new Dimension(250,170));
        selectStyle.add(insane);
        selectStyle.add(divine);
        selectStyle.add(diabolic);
        selectStyle.add(elusive);
        selectStyle.add(wise);
        selectRace.setPreferredSize(new Dimension(250,170));
        selectRace.add(human);
        selectRace.add(kobold);
        selectRace.add(dwarf);
        selectRace.add(undead);
        selectRace.add(elven);
        selectRace.add(troll);
        selectRace.add(ogre);
        selectRace.add(draconic);
        selectClass.setPreferredSize(new Dimension(250,170));
        selectClass.add(warrior);
        selectClass.add(priest);
        selectClass.add(rogue);
        selectClass.add(necro);
        selectClass.add(mage);
        backToMain.setBounds(200,100,100,20);
        start.setBounds(200,300,100,20);
        bonusSection.setPreferredSize(new Dimension(250,350));
        bonusSection.setLayout(new FlowLayout());
        bonusSection.add(styleRaceClass);
        bonusSection.add(str);
        bonusSection.add(sta);
        bonusSection.add(dex);
        bonusSection.add(qui);
        bonusSection.add(iq);
        bonusSection.add(spr);
        bonusSection.add(hp);
        bonusSection.add(pow);
        skillsSection.setPreferredSize(new Dimension(500,350));
        skillsSection.setLayout(new FlowLayout());
        melee.setVisible(false);
        magic.setVisible(false);
        spark.setVisible(false);
        smite.setVisible(false);
        sweep.setVisible(false);
        lifetap.setVisible(false);
        skillsSection.add(melee);
        skillsSection.add(magic);
        skillsSection.add(spark);
        skillsSection.add(smite);
        skillsSection.add(sweep);
        skillsSection.add(lifetap);        
        newGame.setBackground(Color.BLACK);
        newGame.add(selectStyle);
        newGame.add(selectRace);
        newGame.add(selectClass);
        newGame.add(bonusSection);
        newGame.add(skillsSection);
        newGame.add(backToMain);
        newGame.add(start);
        newGame.setVisible(false);
    }
}