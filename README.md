# **UNIVESIDAD POLITÉCNICA SALESIANA**

## **Comparación simulacion de algoritmos de ordenamiento**

### **Estudiante**

- Edwin Patricio Pintado Reinoso

---

### **Objetivo**

Comparar el rendimiento de metodos de ordenacion (Insertion sort y QuickSort), utilizando arreglos de direrentes tamaños y escenarios posibles.

### **Estructura de la práctica**

src/   

- app/   

       app.java

- controllers/

       SortPersonaMethods.java

- models/

       Persona.java

       Resultado.java

- utils/

       Benchmarking.java

--- 

### **Actividades desarrolladas**

- **App:** Creacion de la clase principal en la que se generan los arreglos y se ejecutan los metodos con diferentes tamaños y escenarios posibles.

- **SortPersonaMethods:** Creacion de la clase en la que se encuentran los metodos de ordenamiento con las diferentes validaciones.

- **Persona:** Crecion de la clase que se encargara de crear los objetos que posterioremente seran ordenados, ademas de contener un metodo llamado criterio de ordenamiento, el cual devolvera un entero, que sera la convinacion de la edad y el nombre.

- **Resulatdos:** Creacion de la clase que almacenara la informacion de cada medicion, Ademas de contar con su metodo toString que nos ayuda en la impresion del resultado.

- **Benchmarking:** Creacion de la clase que se encargara en medir el tiempo de ejecución de cada algoritmo.

### **Resultados Obtenidos**

**Tabla1. Escenario1: "Arreglo completamente desordenado"**

| Tamaño de muestra | Tiempo Inserción Sort | Tiempo Quick Sort | Algoritmo más rápido | Observacion | 
|-------------------|------------------|-------------------|----------------------|-------------| 
| 10.000 | 978.4337 ms | 15.5297 ms | Quick Sort | Inserción Sort es demaciado lento por tener que incertar cada elemento en su pocicion correcta, mientras que Quick Sort divide el arreglo en subarreglos cada vez mas pequeños, por eso realiza menos comparaciones. | 
| 50.000 | 31931.7913 ms | 64.85 ms | Quick Sort | En arreglos grandes Quick Sort es mas eficiente por dividir el arreglo en subarreglos cada vez mas pequeños. | 
| 100.000 | 158192.6281 ms | 167.2413 ms | Quick Sort | El tiempo de Inserción Sort crece de manera exponencial mientras que Quick Sort lo hace de manera mas controlada y preogresiva, tambien crece pero no explota como en el caso de Inserción Sort.  | 

---

**Tabla2. Escenario2: "Arreglo ordenado más una nueva persona"**

| Tamaño de muestra | Tiempo Inserción Sort | Tiempo Quick Sort | Algoritmo más rápido | Observacion | 
|-------------------|------------------|-------------------|----------------------|-------------| 
| 10.001 | 1.0992 ms | 822.9675 ms | Inserción Sort | Al parecer en arreglos ya ordenados Quick Sort es mucho menos eficiente que Inserción Sort, ya que este ultimo frente a un arreglo que ya esta ordenado y que se le agrega un solo dato nuevo solo debera hacer entre 1 a pocas comparaciones.  | 
| 50.001 | 8.0741 ms |  Error | Inserción Sort | Aparición del error: Exception in thread "main" java.lang.StackOverflowError, que significa que la pila de llamadas de java se lleno, es decir que hubo una llamada excesiva de metodos que llenaron la pila de ejecucion. Progresivamente nos salta este mensaje: at controller.SortPersonaMethods.quickSort(SortPersonaMethods.java:21), el cual nos indica la clase, el metodo y la fila en la que estuvo el error. | 
| 100.001 | 13.9001 ms | Error | Inserción Sort | Al leer la clase me di cuenta que el posible error es que tomamos al ultimo valor como pivote y como este tiene a una gran cantidad de datos menores a su izquierda y muy pocos a su derecha, este creara divisiones con partes gigantes y otras casi vacias haciendo que el metodo se llame de manera recursiva muchas veces, y que el error prosigua al aumentar aun mas datos ordenados, por lo que se puede deducir que en arreglos casi ordenados y de una extencion conciderable quickSort no es el metodo mas optimo, por lo menos no con el pivote empleado. | 

---

### **Análisis**

**¿Qué algoritmo fue más rápido en el esenario desordenado?**

- El algoritmo más eficiente cuando los datos estaban desordenasos fue el QuickSort ya que este usa la estratgia  de divide y venceras, es decir que este a diferencia de Insertion Sort no arregla un todo, sino sub arreglos más pequeños, por lo cual reduce las comparaciones necesarias para ordenar el arreglo por lo cual sera mas rapido.

**¿Qué algoritmo fue más rápido en el esenario casi ordenado?**

- El algoritmo más eficiente cuando los datos estaban casi oredenados fue el Insertion Sort, ya que los datos ya estaban casi ordenados, haciendo que el metodo solo deba hacer unas pocas comparaciones para buscar el lugar en el que va a ingresar el nuevo dato y poder incertarlo en su lugar correspondiente.

**¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?**

- En ambos aumento el tiempo de ejecucion, pero no de la misma manera, y esto se debio a su comportamieno, ya que mientras Insertion Sort compara e inserta datos todo dentro del mismo arreglo, QuickSort lo divide para ordenarlos por partes mas pequeñas. 

**¿Por qué Insertion puede mejorar cuando el arreglo ya esta casi ordenado?**

- Puede mejorar ya que necesitara de menos desplazamientos para lograr ordenar el arreglo, esto ya que los valores en un arreglo ordenado o casi ordenado ya casi estan en su posicion final.


**¿Por qué QuickSort suele ser mejor cuando los datos estan muy desordenados?**

- Porque esto hace que las divisiones del arreglo sean mas equilibras alrededor del pivote, y no suceda como en nuestro caso que por elegir al ultimo valor como pivote en un arreglo casi ordenado provoco que este creara dividiones que en vez de ser similares son muy desbalanciadas, ya que como el arreglo estaba casi ordenado existiran divisiones gigantezcas a la izquierda y con muy escasos numeros a la derecha, lo que aumentó las llamadas recursivas del metodo y por lo tanto empeoro su comportamiento.

---

### **Conclusiones**

1. La estrategia de divide y venceras de QuickSort destaca en arreglos desordenados ya que divide el arreglo en subarreglos alrededor de un pivote para luego ordenarlos de manera independiente, reduciendo las comparaciones y el tiempo de ejecucion. 

2. La cantidad de valores a analizar siempre va a aumentar el tiempo de ejecucion de los algoritmos, sin importar cual se decida usar. 

3. En datos casi ordenados el algoritmo de Insertion Sort es el que optuvo un tiempo menor ya que este solo necesita unos pocos desplazamientos y comparaciones cuando los datos estan casi en su posicion correcta.