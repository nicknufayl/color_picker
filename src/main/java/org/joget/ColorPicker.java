package org.joget;

import java.util.Map;
import org.joget.apps.app.service.AppUtil;
import org.joget.apps.form.lib.TextField;
import org.joget.apps.form.model.FormBuilderPalette;
import org.joget.apps.form.model.FormData;
import org.joget.apps.form.service.FormUtil;

public class ColorPicker extends TextField {
	
	private final static String MESSAGE_PATH = "message/form/colorPicker";

    @Override
    public String getName() {
        return "Color Picker";
    }

    @Override
    public String getVersion() {
        return "8.0";
    }

    @Override
    public String getDescription() {
        return "Color Picker Field";
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public String getFormBuilderTemplate() {
        return "<label class='label'>Color Picker</label><input type='text'/>";
    }

    @Override
    public String getLabel() {
        return "Color Picker";
    }

    @Override
    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClass().getName(), "/properties/form/colorPicker.json", null, true, MESSAGE_PATH);
    }

    @Override
    public String getFormBuilderCategory() {
    	return FormBuilderPalette.CATEGORY_CUSTOM;
    }

    @Override
    public int getFormBuilderPosition() {
        return 100;
    }

    @Override
    public String getFormBuilderIcon() {
        return "";
    }    

    @Override
    public String renderTemplate(FormData formData, Map dataModel) {
        String template = "colorPicker.ftl";

        // set value
        String value = FormUtil.getElementPropertyValue(this, formData);
        dataModel.put("value", value);

        String html = FormUtil.generateElementHtml(this, formData, template, dataModel);
        return html;
    }
    
}