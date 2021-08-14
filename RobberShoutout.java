import java.util.Scanner;
public class RobberShoutout{
    public static int robber , start , gap ;
    public static void accept(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Robber : ");
        robber = scanner.nextInt();
        System.out.print("Enter the robber with whom sam start shooting : ");
        start = scanner.nextInt();
        System.out.print("Enter the Gap between the robber : ");
        gap = scanner.nextInt();
    }
    public static void main(String[] args) {
        accept();
        boolean[] Robber = new boolean[robber];
        int index = start -1 ;
        int deathcount;
        for(deathcount=1 ; deathcount<robber ; deathcount++){
            Robber[index] = true;
            System.out.println("Target = "+(index+1)+" , "+deathcount+" Shot Complete");
            int gapCount = 0;
            while(gapCount<=gap){
                index++;
                if(index>=robber){
                    index = 0;
                }if(!Robber[index]){
                    gapCount++;
                }
            }
        }System.out.println(deathcount+" Shot taken");
        System.out.println("The Shoutout Sequence was ");
    }
}