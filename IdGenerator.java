package EX9;
class IdGenerator {
    private static long next=1;
    static long nextId(){
        long i=next;
        next++;
        return i;
    }
    
}