
public class LinkedList {

	
	public Section glavni;
	public int velicina = 0;
	

	public void addNode(char data) 
	{
		Section novi = new Section(data);
		Section pomocni = glavni;
		if(glavni==null)
		{
			glavni = novi;
		}
		else
		{
			while(pomocni.next != null)
			{
				pomocni = pomocni.next;
			}
			pomocni.next=novi;
		}
		
		velicina++;
	}
	
	public  void printAll()
	{
		if(glavni == null)
			return;
		Section pomocni = glavni;
		while(pomocni!=null)
		{
			Entry temp = pomocni.down;
			System.out.println(pomocni.data + ":");
			while(temp != null)
			{
				System.out.println(temp.getPrezime() + " " + temp.getIme() + " " + temp.getBroj());
				temp = temp.down;
			}
			System.out.println();
			pomocni = pomocni.next;
			
		}
		
		

	}
	
	public Entry insert(String s1,String s2,String s3)
	{
		Entry novi = new Entry(s1,s2,s3);
		Section pomocni = glavni;
		
	
		while(pomocni.data != novi.getPrezime().charAt(0))
		{
			pomocni = pomocni.next;
		}
		if(pomocni.down == null)
		{
			pomocni.down = novi;
		}
		else
		{
			Entry temp = pomocni.down;
			while(temp.down != null)
				temp = temp.down;
			temp.down = novi;		
		}
		return novi;
		
	}
	
	public  void printSpecificSection(char x)
	{
		Section pomocni = glavni;
		
		
		while(pomocni.data != x)
		{
			pomocni = pomocni.next;
		}
		System.out.println(pomocni.data + ":");
		Entry temp = pomocni.down;
		while(temp != null)
		{
			System.out.println(temp.getPrezime() + " " + temp.getIme() + " " + temp.getBroj());
			temp = temp.down;
		}
		System.out.println();
	}
	
	public void delete(Entry e)
	{
		
		Section pomocni = glavni;
				
		//Going thru the phone book
		for(int t = 1; t <= velicina; t++)
		{
			// Pointer for the first Entry in the Section
			Entry temp = pomocni.down;
			
			// If the Section have no entries
			if(pomocni.down == null)
			{
				pomocni = pomocni.next;
			}
			// If the first Entry is equal 
			else if(temp == e)
			{
				pomocni.down = temp.down;
				temp.down = null;	
			}
			else
			{
				Entry pokazivac = pomocni.down;
			
				while(pokazivac.down != e && pokazivac.down != null)
				{
					pokazivac = pokazivac.down;
				}
				// If the Entry is not in this Section, go to next Section
				if(pokazivac.down == null)
				{
					pomocni = pomocni.next;
				}	
				// Deleting the entry
				else
				{
					Entry brisanje = pokazivac.down;
					pokazivac.down = brisanje.down;
					brisanje.down = null;
					break;
				}
			}
		}
	}
	
	
	// Method that inserts the Entry and the Section if there is none
	public Entry insertBoth(String s1,String s2,String s3)
	{
		Entry noviEntry = new Entry(s1,s2,s3);
		Section pomocni = glavni;
		
		
		// If the phone book is empty
		if(glavni == null)
		{
			Section noviSection = new Section(noviEntry.getPrezime().charAt(0));
			glavni = noviSection;
			noviSection.down = noviEntry;
		}
		// If the first Section contains entries	
		else if(glavni.data == noviEntry.getPrezime().charAt(0))
		{
			Entry temp = pomocni.down;
			while(temp.down != null)
			{
				temp = temp.down;
			}
			temp.down = noviEntry;
		}
		// Inserting the 2nd Section or if the 2nd Section contains entries
		else if(pomocni.next == null || pomocni.next.data == noviEntry.getPrezime().charAt(0))
		{
			if(pomocni.next == null)
			{
				Section noviSection = new Section(noviEntry.getPrezime().charAt(0));
				pomocni.next = noviSection;
				if(noviSection.down == null)
				{
					noviSection.down = noviEntry;
				}
				else
				{
					Entry temp = pomocni.down;
					while(temp.down != null)
					{
						temp = temp.down;
					}
					temp.down = noviEntry;
				}
			}
			else
			{
				Entry temp = pomocni.next.down;
				while(temp.down != null)
				{
					temp = temp.down;
				}
				temp.down = noviEntry;
			}
		}
		// Inserting all other Entries and Sections
		else 
		{
			// Going thru the phone book
			while(pomocni != null)
			{
				// If there is already Section for the Entry
				if(pomocni.data == noviEntry.getPrezime().charAt(0)) // !
				{
					Entry temp = pomocni.down;
					while(temp.down != null)
					{
						temp = temp.down;
					}
					temp.down = noviEntry;
					break;
				}
				// If there is no Section for the Entry
				else if(pomocni.next == null)
				{
					while(pomocni.next != null)
						pomocni = pomocni.next;
					Section noviSection = new Section(noviEntry.getPrezime().charAt(0));
					noviSection.down = noviEntry;
					pomocni.next = noviSection;
					break;
				}
				pomocni = pomocni.next;
			}		
		}
		
		velicina++;
		return noviEntry;
	}
}
