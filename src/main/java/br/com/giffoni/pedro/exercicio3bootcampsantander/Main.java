/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.exercicio3bootcampsantander;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Main {
    private final static Scanner input = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    
    
    public static void main(String[] args) {
        
        var option = -1;
    do {
        System.out.println("===Escolha uma das opções:===");
        System.out.println("1 - Dar banho no pet");
        System.out.println("2 - Abastecer a máquina com água");
        System.out.println("3 - Abastecer a máquina com shampoo");
        System.out.println("4 - Verificar água");
        System.out.println("5 - Verificar shampoo");
        System.out.println("6 - Verificar se tem pet no banho");
        System.out.println("7 - Colocar pet na máquina");
        System.out.println("8 - Retirar pet da máquina");
        System.out.println("9 - Limpar máquina");
        System.out.println("0 - sair do menu");
        option = input.nextInt();   
        input.nextLine();
        
        switch (option){
            case 1 -> petMachine.takeShower();
            case 2 -> setWater();
            case 3 -> setShampoo();
            case 4 -> verifyWater();
            case 5 -> verifyShampoo();
            case 6 -> checkIfHasPEtInMachine();
            case 7 -> setPetInPetMachine();
            case 8 -> petMachine.removePet();
            case 9 -> petMachine.wash();
            case 0 -> System.exit(0);
            default -> System.out.println("Opção inválida!");
            
            
            
        }
        
    } while (true) ;
        
    
        
    
}
    private static void setWater(){
        System.out.println("Tentando colocar água na máquina!");
        petMachine.addWater();
    }
    
    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina!");
        petMachine.addShampoo();
    }
    private static void verifyWater(){
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + " litros de água!");
    }
    
    private static void verifyShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litros de shampoo!");
    }
    
    private static void checkIfHasPEtInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina " : "Não tem pet na máquina");
    }
    
    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet: ");
            name = input.nextLine(); 
        }
            
        
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }
    
}
