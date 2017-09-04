import Foundation

class Busquedas {

    var vector: [Int] = [] //atributo de la clase
    
    func fetch(n: Int) -> Int { //Se hace algo parecido a la interfaz, no hay clases abstractas en swift 
        preconditionFailure("This method must be overridden")
    }
    
    func setV(v: [Int]){ //Setter del vector
        self.vector = v
    }
    
    func randomV(n:Int) -> [Int] { //Creacion del vector con datos aleatorios
        var v:[Int] = [Int](n)
        
        for var i=0; i<v.count; ++i{
            v.append(Int(arc4random_uniform(100)))
        }
        
        return v
    }
    
    func getV() -> [Int] { //Getter del vector
        return self.vector
    }
    
    func showV() { //Se muestra el valor de cada posicion del arreglo 
        let count:Int = self.vector.count-1
        var string = "["
        for(index) in 0...count{
            string+=String(self.vector[index])
            string+=","
        }
        string = String(string.characters.dropLast()) + "]"
        print(string)
    }
    
    
    
    func showF(p: Int) { //Muestra la posicion del numero deseado
        print("El numero se encuentra en la posición " + p)
    }
    
}

protocol Seleccion(){
    func seleccion()
}

class Secuencial: Busquedas { //Algoritmo de busqueda secuencial
    override func fetch(n: Int) -> Int {
        let count:Int = self.vector.count //Se establece una constante que sera el limite para la busqueda
        for i in 0...count { //Desde el contador en 0 hasta cuando es 1 menor que el tamaño del arreglo 
            if(self.vector[i]==n) { //Si el numero se encuentra en esa posicion
            return i                //regresar la posicion
            }
        }
        return -1 //De otro modo, regresar un -1, inexistente
    }
}

class Binaria: Busquedas,Seleccion {
    override func fetch(n: Int) -> Int { //Implementacion de nuestro "metodo abstracto"
        var centro: Int = 0 //Variables con los limites de nuestra busqueda
        var inicio: Int = 0
        var fin: Int = self.vector.count-1
        var valCentro;
        while(inicio<=fin) { //Mientras que inicio sea menor que fin se hara la busqueda
            centro=(inicio+fin)/2//Se calcula la posicion del centro
            valCentro = self.vector[centro]
            if(valCentro == n) {   //Si en este centro se encuentra el valor
                return centro //regresa posicion del centro 
            }
            
            if(n < valCentro) { //Si el numero es menor que el valor del centro
                fin = centro - 1 //Ahora el fin sera el valor del centro menos 1
            } else {
                inicio = centro + 1 //De otro modo el inicio sera el valor del centro mas 1
            }
        }
        return -1
    }
    
      
    func seleccion (v: [Int]) { //Metodo de ordenamiento por seleccion
	var menor: Int
	var auxiliar: Int

	for i in 0 ..< v.count {
		menor = i 
		for j in i+1..<v.count{
			if v[j] < v[menor] {
				menor = j
			}
		}
		auxiliar = v[i]
		v[i] = v[menor]
		v[menor] = auxiliar
        
	}
    }
	
    func insertion(a:[Int]){
	    var temp
	    var j
	    for i in 0..<a.count {
		    temp = a[i]
		    j=i-1
		    
		    while j >= 0 && a[j] > temp {
			    a[j+1] = a[j]
			    j--
		    }
		    a[j+1] = temp
	    }
    }
	
    func bubble(a:[Int]) {
	    var temp
	    for i in 1...a.count {
		    for j in 0...a.count-1{
			    if a[j]>a[j+1]{
				    temp = a[j]
				    a[j] = a[j+1]
				    a[j+1] = temp
			    }
		    }
	    }
    }
	
    func quickSort(a:[Int],inicio:Int,fin:Int){
	    var i = inicio
	    var j = fin 
	    let pivote = a[(inicio+fin)/2]
	    var temp = 0
	    
	    repeat {
		    while a[i] < pivote {
			    i++		    
		    }
		    while a[j] > pivote {
			    j--		
		    }
		    if i <= j {
			    temp = a[i]
			    a[i] = a[j]
			    a[j] = temp
			    i++
			    j--
		    }
	    } while (i<=j)
	    if (inicio < j) {
		    quickSort(inicio:inicio,fin:j)
	    }
	    if (i < fin) {
		    quickSort(inicio:i,fin:fin)
	    }
    }
	
    func mergeSort(vector: [Int]) -> [Int] {
	    if (vector.count <=1) {
		    return vector
	    }
	    var izq: [Int] = [Int]()
	    var der: [Int] = [Int]()
	    
	    for i in stride(from: 0, to (vector.count - 1), by: 1) { 
		    if (i < (vector.count / 2) {
			    izq.append(vector[i])
		    } else {
			    der.append(vector[i])
		    }
	    }
		    izq = mergeSort(vector: izq)
		    der = mergeSort(vector: der)
		    return merge(izq: &izq, der: &der)
    }
	
    func merge(izq: [Int], der: [Int]) -> [Int] {
	    var res: [Int] = [Int]()
	    while ((!izq.isEmpty)&&(!der.isEmpty)) {
		    if (izq.first! >= der.first!) {
			    res.append(izq.first!)
			    izq.removeFirst()
		    } else {
			    result.append(der.first!)
			    derecha.removeFirst()
		    }
	    }
	    while (!izq.isEmpty) {
		    result.append(izq.first!)
		    izq.removeFirst()
	    }
	    while (!der.isEmpty) {
		    result.append(der.first!)
		    der.removeFirst()
	    }
	    return res
    }
}


var os: secuencial = secuencial()
os.setV(v: os.randomV(n: 5))
os.showV()
os.showF(p: os.fetch(p: 3))

var os: binaria = binaria()
os.setV(v: os.randomV(n: 5))
os.showV()
//os.seleccion(v)
os.mergeSort(v)
os.showV()
os.showF(p: os.fetch(p: 3))
os.showF(p: os.fetch(p: 20))
