package usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClientRegistro {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clientes = new ArrayList<>();
        int id = 1;
        String continuar;
        String resp = "s";
        Client cli;


        do {
            System.out.println("Informacion del cliente");
            System.out.println("Ingrese el ID");
            int Id = scanner.nextInt();
            System.out.println("ingrese el codigo");
            String codigo = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Ingrese el nombre del cliente");
            String nombre = scanner.nextLine();
            System.out.println("ingrese el apellido del cliente");
            String apellido = scanner.nextLine();
            System.out.println("Ingresar el email del cliente");
            String email = scanner.nextLine();
            System.out.println("Ingresar el numero de telefono del cliente");
            int telefono = scanner.nextInt();

            cli = new Client(Id, codigo, nombre, apellido, email, telefono);
            clientes.add(cli);

            System.out.println("Desea ingresar otro número S/N");
            resp = scanner.next().toLowerCase();
        } while (resp.equals("s"));

        Iterator<Client> iterator = clientes.iterator();
        System.out.println("\nClientes registrados:");
        while(iterator.hasNext())
        {
            Client cliente = iterator.next();
            System.out.println("ID" + cliente.getId());
            System.out.println("Codigo:" + cliente.getCodigo());
            System.out.println("Nombre:" + cliente.getNombre());
            System.out.println("Apellido:" + cliente.getApellido());
            System.out.println("Email:" + cliente.getEmail());
            System.out.println("Telefono:" + cliente.getTelefono());
        }

    }
}
