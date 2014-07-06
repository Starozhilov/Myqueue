/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task.pkg1;

/**
 *
 * @author Админ
 */
public class Task1 {
     public static void main(String[] args) {
     queue que=new queue();
   
     que.push(1);
     que.push(3);
     que.push(6);
     que.push(0);
     System.out.println("Вывод очереди:");
     que.print();
     que.pop();
     System.out.println("Вывод очереди:");
     que.print();
    }
    

 

   

}