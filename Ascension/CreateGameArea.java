import java.awt.*;
import javax.swing.*;

public class CreateGameArea{
    JPanel gamePlay = new JPanel();
    JPanel dungeonMap = new JPanel();
    JPanel lifeArea = new JPanel();
    JPanel skillsMenu = new JPanel();
    JPanel powerArea = new JPanel();
    JPanel gameMenuOptions = new JPanel();
    JPanel charView = new JPanel();
    JPanel inventoryView = new JPanel();
    JButton slot1 = new JButton("S1");
    JButton slot2 = new JButton("S2");
    JButton slot3 = new JButton("S3");
    JButton slot4 = new JButton("S4");
    JButton slot5 = new JButton("S5");
    JButton slot6 = new JButton("S6");
    JButton slot7 = new JButton("S7");
    JButton slot8 = new JButton("S8");
    JButton slot9 = new JButton("S9");
    JButton slot0 = new JButton("S0");
    JButton gameMenu = new JButton("Menu");
    JButton charSheet = new JButton("CS");
    JButton inventory = new JButton("INV");
    JButton gameMenuOptionSave = new JButton("Save");
    JButton gameMenuOptionReturn = new JButton("Return");
    JButton gameMenuOptionQuit = new JButton("Quit");
    JButton closeCharView = new JButton("Close");
    JButton closeInventoryView = new JButton("Close");
    Icon mapTile = new ImageIcon(getClass().getResource("sampletile.png"));
    JLabel mapSection1 = new JLabel(mapTile);
    JLabel mapSection2 = new JLabel(mapTile);
    JLabel mapSection3 = new JLabel(mapTile);
    JLabel mapSection4 = new JLabel(mapTile);
    JLabel mapSection5 = new JLabel(mapTile);
    JLabel mapSection6 = new JLabel(mapTile);
    JLabel mapSection7 = new JLabel(mapTile);
    JLabel mapSection8 = new JLabel(mapTile);
    JLabel mapSection9 = new JLabel(mapTile);
    int coordx = 200;
    int coordy = 200;

    CreateGameArea(){
        gamePlay.setLayout(new FlowLayout());
        gamePlay.setPreferredSize(new Dimension(780,580));
        gamePlay.setBackground(Color.BLACK);
        dungeonMap.setLayout(null);
        dungeonMap.setPreferredSize(new Dimension(770,460));
        mapSection1.setBounds(coordx,coordy,100,100);
        mapSection2.setBounds(coordx-50,coordy+50,100,100);
        mapSection3.setBounds(coordx-50,coordy-50,100,100);
        mapSection4.setBounds(coordx+50,coordy+50,100,100);
        mapSection5.setBounds(coordx+50,coordy-50,100,100);
        mapSection6.setBounds(coordx+100,coordy,100,100);
        mapSection7.setBounds(coordx-100,coordy,100,100);
        mapSection8.setBounds(coordx,coordy-100,100,100);
        mapSection9.setBounds(coordx,coordy+100,100,100);
        dungeonMap.add(mapSection1);
        dungeonMap.add(mapSection2);
        dungeonMap.add(mapSection3);
        dungeonMap.add(mapSection4);
        dungeonMap.add(mapSection5);
        dungeonMap.add(mapSection6);
        dungeonMap.add(mapSection7);
        dungeonMap.add(mapSection8);
        dungeonMap.add(mapSection9);
        dungeonMap.add(gameMenuOptions);
        dungeonMap.add(charView);
        dungeonMap.add(inventoryView);
        inventoryView.setBounds(200,50,100,500);
        inventoryView.setPreferredSize(new Dimension(500,400));
        inventoryView.add(closeInventoryView);
        inventoryView.setVisible(false);
        inventory.setPreferredSize(new Dimension(50,50));
        charView.setVisible(false);
        charView.setBounds(200,50,100,500);
        charView.setPreferredSize(new Dimension(200,400));
        charView.add(closeCharView);
        charSheet.setPreferredSize(new Dimension(50,50));
        lifeArea.setPreferredSize(new Dimension(100,100));
        skillsMenu.setPreferredSize(new Dimension(560,100));
        slot1.setPreferredSize(new Dimension(50,50));
        slot2.setPreferredSize(new Dimension(50,50));
        slot3.setPreferredSize(new Dimension(50,50));
        slot4.setPreferredSize(new Dimension(50,50));
        slot5.setPreferredSize(new Dimension(50,50));
        slot6.setPreferredSize(new Dimension(50,50));
        slot7.setPreferredSize(new Dimension(50,50));
        slot8.setPreferredSize(new Dimension(50,50));
        slot9.setPreferredSize(new Dimension(50,50));
        slot0.setPreferredSize(new Dimension(50,50));
        skillsMenu.add(slot1);
        skillsMenu.add(slot2);
        skillsMenu.add(slot3);
        skillsMenu.add(slot4);
        skillsMenu.add(slot5);
        skillsMenu.add(slot6);
        skillsMenu.add(slot7);
        skillsMenu.add(slot8);
        skillsMenu.add(slot9);
        skillsMenu.add(slot0);
        skillsMenu.add(gameMenu);
        skillsMenu.add(charSheet);
        skillsMenu.add(inventory);
        gameMenuOptions.setVisible(false);
        powerArea.setPreferredSize(new Dimension(100,100));
        gameMenuOptions.setPreferredSize(new Dimension(120,200));
        gameMenuOptions.setBounds(200,50,100,500);
        gameMenuOptions.setPreferredSize(new Dimension(200,400));
        gameMenuOptions.add(gameMenuOptionSave);
        gameMenuOptions.add(gameMenuOptionReturn);
        gameMenuOptions.add(gameMenuOptionQuit);
        gameMenu.setPreferredSize(new Dimension(50,50));
        gamePlay.add(dungeonMap);
        gamePlay.add(lifeArea);
        gamePlay.add(skillsMenu);
        gamePlay.add(powerArea);
        gamePlay.setVisible(false);
    }  
}