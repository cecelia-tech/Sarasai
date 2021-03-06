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
        //CIA   
        // jei index < 0 arba didesnis arba lygus uz esama saraso ilgi - nedaro nieko
if (index < 0 || index >= this.list.length) {
            throw new NaujaKlaida ("Nurodytas index nagali buti mazesnis uz 0 arba didesnis uz saraso ilgi");
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
        //CIA
        // cia dar reikia pataisyt
        if (index < 0 || index > this.list.length - 1) {
            throw new NaujaKlaida("Nurodytas index nagali buti mazesnis uz 0 arba didesnis uz saraso ilgi");
        }
       
        return this.list[index];
    }

    public void set(int index, Object o) {
        if (index < 0 || index >= this.list.length) {
            throw new NaujaKlaida("Nurodytas index nagali buti mazesnis uz 0 arba didesnis uz saraso ilgi");
        }
        this.list[index] = o;

    }

    public void insert(int index, Object o) {
        //CIA
        // jei index < 0 arba didesnis arba lygus uz esama saraso ilgi - nedaro nieko
        if (index < 0 || index >= this.list.length) {
            throw new NaujaKlaida("Index negali buti mazesnis uz 0 arba didesnis nei masyvo ilgis");
        }
        Object [] newO = new Object[this.list.length + 1];
        //Object temp = null;
        for (int i = 0, j = 0; i < newO.length; i++) {
            if (i == index) {
                newO[i] = o;
            }else{
            newO[i] = this.list[j++];
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
