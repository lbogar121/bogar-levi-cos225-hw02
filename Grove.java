public class Grove {
    String groveName;
    Tree[] Trees=new Tree[16];
    public Grove(String groveName){
        this.groveName=groveName;
    }
    public int plantTree(Tree tree){
        for(int i=0;i<Trees.length;i++){
            if(Trees[i]==null){
                Trees[i]=tree;
                return i;
            }
        }
        return -1;
    }
    public Tree removeTree(int spot){
        Tree oldTree=Trees[spot];
        Trees[spot]=null;
        return oldTree;
    } 
    public String toString(){
        int count=0;
        for(int i=0;i<Trees.length;i++){
            if(Trees[i]!=null){
                count++;
            }
        }
        return ""+count;
    }
}
