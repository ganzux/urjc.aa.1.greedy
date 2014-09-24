Objetivo

El objetivo de la práctica es profundizar en el conocimiento de la implementación práctica de los algoritmos voraces.

Carácter
La práctica es voluntaria (aunque el alumno debe obtener una calificación de 5 en las prácticas para aprobar). Puede realizarse individualmente o en pareja.

Enunciado
Sea un conjunto A de n actividades {a0, a1, …, an-1} que necesitan utilizar un recurso común, p.ej. una sala de reuniones. El recurso sólo puede ser usado por una actividad en cada momento. Cada actividad tiene un instante de comienzo ci y un instante de finalización fi, donde 0ci<fi<. Si se selecciona la actividad ai, se desarrolla en el intervalo semiabierto de tiempo [ci,fi). Las actividades ai y aj son compatibles si sus intervalos [ci,fi) y [cj,fj) no se solapan, es decir, si cifj o cjfi.
El problema de selección de actividades consiste en determinar un subconjunto de actividades compatibles cuya cardinalidad sea máxima.
Por ejemplo, sea el siguiente conjunto de actividades:
i 0 1 2 3 4 5 6 7 8 9
ci 11 24 7 0 5 12 23 2 16 15
fi 21 29 8 3 11 25 24 18 20 24
Un subconjunto de actividades compatibles es {a3,a4,a9,a1}. Sin embargo, no es un subconjunto de cardinalidad máxima, como lo son {a3,a4,a0,a6,a1} y {a3,a2,a8,a6,a1}.

Dos funciones óptimas de selección de las actividades son: orden creciente de fin u orden decreciente de inicio. Suponiendo que las actividades ya están ordenadas según alguno de estos dos criterios, el algoritmo en pseudocódigo puede quedar así:
 public static boolean[] selecActividades (int[] c, int[] f) {
 boolean[] s = new boolean[c.length];
 s[0] = true;
 int i = 0;
 for (int j=1; j<c.length; j++) {
 if (<<actividades i, j no se solapan>>) {
 s[j] = true;
 i = j;
 }
 else
 s[j] = false;
 }
 return s;
 }
 donde, dados dos vectores c y f con los instantes de comienzo y fin, el método devuelve un vector de booleanos que identifica las actividades seleccionadas.
Se desea:
1. Completar el algoritmo anterior, usando una de las dos estrategias óptimas.
2. Reimplementarlo de forma que pueda utilizarse en situaciones reales, es decir, sin suponer que los datos de entrada están ordenados.
Por ejemplo, sean las actividades del enunciado anterior. Si se elige orden creciente de fin, las actividades se examinan en el orden indicado por los tonos de la figura (de oscuro a claro):es decir, las actividades se irán examinando de izquierda a derecha en el siguiente orden:
i 3 2 4 7 8 0 9 6 5 1
ci 0 7 5 2 16 11 15 23 12 24
fi 3 8 11 18 20 21 24 24 25 29
quedando seleccionadas las 5 actividades {3,2,8,6,1}. (El resto de actividades se solapan con las seleccionadas anteriormente.) Por tanto, el algoritmo debe devolver un vector de booleanos con sus elementos 3, 2, 8, 6 y 1 a true y los demás elementos a false.

Entrega
El alumno debe entregar un informe elaborado siguiendo el índice detallado a continuación. El informe debe enviarse por medio del apartado de Evaluación del campus virtual. Si se tienen dificultades, puede enviarse por el correo del campus virtual con el asunto “Práctica 1”. El plazo de entrega del informe es el jueves 25 de septiembre de 2014, incluido.

Informe
El alumno debe entregar un informe con la siguiente estructura:
1. Algoritmo original ejecutable. El pseudocódigo contenido en el algoritmo voraz delenunciado debe concretarse mediante código Java compilable y ejecutable. Para ello,se pide:
   a. Elección de una de las funciones de selección óptimas y escritura en Java de la condición del if del algoritmo, junto con un diagrama de tiempos que aclare la condición.
   b. Código Java resultante.2. Algoritmo final. Código del algoritmo voraz tras tener en cuenta que las actividades no están ordenadas. Conviene explicar o incluir comentarios sobre las modificaciones realizadas sobre el algoritmo original ejecutable.
2. Algoritmo final. Código del algoritmo voraz tras tener en cuenta que las actividades no están ordenadas. Conviene explicar o incluir comentarios sobre las modificaciones realizadas sobre el algoritmo original ejecutable.
3. Conclusiones. Se explican las conclusiones obtenidas tras realizar la práctica. Estas conclusiones pueden consistir en una valoración de la técnica voraz o cualquier comentario sobre la práctica. Por ejemplo, pueden describirse las incidencias que han dificultado la realización de la práctica, sus aspectos más atractivos o más difíciles, sugerencias sobre cómo mejorar la práctica, etc.

Evaluación
Se evaluará la calidad del algoritmo desarrollado y la claridad del informe.
