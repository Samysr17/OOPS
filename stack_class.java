package sam_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MJC
 */
public class stack_class {
    int top;
    int stack[]=new int [25];
    stack_class(){
         top=-1;    
}
    void is_empty(){
    if(top==-1){
    System.out.println("Stack Empty");
    }
    
    }
    void is_full(){
    if(top==24){
    System.out.println("Stack Full");
    }
    
    }
    void push(int num){
       top++;
    stack[top]=num;
    System.out.println("Stack Top "+stack[top]);
    
    }
    void pop(){
    top--;
    System.out.println("Stack Top " +stack[top]);
    }
    
}
