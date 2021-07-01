package com.leketo.lolilo.sys;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocalizedString implements Serializable {

    private static final Gson GSON = new Gson();
    private Locale dafaultLocale = new Locale("es-PY");

    protected String jsonContent;
    protected Map<String, String> localizedContent;


    public LocalizedString(String jsonContent) {
        this.jsonContent = jsonContent;
        if (jsonContent != null && jsonContent.startsWith("{")) {
            localizedContent = GSON.fromJson(jsonContent, Map.class);
        } else {
            localizedContent = new HashMap<>();
            if (StringUtils.isNotBlank(jsonContent))
                localizedContent.put(dafaultLocale.getLanguage(), jsonContent);
        }
    }

    public String getLocalizedValue() {
        return getLocalizedValue(dafaultLocale);
    }

    public String getLocalizedValue(Locale locale) {
        String userLocaleMsg = localizedContent.get(locale.getLanguage());
        if (StringUtils.isNotBlank(userLocaleMsg))
            return userLocaleMsg;
        else {
            String defaultLocaleMsg = localizedContent.get(dafaultLocale.getLanguage());
            if (StringUtils.isNotBlank(defaultLocaleMsg))
                return defaultLocaleMsg;
            else if (!localizedContent.isEmpty()) {
                Map.Entry<String, String> entry = localizedContent.entrySet().iterator().next();
                return entry.getValue();
            }
        }
        return null;
    }

    public Map<String, String> getLocalizedContent() {
        return localizedContent;
    }

    public String toJson() {
        return GSON.toJson(localizedContent);
    }

    @Override
    public String toString() {
        return toJson();
    }

    public LocalizedString merge(LocalizedString localizedName) {
        if (localizedName != null) {
            localizedContent.putAll(localizedName.localizedContent);
        }
        return this;
    }

}
