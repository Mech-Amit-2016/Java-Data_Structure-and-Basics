
package loops.forloop;
import java.util.ArrayList;

public class GraphDemo {
    public static void main(String[] args) {
        
    }

}
class Graph{
int V;
ArrayList<ArrayList<Integer>> Node=new ArrayList<ArrayList<Integer>>();
   Graph(int V){
       this.V=V;
       for(int i=0;i<V;i++)
       {
           
          Node.add(new ArrayList<Integer>());
       }
   }
  void addEdge(int u,int v,Graph g){
       
   }
}

