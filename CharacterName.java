public class CharacterName {
  public static void main (String[] args){

    String[] given = {"Sven","Rupert","Arturo","Jezebelle","Roxy","Hanz","Kit","Paulina","Stanis","Verbena","Sarah","Byron","Pandora","Bartlebee","Nero","Duncan","Abernathy","Mortimer","Aristotle"};
    String[] surname = {"Svengali","Grape","Ackbar","Snerd","Augustus","Yanislav","Warrington","Bellend","Snapjaw","Lockheed","Tanaka","Mamba","Rodriguez","Peabody","Wexler","Montigo","Bueller"};
    String[] title = {"Wanderer","Well-Endowed","Forgettable","Titan","Legend... wait for it... Dary!","Odious","Magnanimous","Infected","Lover","Sleuth","Silver-Tongued","Butcher","Maligned"};

    int givenLegth = given.length;
    int surnameLength = surname.length;
    int titleLength = title.length;

    int rand1 = (int) (Math.random() * givenLegth);
    int rand2 = (int) (Math.random() * surnameLength);
    int rand3 = (int) (Math.random() * titleLength);

    String knighted = given[rand1] + " " + surname[rand2] + " the " + title[rand3];

    System.out.println("I dub thee " + knighted);
  }
}
