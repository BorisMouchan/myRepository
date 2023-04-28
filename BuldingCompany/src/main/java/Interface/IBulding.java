package Interface;

import Exceptions.IncorectLevelBuilding;

public interface IBulding {

    void build(int level) throws IncorectLevelBuilding;

}
