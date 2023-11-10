import java.util.Scanner;
public class DogHotel {
    public static void main(String[] args) {
        int firstAnswer;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ----------------------------");
        System.out.println("| Welkom in het hondenhotel! |");
        System.out.println("|      Wat wilt u doen?      |");
        System.out.println("|    1. hond toevoegen.      |");
        System.out.println("|   2. hond verwijderen.     |");
        System.out.println("|      3. Afsluiten.         |");
        System.out.println(" ----------------------------");
        firstAnswer = scanner.nextInt();
        Dog dog1 = null;
        Dog dog2 = null;
        Dog dog3 = null;
        if (firstAnswer == 1) {
            if (dog1 == null) {
                System.out.println("wat is de naam van u hond?");
                dog1 = new Dog();
                dog1.name = scanner.next();
                System.out.println("welk ras is deze hond?");
                dog1.breed = scanner.next();
                String breed = dog1.breed;
                System.out.println("welk kleur is deze hond?");
                String color = scanner.next();
                dog1.color = color;
                System.out.println("welk gender is deze hond?(man/vrouw)");
                dog1.sex = scanner.next();
                dog1.sex = dog1.sex;
                if (dog1.sex.equals("man")) {
                    System.out.println("is deze hond gesteriliseerd?(ja/nee)");
                    String sterelised = scanner.next();
                    if (sterelised.equals("ja")) {
                        boolean dogSterile = true;
                    } else if (sterelised.equals("nee")) {
                        boolean dogSterile = false;
                    }
                }
                System.out.println("Hoe oud is de hond?");
                int dogAge = scanner.nextInt();
                dogAge = dog1.age;
                System.out.println("heeft deze hond de verplichte vaccins?(ja/nee)");
                String dogHasVaccin = scanner.next();
                if (dogHasVaccin.equals("ja")) {
                    dog1.hasVaccin = true;
                } else if (dogHasVaccin.equals("nee")) {
                    dog1.hasVaccin = false;
                }
                System.out.println("de hond is toegevoegd.");
                System.out.println("  /^ ^\\\n" +
                        " / 0 0 \\\n" +
                        " V\\ Y /V\n" +
                        "  / - \\\n" +
                        " /    |\n" +
                        "V__) ||\n");
            }
            else{
                System.out.println("er is geen plek meer.");
            }
        }
        if (firstAnswer == 2) {
            //    System.out.println("Wat is de naam van de hond die je wilt verwijderen?");
            //String deleteDog = scanner.next();
            dog1 = null;
        }
        while (firstAnswer < 3) {
            System.out.println(" ----------------------------");
            System.out.println("| Welkom in het hondenhotel! |");
            System.out.println("|      Wat wilt u doen?      |");
            System.out.println("|    1. hond toevoegen.      |");
            System.out.println("|   2. hond verwijderen.     |");
            System.out.println("|      3. Afsluiten.         |");
            System.out.println(" ----------------------------");
            firstAnswer = scanner.nextInt();
            dog1 = null;
            if (firstAnswer == 1) {
                if (dog1 == null) {
                    System.out.println("wat is de naam van u hond?");
                    dog1 = new Dog();
                    dog1.name = scanner.next();
                    System.out.println("welk ras is deze hond?");
                    dog1.breed = scanner.next();
                    String breed = dog1.breed;
                    System.out.println("welk kleur is deze hond?");
                    String color = scanner.next();
                    dog2.color = color;
                    System.out.println("welk gender is deze hond?(man/vrouw)");
                    dog1.sex = scanner.next();
                    dog1.sex = dog1.sex;
                    if (dog1.sex.equals("man")) {
                        System.out.println("is deze hond gesteriliseerd?(ja/nee)");
                        String sterelised = scanner.next();
                        if (sterelised.equals("ja")) {
                            boolean dogSterile = true;
                        } else if (sterelised.equals("nee")) {
                            boolean dogSterile = false;
                        }
                    }
                    System.out.println("Hoe oud is de hond?");
                    int dogAge = scanner.nextInt();
                    dogAge = dog1.age;
                    System.out.println("heeft deze hond de verplichte vaccins?(ja/nee)");
                    String dogHasVaccin = scanner.next();
                    if (dogHasVaccin.equals("ja")) {
                        dog1.hasVaccin = true;
                    } else if (dogHasVaccin.equals("nee")) {
                        dog1.hasVaccin = false;
                    }
                    System.out.println("de hond is toegevoegd.");
                    System.out.println("  /^ ^\\\n" +
                            " / 0 0 \\\n" +
                            " V\\ Y /V\n" +
                            "  / - \\\n" +
                            " /    |\n" +
                            "V__) ||\n");
                }
                else{
                    System.out.println("er is geen plek meer.");
                }
            }
            if (firstAnswer == 2) {
                //System.out.println("Wat is de naam van de hond die je wilt verwijderen?");
                String deleteDog = scanner.next();
                dog1 = null;
                System.out.println("de hond is verwijderd.");
            }
            if (firstAnswer == 3) {
                System.out.println("Programma wordt afgesloten.");
            }
        }
    }
}