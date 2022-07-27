public class SpaceRemover {
    static String SpaceRemove(String l){
    CharSequence space = " ";
        if(l.contains(space)) {
            l = l.replaceAll(" ", "");
        }
        return l;
    }
}
