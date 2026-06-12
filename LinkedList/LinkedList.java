
public class LinkedList {
    public static class Node {
        int data;
        Node next;
    }
    public static class Ll{
        int size;
        Node head;
        Node tail;

        public void addLast(int val){
            Node temp = new Node();
            temp.data = val;

            if(size == 0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int size(){
            return this.size;
        }
        public void display(){
            Node temp = this.head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public void removefirst(){
            if(this.size==0){
                System.out.println("List is Empty");
                return;
            }
            else if(this.size==1){
                head=tail=null;
            }
            else{
                Node nbr = this.head.next;
                this.head.next=null;
                head=nbr;
            }
            this.size--;
        }
        public int getFirst(){
            if(this.size==0){
                System.out.println("list is empty");
                return -1;
            }
            return this.head.data;
        }
        public int getLast(){
            if(this.size==0){
                System.out.println("list is empty");
                return -1;
            }
            return this.tail.data;
        }
        public int getAt(int idx){
            Node temp = this.head;
            if(this.size==0){
                System.out.println("list is empty");
                return -1;
            }
            else if(idx>=this.size||idx<0){
                System.out.println("Enter valid index");
                return -1;
            }
            else{
                while(idx>0){
                    temp=temp.next;
                }
                return temp.data;
            }
        }
    }
    public static void main(String[] args) {
        Ll list = new Ll();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println("size: "+list.size());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAt(0));
        list.display();
        list.removefirst();
        list.display();

    }
}
