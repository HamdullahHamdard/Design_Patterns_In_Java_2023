package IteratorDesignPattern;

public class CollectionOfNames implements Container {

    // collections of names
    public String name[] = {"Hamdullah", "Hamdard", "Haji", "Khan","Mohammad", "Farid"};

    // return the instance of this class to show all list
    public Iterator getIterator(){
        return new CollectionOfNamesIterator();
    }

    // private class to show list
    private class CollectionOfNamesIterator implements Iterator{

        int i;
        @Override
        public boolean hasNext() {
         
            // if list have names then return true
            if(i<name.length){
                return true;
            }
            // if list don't have names then return false and close the iteration
            return false;
        }

        @Override
        public Object next() {
            // if list has next then return name and increment the i variable to retrive another name from list
            if(this.hasNext()){
                return name[i++];
            }
            // if not return false and close the iteration
            return false;
        }
        
    }
}
