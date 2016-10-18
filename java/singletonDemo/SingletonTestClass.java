package singletonDemo;

class SingletonTestClass {
	private static SingletonTestClass INSTANCE;
	int i=5;
	private SingletonTestClass()
	{
		
	}
	
	public static SingletonTestClass getInstance()
	{
		if(INSTANCE==null)
		{
			INSTANCE=new SingletonTestClass();
			return INSTANCE;
		}
		else
			return INSTANCE;
	}
	
}
