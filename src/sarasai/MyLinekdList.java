package sarasai;

public class MyLinekdList {
    private Node head;
    
    //CIA YRA KONSTRUKTORIUS
    public MyLinekdList() {
        this.head = null;
    }

 

    public void add(Object o) {
        if (this.head == null) {
            this.head = new Node(o);
        } else {
            Node parent = this.head;
            while (parent.next != null) {
                parent = parent.next;
            }
            parent.next = new Node(o);
        }
    }

 
//  REIKIA TAISYT
    public void remove(int index) {
        if (index < 0) {
            //return;
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        if (index == 0) {
            if (this.head == null) {
                throw new IndexOutOfBoundsException();
                //return;
            }
            this.head = this.head.next;
        }else{
           Node previous = this.head;
            int i = 0; 
            while(i < index -1 && previous.next != null){
                previous = previous.next;
            i++;
            }
        if (previous.next == null) {
            throw new IndexOutOfBoundsException();
            //return;
        }
        previous.next = previous.next.next;
        }
      //  Node newNode = new Node();
        //int count = 0;
      /*  int i = 0;
           Node parent = this.head;
            Node m = this.head;
              while (m.next != null) {
                 
                 if (i == index) {
                    
                m.value = parent.next.value;
               // continue;
            }else{
                m = parent.next;
                }
                 i++;
            }
              this.head = m;
           
            for (int i = 0; i < size(); i++) {
                //System.out.println("======");
                //System.out.println(size());
                //System.out.println("======");
           if (i == index) {
              // System.out.println("pp");
                 parent = parent.next;
                //i++;
              // continue;
            }
//           else{
//                m = parent.next;
//           }
           
        }*/
        
             
    }

 

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            return null;
            //throw new NaujaKlaida("Nurodytas index nagali buti mazesnis uz 0 arba didesnis uz saraso ilgi");
        }
        Node n = this.head;
        Object m = n.value;
        int count = 0;
        while(n != null){
            if (count == index) {
              m = n.value;  
            }
            count++;
            n = n.next;
        }
        return m;
    }

    public void set(int index, Object o) {
        if (index < 0 || index >= size()) {
            return;
            //throw new NaujaKlaida("Nurodytas index nagali buti mazesnis uz 0 arba didesnis uz saraso ilgi");
        }
        Node n = this.head;
        int count = 0;
        while(n != null){
            if (count == index) {
              n.value = o;  
            }
            count++;
            n = n.next;
        }
    }

 

    public void insert(int index, Object o) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index is not allowed");
        }
        if (index == 0) {
            this.head = new Node(this.head, o);
        }else {
        Node previous = this.head;
        int i = 0;
        while (i < index - 1 && previous.next != null){
        previous = previous.next;
        i++;
        }
            if (previous.next == null) {
               throw new IndexOutOfBoundsException();
            }
            previous.next = new Node (previous.next, o);
        }
        
        /* CIA BUVO MANO BANDYMAS
        if (index < 0 || index >= size()) {
            return;
            //throw new NaujaKlaida("Nurodytas index nagali buti mazesnis uz 0 arba didesnis uz saraso ilgi");
        }
        Node n = this.head;
        int count = 0;
        while(n.next != null){
            if (count == index) {
                n.next = new Node(n.next, n.value); 
                n.value = o;
            }
            count++;
            n = n.next;
        }
        */
    }

 

    public int size() {
        int size = 0;
        Node n = this.head;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }

 

    public String toString() {
        String ret = "{";
        Node n = this.head;
        while (n != null) {
            ret += n.value + ", ";
            n = n.next;
        }
        ret += "}";
        return ret;
    }

 
//CIA NAUJA KLASE
    private class Node {
        Node next;
        Object value;
        //CIA KONSTRUKTORIUS
        Node (Object value) {
            this.next = null;
            this.value = value;
        }
        //CIA KONSTRUKTORIUS
        Node (Node next, Object value) {
            this.next = next;
            this.value = value;
        }
    }
}
/*
susikrti unchecked klaidos klase

 

ir metoduose remove, insert, get throw'inti klaida

 

*/

