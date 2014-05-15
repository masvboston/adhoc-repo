package org.gradle;

public aspect InMainAspect {
    
    Object around() : execution( * org.gradle..Target*.main*Target(..))
    {
        return "success";
    }

}
