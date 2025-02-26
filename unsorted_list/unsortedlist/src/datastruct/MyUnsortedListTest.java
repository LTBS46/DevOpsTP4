package datastruct;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnsortedListTest {

	@Test
	public void AddPoptest() {
		UnsortedList<Integer> list = MyUnsortedList.of();

		list.append(6);
		list.append(5);
		assertTrue("get first element", 6==list.pop());
		assertTrue("get second element", 5==list.pop());
	}
	
	@Test
	public void IsEmpty() {
		UnsortedList<Integer> list = MyUnsortedList.of();

		assertTrue("liste vide empty", list.isEmpty());
		list.append(1);
		assertFalse("liste non vide empty", list.isEmpty());
	
	}
	//truc
	
	@Test
	// Met en evidence un probleme de mise a jour de size lors du remove
	public void Remove() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		
		list.append(7);
		list.append(2);
		list.append(1);
		list.remove(2);
		assertTrue("test element apres remove", 7==list.pop());
		assertTrue("test element apres remove", 2==list.pop());
		assertTrue("liste non vide empty", list.isEmpty());
		
	
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void Remove2() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.append(1);
		list.append(2);
		list.append(1);
		list.remove(list.size());
	
	}
	@Test(expected = EmptyListException.class)
	public void popEmpty() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.append(1);
		list.pop();
		list.pop();
	
	}
	
	@Test
	public void Insert() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		
		list.append(7);
		list.append(5);
		list.append(8);
		list.append(2);
		list.insert(1,2);
		list.pop();
		list.pop();
		
		assertTrue("test element apres remove", 1==list.pop());
	
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void RemoveEmpty() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		
		list.remove(0);
			}
	//truc
	@Test
	public void Removelast() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.append(7);
		list.remove(0);
		assertTrue("test element apres remove", list.isEmpty());
	}
	@Test
	public void InsertUn() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		
		list.append(7);
		list.append(5);
		list.append(8);
		list.insert(154,1);
		assertTrue("test element apres remove", 154==list.remove(1));
	}
	
	
	// met en evidence un non respect des exception dans la specification des fonctions
	@Test(expected = EmptyListException.class)
	public void poplast() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		
	
		list.popLast();
			}
	
	
	// Met en evidence un probleme de mise a jour de size lors du remove
	@Test
	public void size() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		list.append(7);
		list.prepend(5);
		list.insert(8,1);
		list.append(76);
		list.prepend(55);
		list.insert(87,1);
		list.insert(154,1);
		assertTrue("test size", 7==list.size());
		list.pop();
		assertTrue("test size pop", 6==list.size());
		list.remove(0);
		assertTrue("test size remove", 5==list.size());
		list.popLast();
		assertTrue("test size poplast", 4==list.size());
	}



	@Test
	public void equals() {
		UnsortedList<Integer> list = MyUnsortedList.of();
		UnsortedList<Integer> list2 = MyUnsortedList.of();
		list.append(7);
		list.prepend(5);
		list2.append(7);
		list2.prepend(5);
		
		assertTrue("test equals", list.equals(list2));
	}
	
}
