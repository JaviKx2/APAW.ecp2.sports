package apaw.p2.sport.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import apaw.p2.sport.daos.UserDao;
import apaw.p2.sport.entities.User;

public class UserDaoMemory extends GenericMemoryDao<User> implements UserDao {
	
	public UserDaoMemory(){
		this.setMap(new HashMap<Integer, User>());
	}

	@Override
	public List<String> findUsersBySport(int sportId) {
		List<User> users = findAll();
		List<String> nicknames = new ArrayList<>();
		for (User user : users) {
			if (user.getSport().getId() == sportId) {
				nicknames.add(user.getNick());
			}
		}
		return nicknames;
	}

	@Override
	protected Integer getId(User entity) {
		return entity.getId();
	}

	@Override
	protected void setId(User entity, Integer id) {
		entity.setId(id);
	}

}
