package com.aem.geeks.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Demos {
    @ValueMapValue
    private String text1;
    @ValueMapValue
    private String text2;

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

}
