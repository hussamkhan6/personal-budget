import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
/**
 *
 * Hussam Khan
 * 10/3/2019
 */
public class Driver
{
    public static void main(String[] args) 
    {
        try
        {
            File file = new File("Inventory.txt");
            String line;
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            String[] parts = line.split(" ");
            int i1 = Integer.parseInt(parts[0]);
            int i2 = Integer.parseInt(parts[1]);
            int i3 = Integer.parseInt(parts[2]);
            int i4 = Integer.parseInt(parts[3]);
            int i5 = Integer.parseInt(parts[4]);
            warehouse wh1 = new warehouse("Atlanta",i1,i2,i3,i4,i5);

            line = bufferedReader.readLine();
            parts = line.split(" ");
            i1 = Integer.parseInt(parts[0]);
            i2 = Integer.parseInt(parts[1]);
            i3 = Integer.parseInt(parts[2]);
            i4 = Integer.parseInt(parts[3]);
            i5 = Integer.parseInt(parts[4]);
            warehouse wh2 = new warehouse("baltimo",i1,i2,i3,i4,i5);

            line = bufferedReader.readLine();
            parts = line.split(" ");
            i1 = Integer.parseInt(parts[0]);
            i2 = Integer.parseInt(parts[1]);
            i3 = Integer.parseInt(parts[2]);
            i4 = Integer.parseInt(parts[3]);
            i5 = Integer.parseInt(parts[4]);
            warehouse wh3 = new warehouse("chicago",i1,i2,i3,i4,i5);

            line = bufferedReader.readLine();
            parts = line.split(" ");
            i1 = Integer.parseInt(parts[0]);
            i2 = Integer.parseInt(parts[1]);
            i3 = Integer.parseInt(parts[2]);
            i4 = Integer.parseInt(parts[3]);
            i5 = Integer.parseInt(parts[4]);
            warehouse wh4 = new warehouse("denver",i1,i2,i3,i4,i5);

            line = bufferedReader.readLine();
            parts = line.split(" ");
            i1 = Integer.parseInt(parts[0]);
            i2 = Integer.parseInt(parts[1]);
            i3 = Integer.parseInt(parts[2]);
            i4 = Integer.parseInt(parts[3]);
            i5 = Integer.parseInt(parts[4]);
            warehouse wh5 = new warehouse("Ely",i1,i2,i3,i4,i5);

            line = bufferedReader.readLine();
            parts = line.split(" ");
            i1 = Integer.parseInt(parts[0]);
            i2 = Integer.parseInt(parts[1]);
            i3 = Integer.parseInt(parts[2]);
            i4 = Integer.parseInt(parts[3]);
            i5 = Integer.parseInt(parts[4]);
            warehouse wh6 = new warehouse("fargo",i1,i2,i3,i4,i5);
            fileReader.close();

            file = new File("Transactions.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while(true)
            {
                String line1 = bufferedReader.readLine();
                if(line1 == null)
                {
                    break;
                }
                parts = line1.split(" ");
                String ss = parts[0];
                int item_num = Integer.parseInt(parts[1]);
                int tmp = Integer.parseInt(parts[2]);
                if(ss.equals("P"))
                {
                    //find ware house with mininum items
                    int item = 0;
                    if(item_num == 102)
                    {
                        item = 0;
                    }
                    else if(item_num == 215)
                    {
                        item = 1;
                    }
                    else if(item_num == 410)
                    {
                        item = 2;
                    }
                    else if(item_num == 525)
                    {
                        item = 3;
                    }
                    else
                    {
                        item = 4;
                    }

                    int whouse_mith_min_items = 1;
                    int tmp_min = wh1.items[item];
                    if(wh1.items[item] < tmp_min)
                    {
                        tmp_min = wh1.items[item];
                        whouse_mith_min_items = 1;
                    }
                    if(wh2.items[item] < tmp_min)
                    {
                        tmp_min = wh2.items[item];
                        whouse_mith_min_items = 2;
                    }
                    if(wh3.items[item] < tmp_min)
                    {
                        tmp_min = wh3.items[item];
                        whouse_mith_min_items = 3;
                    }
                    if(wh4.items[item] < tmp_min)
                    {
                        tmp_min = wh4.items[item];
                        whouse_mith_min_items = 4;
                    }
                    if(wh5.items[item] < tmp_min)
                    {
                        tmp_min = wh5.items[item];
                        whouse_mith_min_items = 5;
                    }
                    if(wh6.items[item] < tmp_min)
                    {
                        tmp_min = wh6.items[item];
                        whouse_mith_min_items = 6;
                    }

                    if(whouse_mith_min_items == 1){wh1.items[item] = wh1.items[item] + tmp;}
                    else if(whouse_mith_min_items == 2){wh2.items[item] = wh2.items[item] + tmp;}  
                    else if(whouse_mith_min_items == 3){wh3.items[item] = wh3.items[item] + tmp;}  
                    else if(whouse_mith_min_items == 4){wh4.items[item] = wh4.items[item] + tmp;}  
                    else if(whouse_mith_min_items == 5){wh5.items[item] = wh5.items[item] + tmp;}  
                    else if(whouse_mith_min_items == 6){wh6.items[item] = wh6.items[item] + tmp;}  
                }
                else
                {
                    //find ware house with max items
                    int item = 0;
                    if(item_num == 102)
                    {
                        item = 0;
                    }
                    else if(item_num == 215)
                    {
                        item = 1;
                    }
                    else if(item_num == 410)
                    {
                        item = 2;
                    }
                    else if(item_num == 525)
                    {
                        item = 3;
                    }
                    else
                    {
                        item = 4;
                    }
                    int whouse_mith_min_items = 1;

                    int tmp_min = wh1.items[item];
                    if(wh1.items[item] > tmp_min)
                    {
                        tmp_min = wh1.items[item];
                        whouse_mith_min_items = 1;
                    }
                    if(wh2.items[item] > tmp_min)
                    {
                        tmp_min = wh2.items[item];
                        whouse_mith_min_items = 2;
                    }
                    if(wh3.items[item] > tmp_min)
                    {
                        tmp_min = wh3.items[item];
                        whouse_mith_min_items = 3;
                    }
                    if(wh4.items[item] > tmp_min)
                    {
                        tmp_min = wh4.items[item];
                        whouse_mith_min_items = 4;
                    }
                    if(wh5.items[item] > tmp_min)
                    {
                        tmp_min = wh5.items[item];
                        whouse_mith_min_items = 5;
                    }
                    if(wh6.items[item] > tmp_min)
                    {
                        tmp_min = wh6.items[item];
                        whouse_mith_min_items = 6;
                    }

                    if(whouse_mith_min_items == 1){wh1.items[item] = wh1.items[item] - tmp;}
                    else if(whouse_mith_min_items == 2){wh2.items[item] = wh2.items[item] - tmp;}  
                    else if(whouse_mith_min_items == 3){wh3.items[item] = wh3.items[item] - tmp;}  
                    else if(whouse_mith_min_items == 4){wh4.items[item] = wh4.items[item] - tmp;}  
                    else if(whouse_mith_min_items == 5){wh5.items[item] = wh5.items[item] - tmp;}  
                    else if(whouse_mith_min_items == 6){wh6.items[item] = wh6.items[item] - tmp;}  
                }
            }
            wh1.display();wh2.display();
            wh3.display();wh4.display();
            wh5.display();wh6.display();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

