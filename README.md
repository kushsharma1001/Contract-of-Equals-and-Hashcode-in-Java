# Contract-of-Equals-and-Hashcode-in-Java

This explains you what happens if we add unique custom objects as keys to a HashMap and we wish to identify unique key for this HashMap.
Overriding of equals and hashcode should go together. 

* If 2 unequal objects (assume, new Account("Karan", 12345) and new Account("Anshul", 123456)) are added to HashMap and we dont override equals and hashcode, by default equals() checks reference are same or not and hashcode for 2 different objects are by default also returned unique. Hence, hashMap will add 2 unequal objects in it in 2 different buckets.

* If 2 unequal objects (assume, new Account("Karan", 12345) and new Account("Anshul", 123456)) are added to HashMap and we override equals and not hashcode, then our equals() checks same or not and hashcode for 2 different objects are by default also returned unique. Hence, hashMap will add 2 unequal objects in it in 2 different buckets.

* If 2 unequal objects (assume, new Account("Karan", 12345) and new Account("Anshul", 123456)) are added to HashMap and we override equals and hashcode in a way that hashcode is same for all objects whether same/different objects, then our equals() checks same or not and hashcode for 2 different objects are same now as per our hashcode impl. Hence, hashMap will add 2 unequal objects in it in same bucket. Its a collision.

* If 2 unequal objects (assume, new Account("Karan", 12345) and new Account("Anshul", 123456)) are added to HashMap and we override equals and hashcode in a way that hashcode is same for only equal objects, then our equals() checks same or not and hashcode for 2 different objects are different now as per our hashcode impl. Hence, hashMap will add 2 unequal objects in it in different buckets.



