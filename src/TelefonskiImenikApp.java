
public class TelefonskiImenikApp
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		LinkedList imenik = new LinkedList();
		
		Entry prvi = imenik.insertBoth("Petrovic", "Leon", "111");
		
		Entry drugi = imenik.insertBoth("Rogelj", "Marija", "222");
		
		Entry treci = imenik.insertBoth("Apostolovic", "Miroslav", "333");
		
		Entry cetvrti = imenik.insertBoth("Reric", "Pera", "000");
		Entry peti = imenik.insertBoth("Ribic", "Zoran", "000");
		
		Entry sesti = imenik.insertBoth("Kovac", "Robert", "madjarski brojevi");
		Entry sedmi = imenik.insertBoth("Kapai", "Atila", "madjarski brojevi");

		Entry osmi = imenik.insertBoth("Plovak", "Pecanje", "909090");
		Entry deveti = imenik.insertBoth("Plemic", "Djordje", "000000");
		
		Entry deseti = imenik.insert("Rakic", "Mateja", "444");
		
		Entry jedanaesti = imenik.insertBoth("Algoritam", "Matematike", "3000");
		
		Entry dvanaesti = imenik.insertBoth("Vasiljevic", "Djordje", "2001");
		Entry trinaesti = imenik.insertBoth("Vasiljevic", "Vukasin", "2004");
		
		Entry cetrnaesti = imenik.insertBoth("Delic", "Sara", "2007");
		
		Entry petnaesti = imenik.insertBoth("Ristic", "Marko", "2007");
		
		Entry sesnaesti = imenik.insertBoth("Kvrgic", "Maja", "1");
		
		
		imenik.insertBoth("Uzelac", "Nikola", "0644954477");
		imenik.printAll();
		
		imenik.delete(trinaesti);
		imenik.printAll();
		
		/*imenik.addNode('A');
		imenik.addNode('B');
		imenik.addNode('C');
		imenik.addNode('Č');
		imenik.addNode('Ć');
		imenik.addNode('D');
		imenik.addNode('Đ');
		imenik.addNode('E');
		imenik.addNode('F');
		imenik.addNode('G');
		imenik.addNode('H');
		imenik.addNode('I');
		imenik.addNode('J');
		imenik.addNode('K');
		imenik.addNode('L');
		imenik.addNode('M');
		imenik.addNode('N');
		imenik.addNode('O');
		imenik.addNode('P');
		imenik.addNode('R');
		imenik.addNode('S');
		imenik.addNode('Š');
		imenik.addNode('T');
		imenik.addNode('U');
		imenik.addNode('V');
		imenik.addNode('Z');
		imenik.addNode('Ž');
		
		
		
		
		Entry prvi = imenik.insert("Apostolovic", "Miroslav", "123");
		
		Entry drugi = imenik.insert("Antic", "Luka", "333");
	
		Entry treci = imenik.insert("Aćić", "Luka", "999");
		Entry cetvrti = imenik.insert("Babic", "Marko", "345");
		Entry peti = imenik.insert("Bosić", "Nemanja", "666");
		
		Entry sesti = imenik.insert("Žigic","Davor","0659161515");
		Entry sedmi = imenik.insert("Haliti", "Samir", "000");
		Entry osmi = imenik.insert("Mokanj", "Ivan", "0900");
		Entry deveti = imenik.insert("Uzelac", "Nikola", "1234");
				
		imenik.delete(cetvrti);
		
		imenik.printAll();
		
		//imenik.printSpecificSection('C');
		
		
		
		//imenik.delete(x);
		 * 
		 */
		
	}
}
