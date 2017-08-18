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


class Secuencial: Busquedas { //Algoritmo de busqueda secuencial
    override func fetch(n: Int) -> Int {
        let count:Int = self.vector.count-1 //Se establece una constante que sera el limite para la busqueda
        for i in 0...count { //Desde el contador en 0 hasta cuando es 1 menor que el tamaño del arreglo 
            if(self.vector[i]==n) { //Si el numero se encuentra en esa posicion
            return i                //regresar la posicion
            }
        }
        return -1 //De otro modo, regresar un -1, inexistente
    }
}

class Binaria: Busquedas {
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
    
    func seleccion (vector: [Int]) {
        var menor
        var auxiliar
        
        for i in 0...count {
            menor = i
            for j in 1...count {
                
            }
        }
    }
   
}



var os: secuencial = secuencial()
os.setV(v: os.randomV(n: 5))
os.showV()
os.showF(p: os.fetch(p: 20))
