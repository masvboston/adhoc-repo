package org.gradle;

public aspect InTestAspect {
    
    Object around() : execution( * org.gradle..Target*.test*Target(..))
    {
        return "success";
    }

}
