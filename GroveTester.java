public class GroveTester {
    public static void main(String[]args){
        Grove grove1=new Grove("grove1");
        System.out.println(grove1);
        for(int i=0;i<6;i++){
            Tree newTree=new Tree(i,37,"Spruce");
            grove1.plantTree(newTree);
        }
        System.out.println(grove1);
        grove1.removeTree(3);
        grove1.removeTree(5);
        System.out.println(grove1);
        Tree mapleTree=new Tree(7,13,"Maple");
        grove1.plantTree(mapleTree);
        System.out.println(grove1);
    }
}
