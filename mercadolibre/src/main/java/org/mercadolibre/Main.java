package org.mercadolibre;

import org.mercadolibre.repository.UserList;
import org.mercadolibre.service.CRUD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD crud = new CRUD();
        //crud.getUserList();
        String usuario;
        String constrasena;
        String respuesta;
        int delete;

        do{
            System.out.println("MENU");
            System.out.println("--------------");
            System.out.println("a: crear");
            System.out.println("b: eliminar");
            System.out.println("c: visualizar");
            System.out.println("d: salir");
            String rs = sc.next();

            switch (rs){
                case "a":
                case "A":
                    System.out.println("Cual es tu usuario");
                    usuario = sc.next();
                    System.out.println("CUal es tu contraseña");
                    constrasena = sc.next();

                    crud.createUser(usuario, constrasena);
                    break;
                case "b":
                case "B":
                    System.out.println("Que usuario quieres eliminar?" );
                    delete = sc.nextInt();
                    crud.deleteUser(delete);

                    break;
                case "c":
                case "C":
                    crud.viewUsers();
                    break;
                case "d":
                case "D":
                    break;
                default:
                    break;
            }
            System.out.println("Quieres volver al menu?");
            respuesta = sc.next();
        }while(respuesta != "no" ||respuesta != "n"  );


    }
}
