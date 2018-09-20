public class FixSizeCollection<T>{

    private static final int DEFAULT_CAPACITY =16;
    private Object[] array;
    private int pos;

    public FixSizeCollection(){
        this(DEFAULT_CAPACITY);
    }
    public FixSizeCollection(int size){
        try {
            checkSize(size);
            array=new Object[size];
        }catch (WrongCollectionSize ex){
            ex.printStackTrace();
        }
    }

    private int checkSize(int size) throws WrongCollectionSize{
        if(size<=0){
            throw new WrongCollectionSize(size);
        }
        return size;
    }

    public void add(T e){
        if(pos>=array.length){
            resize();
            pos--;
        }
        array[pos++]=e;
        System.out.println(pos);
    }
    private void resize(){
        if(array.length!=1){
            System.arraycopy(array,1,array,0,array.length-1);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <pos ; i++) {
            result.append(array[i]+" ");
        }
        return result.toString();
    }

}
