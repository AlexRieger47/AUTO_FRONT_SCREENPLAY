Feature: Flujo de inicio de sesion y creacion de tickets

	Como usuario del sistema de tickets
	Quiero autenticarme y registrar nuevos tickets
	Para dar seguimiento a solicitudes de soporte

	Scenario: Inicio de sesion exitoso y acceso al modulo de tickets
		Given existe un usuario de prueba previamente registrado en SistemaTickets
		When el usuario inicia sesion en SistemaTickets
		Then el usuario visualiza el listado de tickets

	Scenario: Inicio de sesion fallido con credenciales invalidas
		Given el usuario se encuentra en la pagina de inicio de sesion
		When el usuario intenta iniciar sesion con credenciales invalidas
		Then el sistema muestra un mensaje de credenciales invalidas

	Scenario: Acceso a tickets sin sesion activa
		Given el usuario no ha iniciado sesion en SistemaTickets
		When el usuario intenta acceder directamente al modulo de tickets
		Then el sistema redirige al usuario a la pagina de inicio de sesion

	Scenario: Acceso a notificaciones de admin con un usuario normal
		Given el usuario se encuentra autenticado en el modulo de tickets
		When el usuario intenta acceder directamente al modulo de notificaciones
		Then el sistema redirige al usuario al listado de tickets

	Scenario: Creacion de ticket y visualizacion en el listado
		Given el usuario se encuentra autenticado en el modulo de tickets
		When el usuario registra un nuevo ticket con titulo y descripcion validos
		Then el ticket queda disponible en el listado de tickets
