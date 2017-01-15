package com.jambo.tools.codegen.preferences;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.jambo.tools.codegen.CodegenPlugin;
import com.jambo.tools.codegen.preferences.editors.ComboFieldEditor;
import com.jambo.tools.codegen.preferences.editors.TextFieldEditor;



public class TemplatePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {
	Map map ;

	public TemplatePage() {
		super(GRID);
		setPreferenceStore(CodegenPlugin.getDefault().getPreferenceStore());
		setDescription("����ģ��Ŀ¼��\n ���š�/�����ߡ�\\����ʾʹ������Ĭ�ϵ�ģ��;\n ����Ŀ¼�󣬽������Ŀ¼�²�����Ӧ��ģ����Ŀ¼���Ҳ����ͻᱨ��;\nע�⣺Ŀ¼·��������С�\\��");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		addField(new DirectoryFieldEditor(PreferenceConstants.TEMPLATE_PATH,
				"ģ��·��", getFieldEditorParent()));
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		map = new HashMap() ;
		map.put("DAO", "DaoTemplet.templets") ;
		map.put("Delegate", "DelegateTemplet.templets") ;
		map.put("EjbClass", "EjbClassTemplet.templets") ;
		map.put("Ejbinterface", "EjbInterfaceTemplet.templets") ;
		map.put("ListVO", "ListVOTemplet.templets") ;
		map.put("Struts2Bean", "Struts2BeanTemplet.templets") ;
		map.put("Struts2Cont", "Struts2ContentTemplet.templets") ;
		map.put("Struts2Form", "Struts2FormTemplet.templets") ;
		map.put("Struts2List", "Struts2ListTemplet.templets") ;
		map.put("WebParam", "WebParamTemplet.templets") ;
		map.put("TestDlg", "TestdlgTemplet.templets") ;
	}

}