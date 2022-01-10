import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) {
        AutoBase autoBase1 = new AutoBase();
        autoBase1.setId(1);
        autoBase1.setNameAuto("BMW");
        autoBase1.setState("base");

        AutoBase autoBase2 = new AutoBase();
        autoBase2.setId(2);
        autoBase2.setNameAuto("AUDI");
        autoBase2.setState("base");

        AutoBase autoBase3 = new AutoBase();
        autoBase3.setId(3);
        autoBase3.setNameAuto("MERCEDES");
        autoBase3.setState("base");

        AutoBase[] autoBases = {
                AutoBase.autoBaseMethod(autoBase1.getId(), autoBase1.getNameAuto(), autoBase1.getDriver(), autoBase1.getState()),
                AutoBase.autoBaseMethod(autoBase2.getId(), autoBase2.getNameAuto(), autoBase2.getDriver(), autoBase2.getState()),
                AutoBase.autoBaseMethod(autoBase3.getId(), autoBase3.getNameAuto(), autoBase3.getDriver(), autoBase3.getState())
        };


        Driver[] driver = {new Driver(), new Driver(), new Driver()};

        driver[0].setId(1);
        driver[1].setId(2);
        driver[2].setId(3);

        driver[0].setName("Akyl");
        driver[1].setName("Maks");
        driver[2].setName("Katya");

        driver[0].setBus("BMW");
        driver[1].setBus("AUDI");
        driver[2].setBus("MERCEDES");

        String gson = GSON.toJson(driver);

        write(gson);

        String string = GSON.toJson(autoBases);

        write1(string);

        System.out.println("|#1-этап  |    Bus          |  Driver  |  State |");
        System.out.println("|—————————+—————————————————+——————————+—————————");
        for (int i = 0; i < 3; i++) {
            System.out.printf("|    %-5s|    ", autoBases[i].getId());
            System.out.printf("%-13s|          |  ", autoBases[i].getNameAuto());
            System.out.printf("%-6s|", autoBases[i].getState());
            System.out.println();
        }
        System.out.print("Choose one of the Truck: ");
        int a = scanner.nextInt();
        a--;
        while (true) {
            System.out.println("----------------- TRUCK-INF ---------------------");
            System.out.println(
                    "id        :      " + autoBases[a].getId() +
                            "\nBus       :      " + autoBases[a].getNameAuto() +
                            "\nDriver    :      " +
                            "\nBus State :      " + autoBases[a].getState() + "\n");
            System.out.println("Press 1 change Driver ");
            System.out.println("Press 2 send to the Route");
            System.out.println("Press 3 send to the Repairing");
            break;
        }

        while (true) {
            int b = scanner.nextInt();
            if (b == 1) {
                System.out.println("------| Driver changed successfully! |------|");
                System.out.println("\n|-- 2-этап ------ DRIVERS ------------------|");
                System.out.println("|# |   id    |      Driver     |   Bus      |");
                System.out.println("|——|—————————+—————————————————+————————————|");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("|%-2s|  ", autoBases[i].getId());
                    System.out.printf("dr-%-4s|    ", driver[i].getId());
                    System.out.printf("%-13s|   ", driver[i].getName());
                    if (autoBases[i].getNameAuto() == autoBases[a].getNameAuto()) {
                        System.out.printf("%-9s|   ", autoBases[a].getNameAuto());
                        System.out.println();

                    } else {
                        System.out.println("");
                    }
                }
                break;

            }

        }
    }


    public static void write(String obj) {
        Path path = Paths.get("./Driver.json");
        try {
            Files.writeString(path, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write1(String obj) {
        Path path = Paths.get("./AutoBase.json");
        try {
            Files.writeString(path, obj,
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

