package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {
	private ArrayList<Person> personRegistry = new ArrayList<Person>();
    public RegisterResult registerVoter(Person p) {
		
		if(p.getAge() < 18 && p.getAge() > 0){
			return RegisterResult.UNDERAGE;
		}
		else if(!p.isAlive()){
			return RegisterResult.DEAD;
		}
		else if(p.getAge() < 0 || p.getAge() >105){
			return RegisterResult.INVALID_AGE;
		}
		for(Person per: personRegistry){
			if(p.getId() == per.getId()){
				return RegisterResult.DUPLICATED;
			}
			
		}
		personRegistry.add(p);
        return RegisterResult.VALID;
    }
}