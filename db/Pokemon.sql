-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-05-2022 a las 13:13:13
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

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
  `pokedollares_ganados` int(30) NOT NULL
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
  `potencia` int(20) NOT NULL,
  `estamina` int(10) NOT NULL
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
  `tipo` enum('AGUA','FUEGO','PLANTA','VOLADOR','ELECTRICO','TIERRA','BICHO') NOT NULL,
  `peso` double NOT NULL,
  `altura` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pokedex`
--

INSERT INTO `pokedex` (`num_pokedex`, `nombre`, `tipo`, `peso`, `altura`) VALUES
(4, 'Charmander', 'FUEGO', 8.5, 0.6),
(7, 'Squirtle', 'AGUA', 9, 0.5),
(10, 'Caterpie', 'BICHO', 2.9, 0.3),
(21, 'Spearow', 'VOLADOR', 2, 0.3),
(25, 'Pikachu', 'ELECTRICO', 6, 0.4),
(27, 'Sandshrew', 'TIERRA', 12, 0.6),
(154, 'Meganium', 'PLANTA', 100.5, 1.8),
(231, 'Phanpy', 'TIERRA', 33.5, 0.5);

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
  `vitalidad` int(20) NOT NULL,
  `velocidad` int(20) NOT NULL,
  `fertilidad` int(20) NOT NULL,
  `ataque` int(20) NOT NULL,
  `at_especial` int(20) NOT NULL,
  `defensa` int(20) NOT NULL,
  `def_especial` int(20) NOT NULL,
  `experiencia` int(50) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `lista_movimientos` varchar(30) NOT NULL,
  `id_equipo` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
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
COMMIT;
