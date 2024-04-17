public class Main {
  public static void main(String[] args)
  {
    System.out.println("******* A-1 *******");
    Sound sound = new Sound();
    sound.samples = new int[] {40, 2532, 17, -2300, -17, -4000, 2000, 1048,-420, 33, 15, -32, 2030, 3223};
    int numChanges = sound.limitAmplitude(2000);
    System.out.println(numChanges);
    System.out.println(java.util.Arrays.toString(sound.samples));
    System.out.println("******* A-2 *******");
    sound.samples = new int[] {0, 0, 0, 0, -14, 0, -35, -39, 0,-7, 16, 32, 37, 29, 0, 0};
    sound.trimSilenceFromBeginning();
    System.out.println(java.util.Arrays.toString(sound.samples));
  }
}
