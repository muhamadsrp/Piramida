package com.mycompany.apk_todo_list;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ToDoList {

    public  static String[] model = new String[5];
    //Inputan
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args){

        viewShowRutinitas();
    }

    /**
     * Menampilkan Rutiniitas
     */
    public static void showRutinitas(){
        System.out.println("Routinitas Firdaus Saory :");
        for (int i = 0; i < model.length; i++) {
            var rutinitas = model[i];
            var no = i + 1;

            if (rutinitas != null){
                System.out.println(no + ". " + rutinitas);
            }
        }
    }

    /**
     * Menambahkan data rutinitas
     */
    public static void addRutiinitas(String rutinitas){
        
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (int i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = rutinitas;
                break;
            }
        }
    }

    /**
     * menghapus rutinitas
     */
    public static boolean removeRutinitas(int number){
        if ((number-1) >= model.length){
            return false;
        } else if (model[number-1] == null) {
            return false;
        }else {
            for (int i = (number-1); i < model.length; i++) {
                if(i == (model.length-1)){
                    model[i] = null;
                } else {
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    /**
     * Inputan
     */
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    //test inputan
    public static void testInput(){
        var inputan = input("Silahkan Input");
        System.out.println(inputan);
    }

    /**
     * view Rutinitas
     */
    public static void viewShowRutinitas(){
        while (true){
            showRutinitas();

            System.out.println("MENU :");
            System.out.println("1. Tambah Rutinitas");
            System.out.println("2. Hapus Rutinitas");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if(input.equals("1")){
                viewAddRutiinitas();
            } else if (input.equals("2")) {
                viewRemoveRutinitas();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    /**
     * view tambahkan Rutinitas
     */
    public static void viewAddRutiinitas(){
        System.out.println("Menambah Rutinitas");

        var rutinitas = input("Rutinitas (xJika Batal");

        if(rutinitas.equals("x")){
            //Batal
        }else {
            addRutiinitas(rutinitas);
        }
    }
    /**
     * view Hapus Rutinitas
     */
    public static void viewRemoveRutinitas(){
        System.out.println("Menghapus Rutinitas");

        var number = input("Nomor yang dihapus (x Jika Batal");

        if(number.equals("x")){
            //Batal
        } else {
            boolean success = removeRutinitas(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus Rutinitas");
            }
        }
    }
}
