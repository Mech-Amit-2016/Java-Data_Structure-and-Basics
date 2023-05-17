
package loops.forloop;
import java.util.Scanner;

public class RatMaze {
    public static void main(String[] args) {
        int [][]maze=new int[4][4];
        boolean [][]path=new boolean[4][4];
        Scanner s=new Scanner(System.in);
        System.out.println("enter the maze");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                maze[i][j]=s.nextInt();
            }
        }
        System.out.println("uhuh");
        String ans="";
        solution(ans,path,0,0,maze);
    }
 static void solution(String ans,boolean [][]path,int i,int j,int maze[][]){
     if(i==3 && j==3){
         System.out.println(ans);
         return;}
     if(i<4 && j+1<4 && maze[i][j+1]==1){
         path[i][j+1]=true;
      solution(ans+"h",path,i,j+1,maze);
         path[i][j+1]=false;}
         if(i+1<4 && j<4 && maze[i+1][j]==1){
         path[i+1][j]=true;
      solution(ans+"v",path,i+1,j,maze);
         path[i+1][j]=false;}
 }
 
}
