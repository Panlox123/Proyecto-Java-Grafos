package aed_proy_final;
public class GrafoPESO {
    public int numVertices;
    public int[][] adjMatrix;
    public GrafoPESO(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix=new int[numVertices+1][numVertices+1]; // Ajuste para comenzar desde 1
        for(int i=1;i<=numVertices;i++){ // Comenzar desde 1 
            for(int j=1;j<=numVertices;j++){
                adjMatrix[i][j]=Integer.MAX_VALUE; //No hay arista
            }
        }
    }
    public void addArista(int i,int j,int peso){
        if(i>=0&&i<=numVertices&&j>0&&j<=numVertices){
            adjMatrix[i][j]=peso;
        }
    }
    public void deleteArista(int i, int j){
        if(i>0&&i<=numVertices&&j>0&&j<=numVertices){
            adjMatrix[i][j]=Integer.MAX_VALUE;
            
        }
    }
    
    public void printAdjMatrix(){
        for(int i=1;i<=numVertices;i++){ //Comenzar desde vertice "1"
            for(int j=1;j<=numVertices;j++){ //Comenzar desde vertice "1"
                System.out.print(adjMatrix[i][j]==Integer.MAX_VALUE ?"---\t": adjMatrix[i][j]  +"\t");
            }
            System.out.println();
        }
    }
}
