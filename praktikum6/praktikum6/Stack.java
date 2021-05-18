package praktikum6;
public class Stack {
    Barang top;
    public Stack(){
        top=null;
    }
    public void push(Barang a){
        if(top==null) top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    public void pop(){
        if(top==null) System.out.println("kosong");
        else{
            System.out.println("Hapus Stock Baru. . .");
            top.view();
            top=top.next;
        }
    }
    public void isEmpty() {
        if (top == null) System.out.println("Stock kosong");
        else {
            System.out.println("Stock Ready");
        }
    }

    public void view(){
        if(top==null) System.out.println("kosong");
        else{
            Barang ptr=top;
            while(ptr!=null){
                System.out.println("- - - - -");
                ptr.view();
                ptr=ptr.next;
            }
        }
    }
}
