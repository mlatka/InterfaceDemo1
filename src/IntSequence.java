public interface IntSequence {
   default  boolean hasNext(){
       return true; // default sequence is infinite
   };
    int next();
}
