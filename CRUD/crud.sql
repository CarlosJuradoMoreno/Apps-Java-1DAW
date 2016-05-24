-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-05-2016 a las 12:26:56
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `crud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `campos`
--

CREATE TABLE `campos` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `capacidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `campos`
--

INSERT INTO `campos` (`codigo`, `nombre`, `capacidad`) VALUES
(1, 'Bateria16', 40),
(2, 'Chemant', 50),
(3, 'TBA', 50),
(4, 'CBA', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `apellido` varchar(80) NOT NULL,
  `replica` varchar(80) NOT NULL,
  `campo` int(11) NOT NULL,
  `sancion` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`codigo`, `nombre`, `apellido`, `replica`, `campo`, `sancion`) VALUES
(1, 'manuel', 'carrasco', 'ak4', 1, 0),
(3, 'pepito', 'gonzalez', 'm4', 3, 0),
(4, 'edu', 'soto', 'mp5', 4, 0),
(7, 'Juan', 'sanchez', 'pistola', 2, 0),
(9, 'Miguelito', 'Reyes', 'L96', 4, 0),
(10, 'manolito', 'rodriguez', 'ump', 1, 0),
(11, 'aaa', 'aaa', 'aaa', 4, 1),
(12, 'carlos', 'juanes', 'kk777', 1, 2),
(13, 'Carlos', 'Jurado', 'ka4', 1, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `campos`
--
ALTER TABLE `campos`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
