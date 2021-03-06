package net.lidskialf.jrename;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassDetails {
	
	public String name;
	public String superName;
	public String[] interfaces;
	public boolean isInterface;
	
	public List<ClassMemberDetails> fields = new ArrayList<ClassMemberDetails>();
	public HashMap<String, String> fieldOldToNewNameMapping = new HashMap<String, String>();
	public HashMap<String, Boolean> fieldNewNameUsed = new HashMap<String, Boolean>();
	
	public List<ClassMemberDetails> methods = new ArrayList<ClassMemberDetails>();
	public HashMap<String, String> methodOldToNewNameMapping = new HashMap<String, String>();
	public HashMap<String, Boolean> methodNewNameUsed = new HashMap<String, Boolean>();

	public ClassDetails(String name, String superName, String[] interfaces, boolean isInterface) {
		this.name = name;
		this.superName = superName;
		this.interfaces = interfaces;
		this.isInterface = isInterface;
	}
	
	public ClassMemberDetails AddField(String fieldName, String fieldDesc, Object value) {
		ClassMemberDetails cmd = new ClassMemberDetails(fieldName, fieldDesc, value);
		fields.add(cmd);
		return cmd;
	}
	
	public ClassMemberDetails AddMethod(String methodName, String desc) {
		ClassMemberDetails cmd = new ClassMemberDetails(methodName, desc);
		methods.add(cmd);
		return cmd;
	}
}
