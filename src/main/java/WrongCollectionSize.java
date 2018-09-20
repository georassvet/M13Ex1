public class WrongCollectionSize extends Exception{
    private int wrongSize;

    public WrongCollectionSize(int wrongSize){
        this.wrongSize=wrongSize;
    }

    @Override
    public String toString() {
        return wrongSize+" is wrong size";
    }
}
