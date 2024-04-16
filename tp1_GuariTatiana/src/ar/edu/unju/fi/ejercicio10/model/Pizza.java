package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    private static final int ADICIONAL_20 = 500;
    private static final int ADICIONAL_30 = 750;
    private static final int ADICIONAL_40 = 1000;

    public Pizza() {
        // Constructor por defecto
    }

    public int getDiametro() {
        return diametro;
    }

	public void setDiametro(int diametro) {
		
		 this.diametro = diametro;
	}

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    
    public void calcularPrecio() { 
	    double precioBase = 0;
	    double precioEspecial = 0;

	    switch (diametro) {
	        case 20:
	            precioBase = 4500;
	            if (ingredientesEspeciales) {
	                precioEspecial = ADICIONAL_20;
	            }
	            break;
	        case 30:
	            precioBase = 4800;
	            if (ingredientesEspeciales) {
	                precioEspecial = ADICIONAL_30;
	            }
	            break;
	        case 40:
	            precioBase = 5500;
	            if (ingredientesEspeciales) {
	                precioEspecial = ADICIONAL_40;
	            }
	            break;
	        default:
	        	System.out.print("ERROR ");
	            break;
	    }
	    
	    precio = precioBase + precioEspecial;
	}
	

    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * Math.pow(radio, 2);
        }


}
