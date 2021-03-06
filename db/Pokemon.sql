-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generaciÃ³n: 09-05-2022 a las 09:18:29
-- VersiÃ³n del servidor: 10.4.24-MariaDB
-- VersiÃ³n de PHP: 8.1.5
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";
--
-- Base de datos: `pokemon`
--
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `combate`
--
CREATE TABLE `combate` (
  `id_rival` int(20) NOT NULL,
  `id_entrenador` int(20) NOT NULL,
  `id_combate` int(20) NOT NULL,
  `fec_comienzo` date NOT NULL,
  `fec_final` date NOT NULL,
  `num_pokemon_ko_rival` int(20) NOT NULL,
  `num_pokemon_ko` int(20) NOT NULL,
  `pokedollares` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `entrenador`
--
CREATE TABLE `entrenador` (
  `id_entrenador` int(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `equipo` varchar(20) NOT NULL,
  `caja_pokemon` int(20) NOT NULL,
  `objetos` varchar(20) NOT NULL,
  `pokedollares` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `estado`
--
CREATE TABLE `estado` (
  `id_estado` int(20) NOT NULL,
  `nom_estado` varchar(20) NOT NULL,
  `nom_turnos` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `mejora`
--
CREATE TABLE `mejora` (
  `id_mejora` int(20) NOT NULL,
  `nom_mejora` varchar(20) NOT NULL,
  `cant_mejora` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `movimiento`
--
CREATE TABLE `movimiento` (
  `id_estado` int(20) NOT NULL,
  `id_mejora` int(20) NOT NULL,
  `id_movimiento` int(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `tipo_pokemon` varchar(20) NOT NULL,
  `tipo_movimiento` varchar(20) NOT NULL,
  `nivel` int(20) NOT NULL,
  `potencia` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `movimiento_pokemon`
--
CREATE TABLE `movimiento_pokemon` (
  `id_pokemon` int(20) NOT NULL,
  `id_movimiento` int(20) NOT NULL,
  `lista_mov` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `pokedex`
--
CREATE TABLE `pokedex` (
  `num_pokedex` int(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `imagen` int(20) NOT NULL,
  `sonido` varchar(20) NOT NULL,
  `tipo1` varchar(20) NOT NULL,
  `tipo2` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `pokemon_entrenador`
--
CREATE TABLE `pokemon_entrenador` (
  `num_pokedex` int(100) NOT NULL,
  `id_entrenador` int(50) NOT NULL,
  `id_pokemon` int(50) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `mote` varchar(15) NOT NULL,
  `nivel` int(100) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `vitalidad` int(20) NOT NULL,
  `velocidad` int(20) NOT NULL,
  `fertilidad` int(20) NOT NULL,
  `ataque` int(20) NOT NULL,
  `at_especial` int(20) NOT NULL,
  `defensa` int(20) NOT NULL,
  `def_especial` int(20) NOT NULL,
  `estamina` int(20) NOT NULL,
  `experiencia` int(50) NOT NULL,
  `objeto` varchar(20) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `lista_movimientos` varchar(30) NOT NULL,
  `id_equipo` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
--
-- Ãndices para tablas volcadas
--
--
-- Indices de la tabla `combate`
--
ALTER TABLE `combate`
  ADD PRIMARY KEY (`id_combate`),
  ADD UNIQUE KEY `id_rival` (`id_rival`),
  ADD UNIQUE KEY `id_entrenador` (`id_entrenador`);
--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`id_entrenador`);
--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`id_estado`);
--
-- Indices de la tabla `mejora`
--
ALTER TABLE `mejora`
  ADD PRIMARY KEY (`id_mejora`);
--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`id_movimiento`),
  ADD UNIQUE KEY `id_estado` (`id_estado`),
  ADD UNIQUE KEY `id_mejora` (`id_mejora`);
--
-- Indices de la tabla `movimiento_pokemon`
--
ALTER TABLE `movimiento_pokemon`
  ADD PRIMARY KEY (`id_pokemon`),
  ADD UNIQUE KEY `id_pokemon` (`id_pokemon`),
  ADD UNIQUE KEY `id_movimiento` (`id_movimiento`);
--
-- Indices de la tabla `pokedex`
--
ALTER TABLE `pokedex`
  ADD PRIMARY KEY (`num_pokedex`);
--
-- Indices de la tabla `pokemon_entrenador`
--
ALTER TABLE `pokemon_entrenador`
  ADD PRIMARY KEY (`id_pokemon`);
COMMIT; 
go
