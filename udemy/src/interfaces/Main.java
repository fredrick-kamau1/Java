package interfaces;

import java.util.ArrayList;
import java.util.Scanner;
import javax.management.monitor.MonitorSettingException;

public class Main {

  public static void main(String[] args) {
/*    Player game = new Player("Tim", 10, 15);
    System.out.println(game);
    game.setHitPoints(16);
    game.setStrength(100);
    System.out.println(game);
    saveObject(game);

    game.setName("Fred");
    game.setHitPoints(60);
    game.setWeapon("Love");
    System.out.println(game);
    saveObject(game);

    loadObject(game);
    System.out.println(game);*/

    Monster game = new Monster("Cow", 20, 30);
    System.out.println(game);
    game.getHitPoints();
    game.getStrength();
    System.out.println(game);
    saveObject(game);
    //loadObject(game);
    System.out.println(game);
    Monster game2 = new Monster("Hen", 50, 60);
    System.out.println(game2);
    saveObject(game2);

  }

  public static ArrayList<String> readValues() {
    ArrayList<String> values = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int index = 0;
    System.out.println("Choose\n" +
        "1 to enter a string\n" +
        "0 to quit");

    while (!quit) {
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.print("Enter a string: ");
          String stringInput = scanner.nextLine();
          values.add(index, stringInput);
          index++;
          break;
      }
    }
    return values;
  }

  public static void saveObject(ISaveable objectToSave){
  for (int i = 0; i < objectToSave.write().size(); i++){
    System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
  }
  }
  public static void loadObject(ISaveable objectToLoad){
    ArrayList<String> values = readValues();
    objectToLoad.read(values);
  }

}
