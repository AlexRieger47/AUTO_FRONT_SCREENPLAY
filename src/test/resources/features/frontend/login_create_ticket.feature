Feature: Flujo de inicio de sesion y creacion de tickets

	Como usuario del sistema de tickets
	Quiero autenticarme y registrar nuevos tickets
	Para dar seguimiento a solicitudes de soporte

	Scenario: Inicio de sesion exitoso y acceso al modulo de tickets
		Given existe un usuario registrado con credenciales validas en SistemaTickets
		When el usuario inicia sesion en SistemaTickets
		Then el usuario visualiza el listado de tickets

	Scenario: Creacion de ticket y visualizacion en el listado
		Given el usuario se encuentra autenticado en el modulo de tickets
		When el usuario registra un nuevo ticket con titulo y descripcion validos
		Then el ticket queda disponible en el listado de tickets
