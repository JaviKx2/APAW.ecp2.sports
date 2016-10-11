package apaw.p2.sport.daos.memory;

import java.util.HashMap;
import apaw.p2.sport.daos.SportDao;
import apaw.p2.sport.entities.Sport;

public class SportDaoMemory extends GenericMemoryDao<Sport> implements SportDao {

	public SportDaoMemory() {
		this.setMap(new HashMap<Integer, Sport>());
	}

	@Override
	protected Integer getId(Sport entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setId(Sport entity, Integer id) {
		// TODO Auto-generated method stub

	}

}
