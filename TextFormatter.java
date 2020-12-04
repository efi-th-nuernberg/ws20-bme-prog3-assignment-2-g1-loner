import java.util.StringTokenizer;
class TextFormatter {
  

  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";
  public static StringTokenizer strngTkz = new StringTokenizer(text);
  private int maxLineLength; 
  private static String printedText= "";
  private static String printedText2= "";
  private static String printedText3= "";
  public static void main(String[] args) {
    
    printRightbound(text, 30);
    printLeftbound(text, 30);
    printCentered(text, 30);
  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {
    this.maxLineLength = maxLineLength;
  }

  // Ausgabe
 
  public static void prinLeftbound(String text, int maxLineLength){
    String line = "";
    int space = 0;

    while (strngTkz.hasMoreTokens()) {
      String word = strngTkz.nextToken();
      if (line.length() >= (maxLineLength - word.length())) {
        space = (maxLineLength - line.length());
        while (space != 0) {
          line = " " + line;
          space--;
        }
        printedText = printedText + line + "\n";
        line = word;
      } else if (line.isEmpty()) {
        line = word;
      } else {
        line = line + " " + word;
      }
    }
    space = (maxLineLength - line.length());
    while (space != 0) {
      line = " " + line;
      space--;
    }
    printedText = printedText + line;
    System.out.println(printedText + "\n");
  }
  public static void printRightbound(String text, int maxLineLength){
    String line = "";
    int space = 0;

    while (strngTkz.hasMoreTokens()) {
      String word = strngTkz.nextToken();
      if (line.length() >= (maxLineLength - word.length())) {
        space = (maxLineLength - line.length());
        while (space != 0) {
          line=" "+line;
          space--;
        }
        printedText2 = printedText2 + line + "\n";
        line=word;
      } else if (line.isEmpty()) {
        line=word;
      } else {
        line=line+" "+word;
      }
    }
    space = (maxLineLength-line.length());
    while (space !=0) {
      line=" "+line;
      space--;
    }
    printedText2 = printedText2+line;
    System.out.println(printedText2+"\n");
  }

  public static void printCentered(String text, int maxLineLength){
    String line = "";
    int space = 0;

    while (strngTkz.hasMoreTokens()) {
      String word = strngTkz.nextToken();
      if (line.length() >= (maxLineLength - word.length())) {
        space = (maxLineLength - line.length()) / 2;
        while (space != 0) {
          line = " " + line + " ";
          space--;
        }
        printedText3 = printedText3 + line + "\n";
        line = word;
      } else if (line.isEmpty()) {
        line = word;
      } else {
        line = line + " " + word;
      }
    }
    space = (maxLineLength - line.length()) / 2;
    while (space != 0) {
      line = " " + line + " ";
      space--;
    }
    printedText2 = printedText3 + line;
    System.out.println(printedText3 + "\n");
  }
}
