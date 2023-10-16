public class TOH 
{
    public static void tower(int n,char from , char to , char help)
    {
        if(n==0) return;
        tower(n-1,from,help,to);
        System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
        tower(n-1,help,to,from);
    }
    public static void main(String []pavan)
    {
        tower(3,'A','C','B');
    }
}