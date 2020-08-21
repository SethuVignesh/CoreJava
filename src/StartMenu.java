import java.io.*;
import java.util.*;


public class StartMenu {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch = 0;
		List<String> names = new ArrayList<String>();
		String name;
		String partStr;
		while(ch!=9)
		{
			System.out.println("Press 1 to add a name");
			System.out.println("Press 2 to remove a name");
			System.out.println("Press 3 to list the names added");
			System.out.println("Press 4 to list the sorted names");
			System.out.println("Press 5 to search a name");
			System.out.println("Press 6 to search part names");
			System.out.println("Press 7 to store to file");
			System.out.println("Press 8 to load from file");
			System.out.println("Press 9 to exit");
			
			ch = sc1.nextInt();
			
			switch(ch)
			{
			case 1 : 
					System.out.println("enter name to add");
					name = sc2.nextLine();
					names.add(name);
					break;
			case 2 : 
				System.out.println("enter name to remove");
				name = sc2.nextLine();
				names.remove(name);
				break;
			case 3 : 
				System.out.println("listing....");
				System.out.println(names);
				break;
			case 4: 
					System.out.println("listing by sorting and removing duplis...");
					Set<String> ts = new TreeSet<String>(names);
					//ts.addAll(names);
					System.out.println(ts);
					break;		
			case 5 : 
					System.out.println("enter name to search");
					name = sc2.nextLine();
					System.out.println("Is "+name+" there in coll ? "+names.contains(name));
					break;
			case 6 : 
				System.out.println("enter part string to search");
				partStr = sc1.next();
				for(String s : names)
				{
					if(s.contains(partStr))
						System.out.println("match found "+s);
				}
				break;
			case 7 : 
				System.out.println("storing to file...");
				BufferedWriter bw = null;
				try
				{
					bw = new BufferedWriter(new FileWriter("/USER/Documents/names.txt", true));
					for(String s:names)
					{
						bw.write(s);
						bw.newLine();
					}
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				finally
				{
					if( bw!=null)
						try {
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				break;
			case 8 : 
				System.out.println("loading from file...");
				
				BufferedReader br = null;
				try
				{
					br = new BufferedReader(new FileReader("/Users/vikramshastry/Desktop/names.txt"));
					String line;
					names.clear();
					while((line=br.readLine())!=null)
					{
						names.add(line);
					}
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				finally
				{
					if(br!=null)
						try {
							br.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}





				break;				
			case 9:
					System.out.println("tata bye bye. miss u...");
					break;
			default:
					System.out.println("Yakappa, enter 1-9 only");
			}
			
		}
		

	}

}









