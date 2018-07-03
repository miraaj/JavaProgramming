import namepackage.PackageName;

class PackageDemo{
	public static void main(String[] args) {

		PackageName [] names = new PackageName[3];
		names[0] = new PackageName("OS");
		names[1] = new PackageName("Java");
		names[2] = new PackageName("Python");	

		for( int i = 0; i < names.length; i++){
			names[i].show();
		}	
	}
}