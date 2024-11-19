public class Stack
{
    
  private int arr[];
  private int size;
  private int index = 0;
  
   public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

public void push(int element)
  {
     if (isFull())
       {
          System.out.println("stack is full");
       }
  
    arr[index] = element;
    index++;
 }

public int pop()
 {
     if (isFull())
       {
          System.out.println("stack is full");
       }
       return arr[--index];
 }
 
public boolean isEmpty()
 {
     if (index==o)
      {
          return true;
      }
      return false;
 }
 
public boolean isFull()
{
    if (index==size)
      {
        return true;
      }
      return false;
    
}

public int size()
{
    return index;
}


public class StackClient
{
  public static void main(String[] args){
      Stack stack = new stack(5);
      
      stack.push(8);
      stack.push(11);
      stack.push(13);
      stack.push(20);
      stack.push(11);
      
      
      System.out.println("i.size of stack after push opreation: "+stack.size());
      
        System.out.println("2. Pop elements from stack: ");
         while(!stack.isEmpty())
         {
              System.out.printf("%d",stack.pop());
         }
      
         System.out.println("\n3. size of stack afetr pop opreation: "+stack.size()); 
  }   
    
}
 
     
     
     
     
     
     
     

    
    
    
    
    
    
    
    
    
    
    
}