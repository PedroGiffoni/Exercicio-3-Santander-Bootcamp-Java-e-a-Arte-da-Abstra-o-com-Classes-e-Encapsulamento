/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.exercicio3bootcampsantander;

/**
 *
 * @author Pedro
 */
public class PetMachine {
    
    private boolean clean = true;
    
    int water = 30;
    
    private int shampoo = 10;
    
    private Pet pet = null;
    
    
    
    public void takeShower(){
        if (this.pet ==  null){
            System.out.println("Coloque o pet na maquina para iniciar o banho!");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        
        pet.setClean(true) ;
        System.out.println("O pet " + pet.getName() + " está limpo.");
    }            
    
    
        public void addWater() {
            if (water >= 30) {
            water = 30;
            System.out.println("A capacidade da água da máquina está no máximo");
            return;
    }

    water += 2;
}
    public void addShampoo(){
        if(shampoo >= 10){
            shampoo = 10;
            System.out.println("A capacidade da shampoo da máquina está no máximo");
            return;
    }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }
    
    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar um pet é necessário limpá-la");
        }
        
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na maquina nesse momento.");
            return;
        }
        this.pet = pet;
        
    }
    
    public void removePet(){
        this.clean = this.pet.isClean();
                
        
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina");
        
        this.pet = null;
        
    }
    public void wash(){
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa!");
    }
    
    
}
