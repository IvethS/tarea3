
public class Animal {

	//Trabajo Realizado Con Kevin Lanza
	

	//En esta parte se aca lo que se realizo fue declarar las variables que vamos utilizar en cada constructor
	// y las variables tipo string que son las que devolvera cada funcion de las tres

String nombre;
int edad;
String hablar;
String ladrar;
String maullar;

//aqui se crea los parametros que devolvera Animal

Animal(String nombre, int edad)
{
	this.nombre = nombre;
	this.edad = edad;
}

//Aqui esta la funcion que obtiene el nombre y nos devuelve esa variable.

String getNombre(){
return nombre;	

}

//La funcion que obtiene la edad y nos devuelve la edad.
int getEdad(){
	return edad;
}

//aqui lo que hace es establecer el nombre y manda a llamar la variable de la misma.
void setNombre(String nombre){
	this.nombre=nombre;
}

//aqui lo que hace es establecer el edad y manda a llamar la variable de la edad.
void setEdad(int edad){
	this.edad=edad;
}


}
//aqui es donde se realiza la herencia si se fijan hacemos la clase perro y de extiende al animal
//luego se manda a llamar perro y se llaman las variables
// y se crea la funcion de ladrar.
class Perro extends Animal
{
	Perro(String nombre, int edad)
	{
		super(nombre,edad);
	}
	
	String ladrar()
	{
		return ladrar;
	}
}
//aqui es donde se realiza la herencia hacemos la clase gato y de extiende al animal
//luego se manda a llamar gato y se llaman las variables
//y se crea la funcion de maullar.
class Gato extends Animal
{
	Gato(String nombre, int edad)
	{
		super(nombre,edad);
	}
	String maullar()
	{
		return maullar;
	}
}
//aqui es donde se realiza la herencia hacemos la clase loro y de extiende al animal
//luego se manda a llamar loro y se llaman las variables
//y se crea la funcion de hablar.
class Loro extends Animal
{
	Loro(String nombre, int edad)
	{
		super(nombre,edad);
	}
	
	String hablar()
	{
		return hablar;
	}
}
