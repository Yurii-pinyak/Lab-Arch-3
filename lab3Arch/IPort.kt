package lab3Arch

interface IPort {
    fun incomingShip(s: Ship)
    fun outgoingShip(s: Ship)
}