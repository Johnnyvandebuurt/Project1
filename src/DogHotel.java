import java.util.Scanner;
public class DogHotel {
    public static void main(String[] args) {
        int firstAnswer = 0;
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = null;
        Dog dog2 = null;
        Dog dog3 = null;
        while (firstAnswer <= 3) {
            System.out.println(" ----------------------------");
            System.out.println("| Welkom in het hondenhotel! |");
            System.out.println("|      Wat wilt u doen?      |");
            System.out.println("|    1. hond toevoegen.      |");
            System.out.println("|   2. hond verwijderen.     |");
            System.out.println("|      3. Overzicht          |");
            System.out.println("|      4. Aflsuiten          |");
            System.out.println(" ----------------------------");
            firstAnswer = scanner.nextInt();
            if (firstAnswer == 1) {
                if (dog1 == null) {
                    firstAnswer = 0;
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
                } else if (dog2 == null) {
                    System.out.println("wat is de naam van u hond?");
                    dog2 = new Dog();
                    dog2.name = scanner.next();
                    System.out.println("welk ras is deze hond?");
                    dog2.breed = scanner.next();
                    String breed = dog2.breed;
                    System.out.println("welk kleur is deze hond?");
                    String color = scanner.next();
                    dog2.color = color;
                    System.out.println("welk gender is deze hond?(man/vrouw)");
                    dog2.sex = scanner.next();
                    dog2.sex = dog1.sex;
                    if (dog2.sex.equals("man")) {
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
                    dogAge = dog2.age;
                    System.out.println("heeft deze hond de verplichte vaccins?(ja/nee)");
                    String dogHasVaccin = scanner.next();
                    if (dogHasVaccin.equals("ja")) {
                        dog2.hasVaccin = true;
                    } else if (dogHasVaccin.equals("nee")) {
                        dog2.hasVaccin = false;
                    }
                    System.out.println("de hond is toegevoegd.");
                    System.out.println("  /^ ^\\\n" +
                            " / 0 0 \\\n" +
                            " V\\ Y /V\n" +
                            "  / - \\\n" +
                            " /    |\n" +
                            "V__) ||\n");
                } else if (dog3 == null) {
                    System.out.println("wat is de naam van u hond?");
                    dog3 = new Dog();
                    dog3.name = scanner.next();
                    System.out.println("welk ras is deze hond?");
                    dog3.breed = scanner.next();
                    String breed = dog3.breed;
                    System.out.println("welk kleur is deze hond?");
                    String color = scanner.next();
                    dog3.color = color;
                    System.out.println("welk gender is deze hond?(man/vrouw)");
                    dog3.sex = scanner.next();
                    dog3.sex = dog3.sex;
                    if (dog3.sex.equals("man")) {
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
                    dogAge = dog3.age;
                    System.out.println("heeft deze hond de verplichte vaccins?(ja/nee)");
                    String dogHasVaccin = scanner.next();
                    if (dogHasVaccin.equals("ja")) {
                        dog3.hasVaccin = true;
                    } else if (dogHasVaccin.equals("nee")) {
                        dog3.hasVaccin = false;
                    }
                    System.out.println("de hond is toegevoegd.");
                    System.out.println("  /^ ^\\\n" +
                            " / 0 0 \\\n" +
                            " V\\ Y /V\n" +
                            "  / - \\\n" +
                            " /    |\n" +
                            "V__) ||\n");
                } else {
                    System.out.println("er is geen plek meer.");
                }
            }
            if (firstAnswer == 3) {
                if (dog1 != null) {
                    System.out.println("de naam van hond 1 is " + dog1.name + ".");
                    System.out.println("het ras  van hond 1 is " + dog1.breed + ".");
                    System.out.println("de kleur van hond 1 is " + dog1.color + ".");
                    System.out.println("het gender van hond 1 is " + dog1.sex + ".");
                }
                if (dog2 != null) {
                    System.out.println("de naam van hond 2 is " + dog2.name + ".");
                    System.out.println("het ras  van hond 2 is " + dog2.breed + ".");
                    System.out.println("de kleur van hond 2 is " + dog2.color + ".");
                    System.out.println("het gender van hond 2 is " + dog2.sex + ".");
                }
                if (dog3 != null) {
                    System.out.println("de naam van hond 3 is " + dog3.name + ".");
                    System.out.println("het ras  van hond 3 is " + dog3.breed + ".");
                    System.out.println("de kleur van hond 3 is " + dog3.color + ".");
                    System.out.println("het gender van hond 3 is " + dog3.sex + ".");
                } else if (dog1 == null && dog2 == null && dog3 == null){
                    System.out.println("er zijn geen honden aanwezig.");
                }
            }
            if (firstAnswer == 2) {
                System.out.println("Hoe noemt de hond die je wilt verwijderen : ");
                String dogDelete = scanner.next();
                if (dog1 != null) {
                    if (dog1.name.equals(dogDelete)) {
                        System.out.println(dog1.name + " is verwijderd");
                        dog1 = null;

                    }
                }
                if (dog2 != null) {
                    if (dog2.name.equals(dogDelete)) {
                        System.out.println(dog2.name + " is verwijderd");
                        dog2 = null;

                    }
                }
                if (dog3 != null) {
                    if (dog3.name.equals(dogDelete)) {
                        System.out.println(dog3.name + " is verwijderd");
                        dog3 = null;

                    }
                }
            }
            if (firstAnswer == 4) {
                System.out.println("Programma wordt afgesloten.");
                System.exit(0);
            }
        }
    }
}
