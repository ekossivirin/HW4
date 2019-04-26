package hw5;

import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type
   */
  public static void feed(List<? extends Bird> list) {
    // TODO fix method declaration
    System.out.println("Feeding birds");
    // TODO print birds in the cycle
    for (Object value : list) {
      System.out.println(value);
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type
   * @param bird new bird
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting bird to a section");
    // TODO check flying bird wings
    // TODO add bird to the list and print it
    bird.checkWings();
    list.add(bird);
    System.out.println(list);
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds
   * @param newBird bird to add
   */
  public static void registerBird(List<? super Bird> list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding bird to the birds list");
    // TODO add bird to list
    // TODO print birds in the cycle
    list.add(newBird);
    for (Object value : list) {
      System.out.println(value);
    }
  }
}
