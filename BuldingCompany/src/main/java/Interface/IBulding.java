package Interface;

import Exceptions.IncorectLevelBuildingException;

public interface IBulding {

    void build(int level) throws IncorectLevelBuildingException;

}
