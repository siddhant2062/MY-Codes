package lecture2_Access_Modifiers;

 class Access_Modifiers {
	/*
	 * As the name suggests access modifiers in Java helps to restrict the scope of
	 * a class, constructor, variable, method, or data member. There are four types
	 * of access modifiers available in java:
	 * 
	 *1. Default – No keyword required
	 *2. Private
	 *3. Protected
	 *4. Public
	 *
	 *Table Chart for Access Modifiers
	 *
	 *
	 *							default			private			protected			public
	 *				
	 *Same Class				yes				yes				yes					yes
	 *
	 *Same Package-				yes				no				yes					yes
	 	Sub Class
	 	
	 *Same Package-				yes				no				yes					yes
	  Non Sub Class
	  
	 *Different Package-		no				no				yes					yes
	 	Sub Class
	 	
	 *Different Package-		no				no				no					yes
	  Non Sub Class
	 *
	 *
	 *
	 *
	 *1.Default: When no access modifier is specified for a class, method, or data member – It is said to be having 
	 *the default access modifier by default.
	 *The data members, class or methods which are not declared using any access modifiers i.e. having default access
	 *modifier are accessible only within the same package.   
	 *
	 *2.private: The private access modifier is specified using the keyword private.
	 * The methods or data members declared as private are accessible only within the class in which they are 
	 * declared.Any other class of the same package will not be able to access these members.	
	 *  	
	 * Top-level classes or interfaces can not be declared as private because	
	 * 		private means “only visible within the enclosing class”.
	 * 		protected means “only visible within the enclosing class and any subclasses”
	 * 
	 * Hence these modifiers in terms of application to classes, apply only to nested classes and not  on top-level 
	 * classes
	 * 
	 * 3.protected:The methods or data members declared as protected are accessible within the same package or
	 *  subclasses in different packages.
	 *  
	 * 4.public: The public access modifier is specified using the keyword public.
	 *   	The public access modifier has the widest scope among all other access modifiers.
	 *   	Classes, methods, or data members that are declared as public are accessible from everywhere in the 
	 *   program. There is no restriction on the scope of public data members.
	 *   
	 *   	
	 */

}
