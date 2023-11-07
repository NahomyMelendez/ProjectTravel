
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nahomy, Nicole, Mariangel, Marcelle, Miguel
 */
public class TravelAgency {

    static ArrayList<Flight> flights;
    Scanner scanner = new Scanner(System.in);
    static int select = 0;
    static ArrayList<User> users;

    public static void main(String[] args) {
        flights = new ArrayList<Flight>();
        users = new ArrayList<User>();

        while (select != 7) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------------------------------");
            System.out.println("Digite la opcion que desea"
                    + "\n1.Ingresar cliente"
                    + "\n2.Agregar vuelo"
                    + "\n3.Reservar un vuelo"
                    + "\n4.Buscar persona por ID"
                    + "\n5.Vuelos disponibles"
                    + "\n6.Remover persona");
            System.out.println("----------------------------------");
        
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
            System.out.println("----------------------------------");
                    System.out.println("Ingrese la edad:");
                    String age = scanner.nextLine();
                    System.out.println("Ingrese el correo electronico: ");
                    String email = scanner.nextLine();
                    System.out.println("Ingrese la identificacion:");
                    String id = scanner.nextLine();
                    System.out.println("Ingrese el nombre:");
                    String name = scanner.nextLine();
                    User newPerson = new User(age, email, id, name);
                    users.add(newPerson);

                    break;
                case 2:
                    System.out.println("----------------------------------");
                    System.out.println("Digite el id del vuelo");
                    int idFlight = scanner.nextInt();
                    System.out.println("Digite la fecha del vuelo");
                    scanner.nextLine();
                    String date = scanner.nextLine();
                    System.out.println("Digite el origen del vuelo");
                    String origin = scanner.nextLine();
                    System.out.println("Digite el destino del vuelo");
                    String arrival = scanner.nextLine();
                    System.out.println("Digite el precio del vuelo");
                    int price = scanner.nextInt();
                    System.out.println("Digite la capacidad del vuelo");
                    int capacity = scanner.nextInt();
                    Flight newFlight = new Flight(idFlight, date, origin, arrival,
                    price, capacity);
                    flights.add(newFlight);

                    break;
                case 3:
                    System.out.println("----------------------------------");
                    System.out.println("Digite el id del vuelo");
                    int idFlightFind = scanner.nextInt();
                    Flight flight = getFlight(idFlightFind);
                    System.out.println(flight.getCapacity());
                    System.out.println("Digite el id de la persona");
                    scanner.nextLine();
                    String personId = scanner.nextLine();
                    User person = getUser(personId);
                    flight.addPassenger(person);
                    System.out.println(flight.getCapacity());
                    break;
                case 4:
                    System.out.println("----------------------------------");
                    System.out.println("Digite el id por buscar");
                    String find = scanner.nextLine();
                    User found = getUser(find);
                    if (found == null) {
                        System.out.println("No encontrado");
                    } else {
                        System.out.println(found.getName());
                        System.out.println(found.getiD());
                        System.out.println(found.getAge());
                        System.out.println(found.getEmail());
                        for (Flight current : flights) {
                            for (User currentuser : current.getPassengers()) {
                                if (currentuser.getiD().equals(found.getiD())) {
                                    System.out.println(current.getId());
                                    System.out.println(current.getOrigin());
                                    System.out.println(current.getArrival());
                                    System.out.println(current.getPrice());
                                }
                            }

                        }
                    }

                    break;
                case 5:
                    System.out.println("----------------------------------");
                    System.out.println("Los vuelos disponibles son: ");
                    for (Flight current : flights) {
                        System.out.println(current.getOrigin() + " - "
                                + current.getArrival() + " - "
                                + current.getDate() + " - "
                                + current.getCapacity());
                    }

                    break;

                case 6:
                    System.out.println("----------------------------------");
                    System.out.println("Que pasajero quiere remover");
                    String idDelete = scanner.nextLine();
                    Flight deleteFlight = getFlight(scanner.nextInt());
                    if (deleteFlight == null) {
                        System.out.println("El vuelo no existe");
                    } else {
                        if (deleteFlight.deletingPassager(idDelete)) {
                            System.out.println("El pasajero se elimino "
                                    + "correctamente");
                        } else {
                            System.out.println("No se encontro pasajero");
                        }
                    }
                    break;
                default:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    break;
            }

        }
    }
/*
    this method works to find the flight are already created 
    @param getFlight its the method to find the correct flight
    */
    public static Flight getFlight(int idFlight) {
        for (Flight current : flights) {
            if (idFlight == (current.getId())) {
                return current;
            }

        }
        return null;
    }
/*
    this method works to find the client there is already in the list
    @param getUser its the method to find the correct person
    */
    public static User getUser(String id) {
        for (User current : users) {
            if (id.equals(current.getiD())) {
                return current;
            }
        }
        return null;
    }
}
