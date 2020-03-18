//package homework6;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import az.company.homeworks.homework6.Family;
//import az.company.homeworks.homework6.Human;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class FamilyTest {
//    private Family family;
//    private Human child1 = new Human("John","Miller",2013);
//    private Human child2=new Human("Jack","Miller",2015);
//    private Human[] children1=new Human[3];
//
//    @BeforeEach
//    public void BeforeEach(){
//        this.family=new Family();
//        Human[] children=new Human[3];
//        family.setChildren(children);
//        family.addChild(child1);
//        family.addChild(child2);
//    }
//    @Test
//    public void testDeleteChild(){
//        family.deleteChild(child1);
//        children1[0]=child2;
//        assertArrayEquals(children1,family.getChildren());
//    }
//    @Test
//    public void testDeleteChildByIndex(){
//        family.deleteChild(0);
//        children1[0]=child2;
//        assertArrayEquals(children1,family.getChildren());
//    }
//    @Test
//    public void testAddChild(){
//        children1[0]=child1;
//        children1[1]=child2;
//        assertArrayEquals(children1,family.getChildren());
//    }
//    @Test
//    public void testCountFamily(){
//        assertEquals(5,family.countFamily());
//    }
//    @Test
//    public void testToString(){
//        String expected = "Family{" + "mother=null"  + ", father=null" + ", children=" + Arrays.toString(family.getChildren()) + ", pet=null"  + '}';
//        assertEquals(expected, family.toString());
//    }
//    @Test
//    public  void testForEquals(){
//        String[] habits = {"eat", "drink", "sleep"};
//        Pet dog1 = new Pet(PetType.DOG, "Rock", 5, 75, habits);
//        Pet dog2 = new Pet(PetType.DOG, "Lucky", 5, 75, habits);
//        assertTrue(dog1.equals(dog2));
//    }
//
//
//}