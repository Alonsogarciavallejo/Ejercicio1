    import java.util.ArrayList;
import java.util.List;

public class Ejercicios {

        public static void main(String[] args) {
           
        }
    
        //Ejercicio1
        public static int suma(int n) {
            int suma = 0;
            for (int i = 0; i <= n; i++) {
                suma += i;
            }
            return suma;
        }
    
        //Ejercicio2
        public static int factorial(int n) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    
        //Ejercicio3
        public static int potencia(int base, int exponente) {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    
        //Ejercicio4
        public static int sumaLista(List<Integer> lista) {
            int suma = 0;
            for (int num : lista) {
                suma += num;
            }
            return suma;
        }
    
        //Ejercicio5
        public static double mediaLista(List<Integer> lista) {
            return (double) sumaLista(lista) / lista.size();
        }
    
        //Ejercicio6
        public static double desviacionEstandar(List<Integer> lista) {
            double media = mediaLista(lista);
            double sumatoria = 0;
            for (int num : lista) {
                sumatoria += Math.pow(num - media, 2);
            }
            return Math.sqrt(sumatoria / lista.size());
        }
    
        //Ejercicio7
        public static int sumaPares(int n) {
            int suma = 0;
            for (int i = 2; i <= n; i += 2) {
                suma += i;
            }
            return suma;
        }
    
        //Ejercicio8
        public static int sumaParesLista(List<Integer> lista) {
            int suma = 0;
            for (int num : lista) {
                if (num % 2 == 0) {
                    suma += num;
                }
            }
            return suma;
        }
    
        //Ejercicio9
        public static List<Integer> obtenerListaPares(List<Integer> lista) {
            List<Integer> listaPares = new ArrayList<>();
            for (int num : lista) {
                if (num % 2 == 0) {
                    listaPares.add(num);
                }
            }
            return listaPares;
        }
    
        //Ejercicio10
        public static List<Integer> listaPares(int n) {
            List<Integer> listaPares = new ArrayList<>();
            for (int i = n; i >= 2; i -= 2) {
                listaPares.add(i);
            }
            return listaPares;
        }
    
        //Ejercicio11
        public static int productoEscalar(List<Integer> lista1, List<Integer> lista2) {
            int producto = 0;
            for (int i = 0; i < lista1.size(); i++) {
                producto += lista1.get(i) * lista2.get(i);
            }
            return producto;
        }
    }