public class Cliente{
    private String nombre;
    private String dni;
    private String email;

    public Cliente(String nombre,String dni,String email){
        this.nombre=nombre;
        this.dni=dni;
        this.email=email;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDNI(){
        return dni;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Cliente otro=(Cliente) obj;
        return this.dni.equals(otro.dni);

    }

    @Override
    public String toString(){
        return nombre +"(" + dni +") - " +email;
    }
}