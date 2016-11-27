package com.nextmatch.vero.jsonapiadapter.model;

/**
 * @author vero
 * @since 2016. 11. 16.
 */
public class Resource {

    private transient ResourceIdentifier _identifier;

    public void setIdentifier(Integer id) {
        getIdentifier().setId(id);
    }

    public ResourceIdentifier getIdentifier() {
        if (_identifier == null)
            _identifier = ResourceIdentifier.create(this, null);

        return _identifier;
    }

}