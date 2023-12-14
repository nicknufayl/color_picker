<div class="form-cell" ${elementMetaData!}>

<script type="text/javascript" src="${request.contextPath}/plugin/org.joget.ColorPicker/js/jqueryLibrary.js"></script>
<script type="text/javascript" src="${request.contextPath}/plugin/org.joget.ColorPicker/js/colorpicker.js"></script>    
<link rel="stylesheet" href="${request.contextPath}/plugin/org.joget.ColorPicker/css/colpick.css">

<label class="label">${element.properties.label} 
	<span class="form-cell-validator">${decoration}</span>
	<#if error??> <span class="form-error-message">${error}</span></#if>
</label>

<input id="${elementParamName!}" name="${elementParamName!}" type="text" class="colorPicker" size="${element.properties.size!}" value="${value!?html}" maxlength="${element.properties.maxlength!}" 
<#if error??>class="form-error-cell"</#if> 
<#if element.properties.readonly! == 'true'>readonly</#if>
	
<script type="text/javascript">
    $(document).ready(function(){
      var field = $("#${elementParamName!}");
        $(field).colpick({
            submit: true, 
            submitText: 'OK', 
            color: field.val(),
       		onChange: function(hsb, hex, rgb, el) {
                $(field).css('background-color', '#' + hex);
            },
            onColorChange: function(id, newValue) {
                $(field).val(newValue);
            },
       		onSubmit: function(hsb, hex, rgb, el) {
	     		$(field).val('#' + hex);
	            $(el).colpickHide(); 
            }
        });
    });
</script>


</div>