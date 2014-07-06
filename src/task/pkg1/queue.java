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

public class queue {
    protected class el {
        int value;
        el next ;
        
    }
    private el head;
    int count;
    public queue (){
        head = null;
        count = 0;
    }
    public boolean empty(){
    return head == null;
}
    public void push(int x){
        el tmp = new el();
        tmp.value = x;
        tmp.next = null;
        if (empty()){
            head=tmp;
        }else{
            tmp.next=head;
            head=tmp;
            
        }
        count ++;            
    }
    public void pop (){
        if (empty()){
            System.out.println("Удаление Невозможно");
        return;}
        if (count==1){
            head=null;
            head.next=null;           
        }else {
          el  tmp ;
            tmp =head.next;
            tmp =head;
        }
        count--;
        return;
    }
    public int size(){
        return count;
    }
    public void print(){
        el tmp=head;
        for (int i=count; i>= 1 ; i--){
           System.out.println("#"+i+"="+tmp.value);  
        tmp=tmp.next;}
       
    }
}    
