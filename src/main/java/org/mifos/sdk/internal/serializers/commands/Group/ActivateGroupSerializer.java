/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifos.sdk.internal.serializers.commands.group;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.mifos.sdk.group.domain.commands.ActivateGroupCommand;
import org.mifos.sdk.internal.ParseUtil;

import java.lang.reflect.Type;

/**
 * JSON serializer for ActivateGroup.
 */
public class ActivateGroupSerializer implements JsonSerializer<ActivateGroupCommand> {

    @Override
    public JsonElement serialize(final ActivateGroupCommand src, Type typeOfSrc,
                                 JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", src.getLocale());
        jsonObject.addProperty("dateFormat", src.getDateFormat());
        jsonObject.addProperty("activationDate", ParseUtil.parseDateToString(src.getActivationDate(),
            src.getDateFormat(), src.getLocale()));

        return jsonObject;
    }

}
