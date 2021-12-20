var compu = 0
var jugador = 0
fun main() {
  print("elige piedra, papel o tijera: ")
  val usuario = readLine()
  if (usuario == "piedra"||usuario == "papel"||usuario == "tijera")
    println("tu lelección: $usuario")
  else
    println("no ha elegido una opción válida")   
  val opciones: List<String> = listOf("piedra","papel","tijera")
  val aleatorio = opciones.random()
  println("elección de compu: $aleatorio") 
  if(usuario == aleatorio)
    println("empate")  
  if(usuario == "piedra" && aleatorio == "papel"){
    println("Has perdido!")
    compu++
  }
  else if (usuario == "piedra" && aleatorio == "tijera"){
    println("Has ganado!")
    jugador++
    }
  if(usuario == "papel" && aleatorio == "tijera"){
    println("Has perdido!")
    compu++
  }
  else if (usuario == "papel" && aleatorio == "piedra"){
    println("Has ganado!")
    jugador++
    }
  if(usuario == "tijera" && aleatorio == "piedra"){
    println("Has perdido!")
    compu++
  }
  else if (usuario == "tijera" && aleatorio == "papel"){
    println("Has ganado!")     
    jugador++
  }
  repetir ()
}
fun repetir(){
  print("Desea continuar jugando? (y/n): ")
  val usuario= readLine()
  if (usuario=="y"){
    main()
  }else if (usuario=="n"){
    println("Resultado")
    println("Usuario: $jugador")
    println("Compu: $compu")
  }
}