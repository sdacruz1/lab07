 package sol

 import tester.Tester

 class LunchTest {

   def testMonday(t: Tester) {
     val mondaySandwich = List("Bread", "Anchovies", "Cream Cheese", "Pickles", "Bread")
     t.checkExpect(Lunch.monday.makeSandwich, mondaySandwich)
   }

   def testTuesday(t: Tester) {
     val tuesdaySandwich = List("Bread", "Anchovies", "Anchovies", "Cream Cheese",
       "Cream Cheese", "Pickles", "Pickles", "Bread")
     t.checkExpect(Lunch.tuesday.makeSandwich, tuesdaySandwich)
   }

   def testWednesday(t: Tester) {
     val wednesdaySandwich = List("Bread", "Bread", "Cream Cheese", "Cream Cheese", "Pickles",
       "Pickles", "Bread", "Bread")
     t.checkExpect(Lunch.wednesday.makeSandwich, wednesdaySandwich)
   }

   def testThursday(t: Tester) {
     val thursdaySandwich = List("Peanut Butter", "Cream Cheese", "Pickles")
     t.checkExpect(Lunch.thursday.makeSandwich, thursdaySandwich)
   }

   def testFriday(t: Tester) {
     val fridaySandwich = List("Bread", "Peanut Butter", "Peanut Butter", "Cream Cheese",
       "Cream Cheese", "Pickles", "Pickles", "Bread")
     t.checkExpect(Lunch.friday.makeSandwich, fridaySandwich)
   }
 }

 object LunchTest extends App {
   Tester.run(new LunchTest)
 }