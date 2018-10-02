
public class Pruebas2 {
	int id;
	String nombre;

	//Constructors
	public Pruebas2() {}
	
	public Pruebas2(int id, String nombre) {
		super();
		this.id = id;
		this.nombre=nombre;
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Hascode & Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pruebas2 other = (Pruebas2) obj;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	//ToString
	@Override
	public String toString() {
		return "Pruebas2 [id=" + id + ", nombre=" + nombre + "]";
	}
		
}
