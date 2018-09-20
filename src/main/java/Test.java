public class Test {
    public static void main(String[] args) {
        FixSizeCollection<Integer> collection =new FixSizeCollection<Integer>();
        FixSizeCollection collectionWrong =new FixSizeCollection(-10);
        FixSizeCollection collectionWrong2 =new FixSizeCollection(0);
        FixSizeCollection<Integer> collection1 = new FixSizeCollection<Integer>(1);

      //  FixSizeCollection fixSizeCollection = new FixSizeCollection(Integer.MAX_VALUE);

        for (int i = 0; i <20 ; i++) {
            collection.add(i);

            System.out.println(collection);
        }

//        collection.add("Cat");
        collection1.add(10);
        collection1.add(11);
        collection1.add(12);
        System.out.println(collection1);
//        collection.add(new Exception());
//        System.out.println(collection);
    }
}
