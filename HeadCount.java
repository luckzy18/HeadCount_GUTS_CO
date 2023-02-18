import java.util.ArrayList;
import java.util.Collections;

public class HeadCount {
    private int groupSize=0;
    private int group=0;
    private ArrayList<Integer> groups=new ArrayList<>();
    private int totalCount=0;
    private int [][] array;
    public HeadCount(int [][] input){
        this.array=input;
        this.solve();
    }
    private void solve(){
        int colIndex=0;
        for(int[] column:array){
            for(int row=0;row<column.length;row++){
                if(this.array[colIndex][row]==1){
                    this.hit(colIndex,row);
                    this.addTotalGroup();
                    this.addGroups();
                    this.groupSize=0;
                }

            }
            colIndex+=1;
        }

    }
    private void addGroups(){
        this.groups.add(this.groupSize);
    }
    private void addTotalGroup(){
        this.group+=1;
    }
    private void addTotalCount(){
        this.totalCount+=1;
    }

    private void hit(int colIndex,int row){
        try{
            if(array[colIndex][row]==1){
                groupSize+=1;//adds 1 to the group
                addTotalCount();// total number of participants
                array[colIndex][row]=0;//sets to 0 after counting participant
                hit(colIndex,row+1);//right
                hit(colIndex,row-1);//left
                hit(colIndex+1,row);//low
                hit(colIndex-1,row);//high
            }}catch(Exception IndexOutOfBoundsException){

        }
    }
    public void printAll(){
        this.sortGroups();
        System.out.println("groups: "+groups);
        System.out.println("total Count: "+totalCount);
        System.out.println("total groups: "+group);

    }
    private void sortGroups() {
        groups.sort(Collections.reverseOrder());
    }

}


