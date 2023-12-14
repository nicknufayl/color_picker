package org.joget;

import java.util.Map;
import org.joget.apps.app.service.AppPluginUtil;
import org.joget.apps.app.service.AppUtil;
import org.joget.apps.form.lib.TextField;
import org.joget.apps.form.model.Element;
import org.joget.apps.form.model.FormBuilderPalette;
import org.joget.apps.form.model.FormBuilderPaletteElement;
import org.joget.apps.form.model.FormData;
import org.joget.apps.form.model.FormRow;
import org.joget.apps.form.model.FormRowSet;
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
	    public String getClassName() {
	        return getClass().getName();
	    }
	     
	    @Override
	    public String getFormBuilderCategory() {
	        return FormBuilderPalette.CATEGORY_CUSTOM;
	    }
	    
	    @Override
	    public String getLabel() {
	        return "Color Picker";
	    }
	  
	    @Override
	    public String getDescription() {
	        return "Color Picker Element";
	    }
	    
	    @Override
	    public String getPropertyOptions() {
	        return AppUtil.readPluginResource(getClass().getName(), "/properties/form/colorPicker.json", null, true, MESSAGE_PATH);
	    }
	    
	    @Override
	    public String getFormBuilderTemplate() {
	        return "<label class='label'>"+getLabel()+"</label>";
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
	    
		@Override
		public String getFormBuilderIcon() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getFormBuilderPosition() {
			// TODO Auto-generated method stub
			return 100;
		}

}
