package com.pduleba.property.registrar;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.stereotype.Component;

import com.pduleba.property.editor.UserTaskPropertyEditor;
import com.pduleba.task.UserTask;

@Component("userTypePropertyEditorRegistrar")
public class UserTaskPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(UserTask.class, new UserTaskPropertyEditor());
	}

}
