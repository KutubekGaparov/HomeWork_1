
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static Scanner scanner = new Scanner(System.in);
    static int a;

    public static void main(String[] args) throws IOException {
        Autobaza[] autoBaza = {new Autobaza(), new Autobaza(), new Autobaza()};
        String data1 = new String(Files.readAllBytes(Path.of("./cars.json")));
        JSONArray json = new JSONArray(data1);
        for (int i = 0; i < 3; i++) {
            JSONObject js = json.getJSONObject(i);
            autoBaza[i].setId(js.getInt("id"));
            autoBaza[i].setNameAuto(js.getString("nameAuto"));
            autoBaza[i].setDriver(js.getString("driver"));
            autoBaza[i].setType(js.getString("type"));
        }
        System.out.println("| # | Bus           | Driver | State |");
        System.out.println("+———+———————————————+————————+———————+");
        for (int i = 0; i < 3; i++) {
            System.out.printf("|%-3s", autoBaza[i].getId());
            System.out.printf("|%-15s", autoBaza[i].getNameAuto());
            System.out.printf("|%-8s", autoBaza[i].getDriver());
            System.out.printf("|%-6s", autoBaza[i].getType());
            System.out.println();
        }

        Driver[] drivers = {new Driver(), new Driver(), new Driver()};
        String data2 = new String(Files.readAllBytes(Path.of("./driver.json")));
        JSONArray json1 = new JSONArray(data2);
        for (int i = 0; i < 3; i++) {
            JSONObject js1 = json1.getJSONObject(i);
            drivers[i].setId(js1.getInt("id"));
            drivers[i].setDriver(js1.getString("name"));
            drivers[i].setbus(js1.getString("bus"));
        }

        while (true) {
            System.out.print("Choose one of the Truck: ");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("\nN          : " + a + "\nBus        : " + autoBaza[0].getNameAuto() + "\nDriver     : " + "\nBus State  : " + autoBaza[0].getType());
            } else if (a == 2) {
                System.out.println("N          : " + a + "\nBus        : " + autoBaza[1].getNameAuto() + "\nDriver     : " + "\nBus State  : " + autoBaza[1].getType());
            } else if (a == 3) {
                System.out.println("N          : " + a + "\nBus        : " + autoBaza[2].getNameAuto() + "\nDriver     : " + "\nBus State  : " + autoBaza[2].getType());
            } else {
                break;
            }
            System.out.println("""
                    \nPress 1 to change Driver
                    Press 2 to send to the Route
                    Press 3 to send to the Repairing""");
            a = scanner.nextInt();

            if (a == 1) {
                System.out.println("Driver changed successfully");
                System.out.println("-------------------------");
                System.out.println(" id   | Driver   | Bus  ");
                System.out.println("+———+——————+——————————+——————");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("|%-3s", drivers[i].getId());
                    System.out.printf("|%-8s", drivers[i].getDriver());
                    System.out.printf("|%-7s", drivers[i].getBus());
                    System.out.println();
                }
                System.out.println("-----------------------------------");
                System.out.println("| # | Bus          | Driver | State |");
                System.out.println("+———+——————————————+————————+———————+");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("|%-3s", autoBaza[i].getId());
                    System.out.printf("|%-15s", autoBaza[i].getNameAuto());
                    System.out.printf("|%-8s", autoBaza[i].getDriver());
                    System.out.printf("|%-6s", autoBaza[i].getType());
                    System.out.println();
                }
            } else if (a == 2) {
                System.out.println("еще не закончено");
            } else if (a == 3) {
                System.out.println("еще не закончено");
            } else {
                System.out.println();
                break;
            }
        }
    }
}

