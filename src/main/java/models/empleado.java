package models;

import org.hibernate.annotations.JoinColumnOrFormula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")


public class empleado {
	@Id
	@Column  ( name = "IdEmpleado")
	private int IdEm;
	@Column  ( name = "Apellidos")
	private String apellidos;
	@Column  ( name = "Nombres")
	private String nombres;
	@Column  ( name = "Edad")
	private int edad;
	@Column  ( name = "Sexo")
	private String sexo;
	@Column  ( name = "Salario")
	private Double salario;
	
	public empleado() {
		super();
	}

    public empleado(String apellidos, String nombres, int edad, String sexo, Double salario) {
		super();
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	
	public int getIdEm() {
		return IdEm;
	}
	public void setIdEm(int idEm) {
		IdEm = idEm;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "empleado [IdEm=" + IdEm + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad=" + edad
				+ ", sexo=" + sexo + ", salario=" + salario + "]";
	}


	

	
	
	
	
	
	
	

	
	
}


