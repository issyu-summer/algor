package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main207 {

    class Trie {

    class TireNode {
        boolean end;
        TireNode[] next;

         public TireNode(){
             end=false;
             next=new TireNode[26];
         }
    }

    private TireNode root;

    public Trie(){
        root=new TireNode();
    }

    public void insert(String word){
        TireNode node=root;
        for(char c:word.toCharArray()){
            if(node.next[c-'a']==null){
                node.next[c-'a']= new TireNode();
            }
            node=node.next[c-'a'];
        }
        node.end=true;
    }

    public boolean search(String word){
        TireNode node=root;
        for (char c:word.toCharArray()) {
            node=node.next[c-'a'];
            if(node==null){
                return false;
            }
        }
        return node.end;
    }

    public boolean startsWith(String prefix){
        TireNode node=root;
        for (char c:prefix.toCharArray()) {
            node=node.next[c-'a'];
            if(node==null){
                return false;
            }
        }
        return true;
    }
}
}
