package interfaces;

import interfaces.ISaveable;
import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

  private String name;
  private String weapon;
  private int hitPoints;
  private int strength;

  public Player(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
    this.weapon = "Sword";
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public String getName() {
    return name;
  }

  public String getWeapon() {
    return weapon;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public int getStrength() {
    return strength;
  }

  @Override
  public List<String> write() {
    List<String> list = new ArrayList<String>();
    list.add(0, this.name);
    list.add(1, "" + this.hitPoints);
    list.add(2, "" + this.strength);
    list.add(3,this.weapon);
    return list;
  }

  @Override
  public void read(List<String> list) {
    if (list != null && list.size() > 0) {
      this.name = list.get(0);
      this.hitPoints = Integer.parseInt(list.get(1));
      this.strength = Integer.parseInt(list.get(2));
      this.weapon = list.get(3);
    }
  }

  @Override
  public String toString() {
    return "Player{name='" + getName() + '\'' + ", hitPoints=" + getHitPoints() + ", strength="
        + getStrength() + ", weapon='" + getWeapon() + '\'' + "}";
  }
}
