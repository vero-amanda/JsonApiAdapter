package com.nextmatch.vero.jsonapiadapter.adapter;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.nextmatch.vero.jsonapiadapter.model.Resource;

/**
 * @author vero
 * @since 2016. 11. 27.
 */
public class JsonApiResponseAdapter<T extends Resource> implements JsonApiAdapter<T> {

    public JsonApiResponseAdapter(Gson context, TypeToken<T> typeToken, JsonObject jsonObject) {

    }

    @Override
    public JsonElement getJsonApiElement() {
        return null;
    }

}
