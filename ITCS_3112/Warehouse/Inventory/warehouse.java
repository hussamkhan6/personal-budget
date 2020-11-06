
/**
 *
 * Hussam Khan
 * 10/3/2019
 */
public class warehouse
{
    public String name ;
    public int items[] = new int[5];

    public warehouse(String name, int a1, int a2, int a3, int a4, int a5) 
    {
        this.name = name;
        this.items[0] = a1;
        this.items[1] = a2;
        this.items[3] = a4;
        this.items[4] = a5;
        this.items[2] = a3;
    }

    public warehouse() 
    {
        this.name = "";
        this.items[0] = 0;
        this.items[1] = 0;
        this.items[3] = 0;
        this.items[4] = 0;
        this.items[2] = 0;
    }

    void display()
    {
        System.out.println(this.name + "\t\t"+ this.items[0] + "\t" + this.items[1] + "\t" + this.items[2] + "\t"+ this.items[3]+ "\t" + this.items[4]);
    }

}