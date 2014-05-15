package org.gradle;

public aspect InSourceAspect {
    
    Object around() : execution( * org.gradle..Target*.src*Target(..))
    {
        return "success";
    }

}
