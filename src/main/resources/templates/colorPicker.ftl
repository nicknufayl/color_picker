<div class="form-cell" ${elementMetaData!}>
    <script type="text/javascript" src="${request.contextPath}/plugin/org.joget.ColorPicker/js/spectrum.js"></script>
 	<link rel="stylesheet" href="${request.contextPath}/plugin/org.joget.ColorPicker/css/spectrum.css">
 	
 	<label class="label">${element.properties.label}</label>
	<input id="${elementParamName!}" name="${elementParamName!}" type="text" class="colorPicker" value="${value!?html}"<#if element.properties.readonly! == 'true'>readonly</#if> />
 
	<script type="text/javascript">
		$(document).ready(function(){ 
	        var field = $(".colorPicker");
	        $(field).spectrum({
	            type: "text",
	            shoeInput: true,
	            showInitial: true
	        });
	       });
	</script>
    
</div>