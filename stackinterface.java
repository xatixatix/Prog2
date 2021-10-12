import java.util.Stack;

interface myStack{
    void put(int a);
    int pop();
}

class simaMyStack implements myStack{
    int arr[] = new int[10];
    int now = 0;

    public void put(int putInt){
        arr[now] = putInt;
        System.out.println("put: " + arr[now] + " at index: " + now);
        now++;
    }

    public int pop(){
        now--;
        System.out.println("pop: " + arr[now] + " at index: " + now);
        return arr[now];
    }
}

class javaMyStack implements myStack{
    Stack stack = new Stack();

    public void put(int putInt){
        System.out.println("put: " + putInt + " in java stack");
        stack.push(putInt);
    }

    public int pop(){
        return (int)stack.pop();
    }
}

class dynamicMyStackList implements myStack{
    java.util.List<Integer> list = new java.util.ArrayList<Integer>();
    int now = 0;

    public void put(int putInt){
        list.add(putInt);
        System.out.println("put: " + list.get(now) + " at index: " + now);
        now++;
    }

    public int pop(){
        now--;
        System.out.println("pop: " + list.get(now) + " at index: " + now);
        int temp = list.get(now);
        list.remove(now);
        return temp;
    }
}

public class stackinterface {
    public static void main(String[] args){
        simaMyStack sima = new simaMyStack();
        sima.put(5);
        sima.put(61);
        sima.pop();
        sima.pop();
        
        javaMyStack javaCucc = new javaMyStack();
        javaCucc.put(2);
        javaCucc.put(40);
        javaCucc.pop();
        javaCucc.pop();

        dynamicMyStackList din = new dynamicMyStackList();
        din.put(32);
        din.put(231);
        din.pop();
        din.pop();
    }
}
