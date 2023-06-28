public class myarray <T>{
    int size;
    int index=0;
     T element;
    T a[];
    myarray(int size){
        this.size=size;
        a=(T[])new Object [size];
    }


    void add(T element){
        if(index==size-1){
            grow();
        }
        if(index<size){
            a[index]=element;
            index++;
        }else{
            System.out.println("Array is full call grow");
        }


    }
    void swap(int id1,int id2){
        T temp;
        if(id1<size && id2<size){
            temp=a[id1];
            a[id1]=a[id2];
            a[id2]=temp;
        }else{
            System.out.println("Indexes are wrong");
        }
    }
    void grow(){
        size=(int)1.5*size;
        T temp[];
        temp=(T[])new Object [size];
        for(int i=0;i<index;i++){
            temp[i]=a[i];
        }
        a=temp;
    }
    void display(){
        for(int i=0;i<index;i++){
            System.out.println(" "+a[i]);
        }
    }
}
