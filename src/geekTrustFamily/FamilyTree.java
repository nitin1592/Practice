package geekTrustFamily;

import java.util.Arrays;
import java.util.HashMap;

public class FamilyTree {
	HashMap<String, Node> mothersMap;
	
	public String addChild(String mother, String childToAdd, String gender) {
		String result = "";
		try {
			if (!mothersMap.containsKey(mother))
				result = "PERSON_NOT_FOUND";
			else {
				Node parent = mothersMap.get(mother);
				
				if (parent.isMale || parent.spouse==null)
					result = "CHILD_ADDITION_FAILED";
				else {
					boolean isMale = gender.equalsIgnoreCase("male");
					Node newNode = new Node(childToAdd, parent, null, isMale);
					parent.children.add(newNode);
					result = "CHILD_ADDITION_SUCCEEDED";
				}
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error in addition of child");
			e.printStackTrace();
		}
		return result;
	}
	
	public void getRelation(String name, String relation) {
		
	}
	
	public void printMap() {
		System.out.println(mothersMap.size());
		System.out.println(mothersMap.toString());
	}
	
	public void initialiseFamilyTree() {
		mothersMap = new HashMap<String, Node>();
		
		/* Adding King and Queen */
		Node king_Shan = new Node("King Shan", null, null, true);
		Node queen_Anga = new Node("Queen Anga", null, king_Shan, false);
		king_Shan.spouse = queen_Anga;
		mothersMap.put(queen_Anga.name, queen_Anga);
		
		/* Adding nodes at 1st level */
		
		Node chit = new Node("Chit", queen_Anga, null, true);
		Node amba = new Node("Amba", null, chit, false);
		chit.spouse = amba;
		mothersMap.put(amba.name, amba);
		
		Node ish = new Node("Ish", queen_Anga, null, true);
		
		Node vich = new Node("Vich", queen_Anga, null, true);
		Node lika = new Node("Lika", null, vich, false);
		vich.spouse = lika;
		mothersMap.put(lika.name, lika);
		
		Node aras = new Node("Aras", queen_Anga, null, true);
		Node chitra = new Node("Chitra", null, aras, false);
		aras.spouse = chitra;
		mothersMap.put(chitra.name, chitra);
		
		Node satya = new Node("Satya", queen_Anga, null, false);
		Node vyan = new Node("Vyan", null, satya, true);
		satya.spouse = vyan;
		mothersMap.put(satya.name, satya);
		
		queen_Anga.children.addAll(Arrays.asList(chit, ish, vich, aras, satya));
		
		/* Adding nodes at 2nd level */
		
		Node dritha = new Node("Dritha", amba, null, false);
		Node jaya = new Node("Jaya", null, dritha, true);
		dritha.spouse = jaya;
		mothersMap.put(dritha.name, dritha);
		Node tritha = new Node("Tritha", amba, null, false);
		Node vritha = new Node("Vritha", amba, null, true);
		
		amba.children.addAll(Arrays.asList(dritha, tritha, vritha));
		
		
		Node vila = new Node("Vila", lika, null, false);
		Node chika = new Node("Chika", lika, null, false);
		
		lika.children.addAll(Arrays.asList(vila, chika));
		
		
		Node jnki = new Node("Jnki", chitra, null, false);
		Node arit = new Node("Arit", null, jnki, true);
		jnki.spouse = arit;
		mothersMap.put(jnki.name, jnki);
		Node ahit = new Node("Ahit", chitra, null, true);
		
		chitra.children.addAll(Arrays.asList(jnki, ahit));
		
		
		Node asva = new Node("Asva", satya, null, true);
		Node satvy = new Node("Satvy", null, asva, false);
		asva.spouse = satvy;
		mothersMap.put(satvy.name, satvy);
		
		Node vyas = new Node("Vyas", satya, null, true);
		Node krpi = new Node("Krpi", null, vyas, false);
		vyas.spouse = krpi;
		mothersMap.put(krpi.name, krpi);
		
		Node atya = new Node("Atya", satya, null, false);
		
		satya.children.addAll(Arrays.asList(asva, vyas, atya));
		
		
		/* Adding nodes at 3rd level */
		
		Node yodhan = new Node("Yodhan", dritha, null, true);
		dritha.children.add(yodhan);
		
		Node laki = new Node("Laki", jnki, null, true);
		Node lavnya = new Node("Lavnya", jnki, null, false);
		jnki.children.addAll(Arrays.asList(laki, lavnya));
		
		Node vasa = new Node("Vasa", satvy, null, true);
		satvy.children.add(vasa);
		
		Node kriya = new Node("Kriya", krpi, null, true);
		Node krithi = new Node("Krithi", krpi, null, false);
		krpi.children.addAll(Arrays.asList(kriya, krithi));
	}
}