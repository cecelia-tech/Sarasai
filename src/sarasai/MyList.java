package sarasai;

public class MyList {
    
    private Object[] list;
    //konstruktorius
    public MyList() {
        this.list = new Object[0];
    }

    public void add(Object o) {
        // sukuriam nauja masyva, vienu elementu didesni negu buvo
        Object[] newList = new Object[this.list.length + 1];
        
        // nukopijuojam is seno masvyo visas esamas reiksmes
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        
        // i paskutine (nauja) vieta irasom nuoroda i prideta objekta
        newList[newList.length - 1] = o;
        
        
        // nuo siol naudosimes ilgesniu masyvu
        this.list = newList;
        //System.out.println(this.list[this.list.length - 1]);
    }

    public void remove(int index) {
        // jei index < 0 arba didesnis arba lygus uz esama saraso ilgi - nedaro nieko
if (index < 0 || index >= this.list.length) {
            return;
        }
        Object [] newArr = new Object[this.list.length-1];
        /**/
        for (int i = 0; i < this.list.length; i++) {
            if (index == i) {
                newArr[i] = this.list[i+1];
                i++;
            }else
           newArr[i] = this.list[i];
        }
        this.list = newArr;
    }

    public Object get(int index) {
        // cia dar reikia pataisyt
        if (index < 0 || index > this.list.length - 1) {
            return null;
        }
       
        return this.list[index];
    }

    public void set(int index, Object o) {
        this.list[index] = o;

    }

    public void insert(int index, Object o) {
        if (index < 0 || index >= this.list.length) {
            return;
        }
        // jei index < 0 arba didesnis arba lygus uz esama saraso ilgi - nedaro nieko
        Object [] newO = new Object [this.list.length + 1];
        Object temp = null;
        for (int i = 0; i < newO.length; i++) {
            Object object = newO[i];
            newO[i] = this.list[i];
            if (index == i) {
                temp = this.list[i];
                newO[i] = o;
            }
            
        }
        this.list = newO;
    }

    public int size() {
        return this.list.length;
    }

    @Override
    public String toString() {
        if (this.list.length == 0) {
            return "{}";
        }
        String s = "";
            for (int i = 0; i < this.list.length; i++) {
                Object object = this.list[i];
                if (i == this.list.length - 1) {
                    s = s  + object;
                }else
                s = s  + object + ", ";
               //System.out.println("----------");
                //System.out.println(s);
               
            }
            return "{" + s + '}'; 
        
    }

    

}
