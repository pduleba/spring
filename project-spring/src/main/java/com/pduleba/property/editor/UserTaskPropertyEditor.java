package com.pduleba.property.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.core.convert.converter.Converter;

import com.pduleba.property.converter.StringToUserTaskConverter;
import com.pduleba.task.UserTask;

public class UserTaskPropertyEditor extends PropertyEditorSupport {

	private Converter<String, UserTask> converter = new StringToUserTaskConverter();
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		super.setValue(converter.convert(text));
	}
}
